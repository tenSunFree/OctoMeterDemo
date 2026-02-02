package com.rwmobi.kunigami

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * MainActivity: Hosts the Activity that contains the Compose app.
 *
 * - Enables the official Android 12+ Splash Screen API for the launch screen.
 * - Enables edge-to-edge mode so content can be drawn behind the status and navigation bars.
 * - Synchronizes status bar and navigation bar appearance in Compose using SystemBarStyle.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // This enables the official Splash Screen API introduced in Android 12 (API 31).
        // It displays the app icon during startup and handles transition animations.
        installSplashScreen()
        super.onCreate(savedInstanceState)
        // This enables the recommended Android "edge-to-edge" (fullscreen) mode.
        // It lets app content be drawn behind the Status Bar and Navigation Bar for a more immersive experience.
        enableEdgeToEdge()
        setContent {
            App(
                androidStatusBarSideEffect = { statusBarColor, isDarkTheme ->
                    SideEffect {
                        // Use the officially recommended SystemBarStyle control.
                        // This is a guideline enforced starting in Android 15. It tells the system:
                        // "My app is a single canvas and the status bar is just a transparent/semi-transparent layer on top."
                        // It handles not only colors but also the navigation bar and system insets.
                        enableEdgeToEdge(
                            statusBarStyle = if (isDarkTheme) {
                                SystemBarStyle.dark(statusBarColor)
                            } else {
                                // In light mode you usually provide a second parameter as a fallback for dark-theme detection
                                SystemBarStyle.light(statusBarColor, statusBarColor)
                            },
                            // Sync handling of the bottom navigation bar for visual consistency
                            navigationBarStyle = SystemBarStyle.auto(
                                android.graphics.Color.TRANSPARENT,
                                android.graphics.Color.TRANSPARENT,
                            ) { isDarkTheme },
                        )
                    }
                },
            )
            // App(
            //     androidStatusBarSideEffect = { statusBarColor, isDarkTheme ->
            //         val view = LocalView.current
            //         if (!view.isInEditMode) {
            //             SideEffect {
            //                 val window = (view.context as Activity).window
            //                 @Suppress("DEPRECATION")
            //                 window.statusBarColor = statusBarColor
            //                 WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = isDarkTheme
            //             }
            //         }
            //     },
            // )
        }
    }
}

@Preview
@Composable
private fun AppAndroidPreview() {
    App()
}
