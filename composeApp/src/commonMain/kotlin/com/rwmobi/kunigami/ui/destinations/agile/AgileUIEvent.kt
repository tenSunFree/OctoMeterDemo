package com.rwmobi.kunigami.ui.destinations.agile

import androidx.compose.runtime.Immutable

@Immutable
data class AgileUIEvent(
    val actions: AgileActions, // Core business actions delegated to the protocol
    val onScrolledToTop: () -> Unit, // Navigation UI-specific actions reserved as lambdas
    val onNavigateToAccountTab: () -> Unit,
    val onShowSnackbar: suspend (message: String) -> Unit,
)
// @Immutable
// data class AgileUIEvent(
//     val onRefresh: () -> Unit,
//     val onStartLiveConsumptionUpdates: () -> Unit,
//     val onStopLiveConsumptionUpdates: () -> Unit,
//     val onErrorShown: (errorId: Long) -> Unit,
//     val onScrolledToTop: () -> Unit,
//     val onNavigateToAccountTab: () -> Unit,
//     val onShowSnackbar: suspend (message: String) -> Unit,
// )
