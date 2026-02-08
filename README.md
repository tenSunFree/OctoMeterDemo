# OctoMeterDemo

---

## Introduction  

Source of inspiration:  

OctoMeter  
https://github.com/ryanw-mobile/OctoMeter  

This project is for learning and technical practice. 

---

## Preview  

<p align="left">
  <img src="" width="460"/>
</p> 

<p align="left">
  <img src="" width="460"/>
</p> 

---

## Features   

---

## Tech Stack  

- Kotlin Multiplatform (KMP) + Compose Multiplatform  
  Cross-platform Kotlin (shared logic + Compose UI across Android, iOS, and Desktop—Windows/macOS/Linux)  
- Ktor  
  Kotlin networking (HTTP client/server; great for KMP shared APIs)  
- Apollo Kotlin  
  GraphQL client for Kotlin/KMP (type-safe models, codegen from schema, supports queries/mutations/subscriptions) 

---

## Credits  
  
This project is created for independent learning and demonstration purposes.
Special thanks to the original author for their open-source contribution.

---

## Notes  

Image resources are for learning and purposes only. Please do not use them for commercial purposes. 

If there is any infringement, please contact me for removal. Thank you.  

---

## License  

This repository is intended for learning and demonstration.  

If you plan to open-source it, please choose a license and confirm third-party asset usage rights.  

---

## Project Structure  

```
OctoMeterDemo
├─ .editorconfig
├─ baselineprofile
│  └─ src
│     └─ main
│        ├─ AndroidManifest.xml
│        └─ java
│           └─ com
│              └─ rwmobi
│                 └─ kunigami
│                    └─ baselineprofile
│                       ├─ BaselineProfileGenerator.kt
│                       └─ StartupBenchmarks.kt
├─ composeApp
│  ├─ compose-desktop.pro
│  ├─ composeApp.podspec
│  ├─ icons
│  │  ├─ ic_launcher_linux.png
│  │  ├─ ic_launcher_macos.icns
│  │  ├─ ic_launcher_macos_32x32.png
│  │  ├─ ic_launcher_macos_64x64.png
│  │  └─ ic_launcher_windows.ico
│  ├─ proguard-rules.pro
│  ├─ schemas
│  │  └─ com.rwmobi.kunigami.data.source.local.database.OctometerDatabase
│  │     ├─ 1.json
│  │     ├─ 2.json
│  │     ├─ 3.json
│  │     ├─ 4.json
│  │     └─ 5.json
│  └─ src
│     ├─ androidInstrumentedTest
│     │  └─ kotlin
│     │     └─ com
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              └─ ui
│     │                 ├─ components
│     │                 │  ├─ IconTextButtonPreview.kt
│     │                 │  ├─ IndicatorTextValueGridItemPreview.kt
│     │                 │  └─ SquareButtonPreview.kt
│     │                 ├─ MainActivityTest.kt
│     │                 ├─ MainActivityTestRobot.kt
│     │                 └─ test
│     │                    ├─ ComposePagerTestRule.kt
│     │                    └─ SemanticsMatchers.kt
│     ├─ androidMain
│     │  ├─ AndroidManifest.xml
│     │  ├─ ic_launcher-playstore.png
│     │  ├─ kotlin
│     │  │  └─ com
│     │  │     └─ rwmobi
│     │  │        └─ kunigami
│     │  │           ├─ data
│     │  │           │  └─ source
│     │  │           │     └─ local
│     │  │           │        └─ preferences
│     │  │           │           └─ ProvideSettings.android.kt
│     │  │           ├─ di
│     │  │           │  └─ PlatformModule.android.kt
│     │  │           ├─ domain
│     │  │           │  └─ extensions
│     │  │           │     └─ InstantExtensions.android.kt
│     │  │           ├─ KunigamiApplication.kt
│     │  │           ├─ MainActivity.kt
│     │  │           └─ ui
│     │  │              ├─ components
│     │  │              │  └─ ScrollbarMultiplatform.android.kt
│     │  │              ├─ composehelper
│     │  │              │  ├─ CollectAsStateMultiplatform.android.kt
│     │  │              │  ├─ GetScreenSizeInfo.android.kt
│     │  │              │  └─ ShouldUseDarkTheme.android.kt
│     │  │              ├─ extensions
│     │  │              │  ├─ GenerateRandomLong.android.kt
│     │  │              │  ├─ ThrowableExtensions.android.kt
│     │  │              │  └─ WindowSizeClassExtensions.android.kt
│     │  │              └─ theme
│     │  │                 ├─ ProvideBodyFontFamily.android.kt
│     │  │                 └─ ProvideDisplayFontFamily.android.kt
│     │  └─ res
│     │     ├─ drawable-nodpi
│     │     │  └─ ic_splash_screen.png
│     │     ├─ mipmap-anydpi-v26
│     │     │  ├─ ic_launcher.xml
│     │     │  └─ ic_launcher_round.xml
│     │     ├─ mipmap-hdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  ├─ ic_launcher_foreground.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-mdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  ├─ ic_launcher_foreground.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  ├─ ic_launcher_foreground.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  ├─ ic_launcher_foreground.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  ├─ ic_launcher_foreground.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ values
│     │     │  ├─ colors.xml
│     │     │  ├─ ic_launcher_background.xml
│     │     │  ├─ strings.xml
│     │     │  └─ themes.xml
│     │     └─ values-night
│     │        └─ colors.xml
│     ├─ androidRelease
│     │  └─ generated
│     │     └─ baselineProfiles
│     │        ├─ baseline-prof.txt
│     │        └─ startup-prof.txt
│     ├─ androidUnitTest
│     │  └─ kotlin
│     │     └─ com
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              └─ data
│     │                 └─ source
│     │                    └─ local
│     │                       └─ database
│     │                          └─ dao
│     │                             ├─ ConsumptionDaoTest.kt
│     │                             ├─ NoKoinTestApplication.kt
│     │                             └─ RateDaoTest.kt
│     ├─ commonMain
│     │  ├─ composeResources
│     │  │  ├─ drawable
│     │  │  │  ├─ access_point_network_off.xml
│     │  │  │  ├─ arrow_ios_back_fill.xml
│     │  │  │  ├─ bar_chart.xml
│     │  │  │  ├─ blackboard.xml
│     │  │  │  ├─ bolt.xml
│     │  │  │  ├─ briefcase.xml
│     │  │  │  ├─ bulb.xml
│     │  │  │  ├─ chevron_left_circle.xml
│     │  │  │  ├─ chevron_right_circle.xml
│     │  │  │  ├─ circle_check.xml
│     │  │  │  ├─ close_fill.xml
│     │  │  │  ├─ coin.xml
│     │  │  │  ├─ compose-multiplatform.xml
│     │  │  │  ├─ countdown_clock.xml
│     │  │  │  ├─ dashboard.xml
│     │  │  │  ├─ database_remove_outline.xml
│     │  │  │  ├─ eraser.xml
│     │  │  │  ├─ error_badge.xml
│     │  │  │  ├─ file_dotted.xml
│     │  │  │  ├─ folder_lock_outline.xml
│     │  │  │  ├─ ic_launcher.png
│     │  │  │  ├─ ic_launcher_64.png
│     │  │  │  ├─ key.xml
│     │  │  │  ├─ lan_disconnect.xml
│     │  │  │  ├─ lightning_fill.xml
│     │  │  │  ├─ lock.xml
│     │  │  │  ├─ pulse.xml
│     │  │  │  ├─ reload.xml
│     │  │  │  ├─ revenue.xml
│     │  │  │  ├─ settings_24_regular.xml
│     │  │  │  ├─ shuffle.xml
│     │  │  │  ├─ skip_forward.xml
│     │  │  │  ├─ swap_fill.xml
│     │  │  │  ├─ time_duration_30.xml
│     │  │  │  ├─ trees.xml
│     │  │  │  ├─ trending_down_fill.xml
│     │  │  │  ├─ trending_up_fill.xml
│     │  │  │  ├─ unlink.xml
│     │  │  │  ├─ user.xml
│     │  │  │  └─ wallet.xml
│     │  │  ├─ font
│     │  │  │  ├─ nunito_black.ttf
│     │  │  │  ├─ nunito_blackitalic.ttf
│     │  │  │  ├─ nunito_bold.ttf
│     │  │  │  ├─ nunito_bolditalic.ttf
│     │  │  │  ├─ nunito_extrabold.ttf
│     │  │  │  ├─ nunito_extrabolditalic.ttf
│     │  │  │  ├─ nunito_extralight.ttf
│     │  │  │  ├─ nunito_extralightitalic.ttf
│     │  │  │  ├─ nunito_italic.ttf
│     │  │  │  ├─ nunito_italic_variablefont.ttf
│     │  │  │  ├─ nunito_light.ttf
│     │  │  │  ├─ nunito_lightitalic.ttf
│     │  │  │  ├─ nunito_medium.ttf
│     │  │  │  ├─ nunito_mediumitalic.ttf
│     │  │  │  ├─ nunito_regular.ttf
│     │  │  │  ├─ nunito_semibold.ttf
│     │  │  │  ├─ nunito_semibolditalic.ttf
│     │  │  │  ├─ nunito_variablefont.ttf
│     │  │  │  ├─ pathwayextreme_14pt_black.ttf
│     │  │  │  ├─ pathwayextreme_14pt_blackitalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_bold.ttf
│     │  │  │  ├─ pathwayextreme_14pt_bolditalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_extrabold.ttf
│     │  │  │  ├─ pathwayextreme_14pt_extrabolditalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_extralight.ttf
│     │  │  │  ├─ pathwayextreme_14pt_extralightitalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_italic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_light.ttf
│     │  │  │  ├─ pathwayextreme_14pt_lightitalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_medium.ttf
│     │  │  │  ├─ pathwayextreme_14pt_mediumitalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_regular.ttf
│     │  │  │  ├─ pathwayextreme_14pt_semibold.ttf
│     │  │  │  ├─ pathwayextreme_14pt_semibolditalic.ttf
│     │  │  │  ├─ pathwayextreme_14pt_thin.ttf
│     │  │  │  ├─ pathwayextreme_14pt_thinitalic.ttf
│     │  │  │  ├─ pathwayextreme_italic_variablefont.ttf
│     │  │  │  └─ pathwayextreme_variablefont.ttf
│     │  │  └─ values
│     │  │     └─ strings.xml
│     │  ├─ graphql
│     │  │  └─ com
│     │  │     └─ rwmobi
│     │  │        └─ kunigami
│     │  │           ├─ mutations
│     │  │           │  └─ ObtainKrakenToken.graphql
│     │  │           ├─ queries
│     │  │           │  ├─ EnergyProductsQuery.graphql
│     │  │           │  ├─ GetMeasurementsQuery.graphql
│     │  │           │  ├─ PropertiesQuery.graphql
│     │  │           │  ├─ SingleEnergyProductQuery.graphql
│     │  │           │  └─ SmartMeterTelemetryQuery.graphql
│     │  │           └─ schema.graphqls
│     │  └─ kotlin
│     │     ├─ androidx
│     │     │  └─ compose
│     │     │     └─ desktop
│     │     │        └─ ui
│     │     │           └─ tooling
│     │     │              └─ preview
│     │     │                 └─ Preview.kt
│     │     └─ com
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              ├─ App.kt
│     │              ├─ data
│     │              │  ├─ repository
│     │              │  │  ├─ DemoOctopusApiRepository.kt
│     │              │  │  ├─ GraphQLTokenRepository.kt
│     │              │  │  ├─ mapper
│     │              │  │  │  ├─ AccountMapper.kt
│     │              │  │  │  ├─ ConsumptionMapper.kt
│     │              │  │  │  ├─ ProductMapper.kt
│     │              │  │  │  ├─ RateMapper.kt
│     │              │  │  │  ├─ SmartMeterTelemetryMapper.kt
│     │              │  │  │  └─ TariffMapper.kt
│     │              │  │  ├─ OctopusGraphQLRepository.kt
│     │              │  │  └─ OctopusUserPreferencesRepository.kt
│     │              │  └─ source
│     │              │     ├─ local
│     │              │     │  ├─ cache
│     │              │     │  │  └─ InMemoryCacheDataSource.kt
│     │              │     │  ├─ database
│     │              │     │  │  ├─ dao
│     │              │     │  │  │  ├─ ConsumptionDao.kt
│     │              │     │  │  │  └─ RateDao.kt
│     │              │     │  │  ├─ DatabaseTypeConverters.kt
│     │              │     │  │  ├─ entity
│     │              │     │  │  │  ├─ ConsumptionEntity.kt
│     │              │     │  │  │  └─ RateEntity.kt
│     │              │     │  │  ├─ interfaces
│     │              │     │  │  │  └─ DatabaseDataSource.kt
│     │              │     │  │  ├─ model
│     │              │     │  │  │  └─ RateType.kt
│     │              │     │  │  ├─ OctometerDatabase.kt
│     │              │     │  │  └─ RoomDatabaseDataSource.kt
│     │              │     │  └─ preferences
│     │              │     │     ├─ interfaces
│     │              │     │     │  └─ PreferencesStore.kt
│     │              │     │     └─ MultiplatformPreferencesStore.kt
│     │              │     └─ network
│     │              │        ├─ dto
│     │              │        │  ├─ account
│     │              │        │  │  ├─ AccountApiResponse.kt
│     │              │        │  │  ├─ AgreementDto.kt
│     │              │        │  │  ├─ ElectricityMeterPointDto.kt
│     │              │        │  │  ├─ GasMeterPointDto.kt
│     │              │        │  │  ├─ MeterDto.kt
│     │              │        │  │  ├─ PropertyDto.kt
│     │              │        │  │  └─ RegisterDto.kt
│     │              │        │  ├─ auth
│     │              │        │  │  └─ Token.kt
│     │              │        │  ├─ consumption
│     │              │        │  │  ├─ ConsumptionApiResponse.kt
│     │              │        │  │  └─ ConsumptionDto.kt
│     │              │        │  ├─ LinkDto.kt
│     │              │        │  ├─ prices
│     │              │        │  │  ├─ PricesApiResponse.kt
│     │              │        │  │  └─ RateDto.kt
│     │              │        │  ├─ products
│     │              │        │  │  ├─ ProductDetailsDto.kt
│     │              │        │  │  └─ ProductsApiResponse.kt
│     │              │        │  └─ singleproduct
│     │              │        │     ├─ ConsumptionDetailDto.kt
│     │              │        │     ├─ DualFuelConsumptionDetailDto.kt
│     │              │        │     ├─ DualRateConsumptionDetailDto.kt
│     │              │        │     ├─ ElectricityRateQuotesDto.kt
│     │              │        │     ├─ ElectricityTariffDto.kt
│     │              │        │     ├─ QuotesDto.kt
│     │              │        │     ├─ SampleConsumptionDto.kt
│     │              │        │     ├─ SampleQuotesDto.kt
│     │              │        │     ├─ SingleProductApiResponse.kt
│     │              │        │     └─ TariffDetailsDto.kt
│     │              │        ├─ extensions
│     │              │        │  └─ StringExtensions.kt
│     │              │        ├─ graphql
│     │              │        │  ├─ ApolloGraphQLEndpoint.kt
│     │              │        │  ├─ AuthorisationInterceptor.kt
│     │              │        │  └─ interfaces
│     │              │        │     └─ GraphQLEndpoint.kt
│     │              │        └─ restapi
│     │              │           ├─ AccountEndpoint.kt
│     │              │           └─ ProductsEndpoint.kt
│     │              ├─ di
│     │              │  ├─ DataSourceModule.kt
│     │              │  ├─ DispatcherModule.kt
│     │              │  ├─ GraphQLModule.kt
│     │              │  ├─ KtorModule.kt
│     │              │  ├─ RepositoryModule.kt
│     │              │  ├─ UseCaseModule.kt
│     │              │  └─ ViewModelModule.kt
│     │              ├─ domain
│     │              │  ├─ exceptions
│     │              │  │  ├─ HttpException.kt
│     │              │  │  ├─ IncompleteCredentialsException.kt
│     │              │  │  ├─ NoValidMeterException.kt
│     │              │  │  ├─ RunCatchingException.kt
│     │              │  │  └─ TariffNotFoundException.kt
│     │              │  ├─ extensions
│     │              │  │  ├─ DoubleExtensions.kt
│     │              │  │  ├─ InstantExtensions.kt
│     │              │  │  └─ LocalDateTimeExtensions.kt
│     │              │  ├─ model
│     │              │  │  ├─ account
│     │              │  │  │  ├─ Account.kt
│     │              │  │  │  ├─ Agreement.kt
│     │              │  │  │  ├─ ElectricityMeter.kt
│     │              │  │  │  ├─ ElectricityMeterPoint.kt
│     │              │  │  │  └─ UserProfile.kt
│     │              │  │  ├─ consumption
│     │              │  │  │  ├─ Consumption.kt
│     │              │  │  │  ├─ ConsumptionDataOrder.kt
│     │              │  │  │  ├─ ConsumptionTimeFrame.kt
│     │              │  │  │  ├─ ConsumptionWithCost.kt
│     │              │  │  │  └─ LiveConsumption.kt
│     │              │  │  ├─ product
│     │              │  │  │  ├─ ElectricityTariffType.kt
│     │              │  │  │  ├─ ExitFeesType.kt
│     │              │  │  │  ├─ ProductDetails.kt
│     │              │  │  │  ├─ ProductDirection.kt
│     │              │  │  │  ├─ ProductFeature.kt
│     │              │  │  │  ├─ ProductSummary.kt
│     │              │  │  │  ├─ Tariff.kt
│     │              │  │  │  └─ TariffPaymentTerm.kt
│     │              │  │  └─ rate
│     │              │  │     ├─ PaymentMethod.kt
│     │              │  │     └─ Rate.kt
│     │              │  ├─ repository
│     │              │  │  ├─ OctopusApiRepository.kt
│     │              │  │  ├─ TokenRepository.kt
│     │              │  │  └─ UserPreferencesRepository.kt
│     │              │  └─ usecase
│     │              │     ├─ account
│     │              │     │  ├─ ClearCacheUseCase.kt
│     │              │     │  ├─ GetDefaultPostcodeUseCase.kt
│     │              │     │  ├─ InitialiseAccountUseCase.kt
│     │              │     │  ├─ SyncUserProfileUseCase.kt
│     │              │     │  └─ UpdateMeterPreferenceUseCase.kt
│     │              │     ├─ consumption
│     │              │     │  ├─ GenerateUsageInsightsUseCase.kt
│     │              │     │  ├─ GetConsumptionAndCostUseCase.kt
│     │              │     │  └─ GetLiveConsumptionUseCase.kt
│     │              │     └─ product
│     │              │        ├─ GetFilteredProductsUseCase.kt
│     │              │        ├─ GetLatestProductByKeywordUseCase.kt
│     │              │        ├─ GetStandardUnitRateUseCase.kt
│     │              │        ├─ GetTariffRatesUseCase.kt
│     │              │        └─ GetTariffUseCase.kt
│     │              └─ ui
│     │                 ├─ components
│     │                 │  ├─ AppBottomNavigationBar.kt
│     │                 │  ├─ AppNavigationRail.kt
│     │                 │  ├─ CommonPreviewSetup.kt
│     │                 │  ├─ DemoModeCtaAdaptive.kt
│     │                 │  ├─ DualTitleBar.kt
│     │                 │  ├─ ErrorScreenHandler.kt
│     │                 │  ├─ HorizontalAnimatedTintedPainterResource.kt
│     │                 │  ├─ IconTextButton.kt
│     │                 │  ├─ IndicatorTextValueGridItem.kt
│     │                 │  ├─ koalaplot
│     │                 │  │  ├─ AxisLabel.kt
│     │                 │  │  ├─ ChartTitle.kt
│     │                 │  │  ├─ VerticalBarChart.kt
│     │                 │  │  ├─ XAxisTitle.kt
│     │                 │  │  └─ YAxisTitle.kt
│     │                 │  ├─ LabelValueRow.kt
│     │                 │  ├─ LargeTitleWithIcon.kt
│     │                 │  ├─ LoadingScreen.kt
│     │                 │  ├─ MessageActionScreen.kt
│     │                 │  ├─ ScrollbarMultiplatform.kt
│     │                 │  ├─ SquareButton.kt
│     │                 │  ├─ TagWithIcon.kt
│     │                 │  ├─ TariffSummaryTile.kt
│     │                 │  ├─ VerticalAnimatedTintedPainterResource.kt
│     │                 │  ├─ WidgetCard.kt
│     │                 │  └─ WidthAdaptiveLayout.kt
│     │                 ├─ composehelper
│     │                 │  ├─ CollectAsStateMultiplatform.kt
│     │                 │  ├─ ColorExtensions.kt
│     │                 │  ├─ ConditionalBlur.kt
│     │                 │  ├─ DrawArcSegment.kt
│     │                 │  ├─ DrawHalfCircleArcSegment.kt
│     │                 │  ├─ DrawPlainColorArc.kt
│     │                 │  ├─ GetScreenSizeInfo.kt
│     │                 │  ├─ palette
│     │                 │  │  ├─ GenerateFreezingBlueSpectrum.kt
│     │                 │  │  ├─ GenerateGYRHueSpectrum.kt
│     │                 │  │  └─ RatePalette.kt
│     │                 │  └─ ShouldUseDarkTheme.kt
│     │                 ├─ destinations
│     │                 │  ├─ account
│     │                 │  │  ├─ AccountInformationScreen.kt
│     │                 │  │  ├─ AccountScreen.kt
│     │                 │  │  ├─ AccountScreenLayoutStyle.kt
│     │                 │  │  ├─ AccountScreenType.kt
│     │                 │  │  ├─ AccountUIEvent.kt
│     │                 │  │  ├─ AccountUIState.kt
│     │                 │  │  ├─ components
│     │                 │  │  │  ├─ AccountOperationButtonBar.kt
│     │                 │  │  │  ├─ AppInfoFooter.kt
│     │                 │  │  │  ├─ CredentialsInputForm.kt
│     │                 │  │  │  ├─ DemoModeConfirmDialog.kt
│     │                 │  │  │  ├─ ElectricityMeterPointCard.kt
│     │                 │  │  │  ├─ MeterSerialNumberEntry.kt
│     │                 │  │  │  ├─ SimpleTitleButtonCard.kt
│     │                 │  │  │  ├─ TariffLayout.kt
│     │                 │  │  │  └─ UpdateApiKeyDialog.kt
│     │                 │  │  └─ OnboardingScreen.kt
│     │                 │  ├─ agile
│     │                 │  │  ├─ AgileActions.kt
│     │                 │  │  ├─ AgileScreen.kt
│     │                 │  │  ├─ AgileScreenType.kt
│     │                 │  │  ├─ AgileUIEvent.kt
│     │                 │  │  ├─ AgileUIState.kt
│     │                 │  │  └─ components
│     │                 │  │     ├─ AgileTariffCardAdaptive.kt
│     │                 │  │     ├─ CurrentRateTile.kt
│     │                 │  │     ├─ GaugeWidget.kt
│     │                 │  │     ├─ LiveConsumptionTile.kt
│     │                 │  │     ├─ RateGaugeCountdownTile.kt
│     │                 │  │     ├─ RateGroupCells.kt
│     │                 │  │     ├─ RateGroupTitle.kt
│     │                 │  │     └─ ReferenceTariffTile.kt
│     │                 │  ├─ tariffs
│     │                 │  │  ├─ components
│     │                 │  │  │  ├─ CloseButtonBar.kt
│     │                 │  │  │  ├─ PostcodeEditDialog.kt
│     │                 │  │  │  ├─ PostcodeInputBar.kt
│     │                 │  │  │  ├─ ProductBottomSheetWrapper.kt
│     │                 │  │  │  ├─ ProductFacts.kt
│     │                 │  │  │  ├─ ProductListItemAdaptive.kt
│     │                 │  │  │  ├─ ProductPaneWrapper.kt
│     │                 │  │  │  ├─ ProductScreenLayout.kt
│     │                 │  │  │  └─ ProductTariff.kt
│     │                 │  │  ├─ TariffScreenLayoutStyle.kt
│     │                 │  │  ├─ TariffsScreen.kt
│     │                 │  │  ├─ TariffsScreenType.kt
│     │                 │  │  ├─ TariffsUIEvent.kt
│     │                 │  │  └─ TariffsUIState.kt
│     │                 │  └─ usage
│     │                 │     ├─ components
│     │                 │     │  ├─ AnimatedRatioBar.kt
│     │                 │     │  ├─ ConsumptionGroupCells.kt
│     │                 │     │  ├─ ConsumptionTile.kt
│     │                 │     │  ├─ DailyAverageTile.kt
│     │                 │     │  ├─ InsightsTile.kt
│     │                 │     │  ├─ NavigationOptionsBar.kt
│     │                 │     │  ├─ PresentationStyleDropdownMenu.kt
│     │                 │     │  ├─ ProjectedConsumptionTile.kt
│     │                 │     │  ├─ RateGroupTitle.kt
│     │                 │     │  ├─ TariffProjectionTilesAdaptive.kt
│     │                 │     │  └─ TitleNavigationBar.kt
│     │                 │     ├─ UsageScreen.kt
│     │                 │     ├─ UsageScreenType.kt
│     │                 │     ├─ UsageUIEvent.kt
│     │                 │     └─ UsageUIState.kt
│     │                 ├─ extensions
│     │                 │  ├─ GenerateRandomLong.kt
│     │                 │  ├─ ListExtensions.kt
│     │                 │  ├─ PostcodeStringExtensions.kt
│     │                 │  ├─ ThrowableExtensions.kt
│     │                 │  └─ WindowSizeClassExtensions.kt
│     │                 ├─ model
│     │                 │  ├─ chart
│     │                 │  │  ├─ BarChartData.kt
│     │                 │  │  └─ RequestedChartLayout.kt
│     │                 │  ├─ consumption
│     │                 │  │  ├─ ConsumptionGroupedCells.kt
│     │                 │  │  ├─ ConsumptionGroupWithPartitions.kt
│     │                 │  │  ├─ ConsumptionPresentationStyle.kt
│     │                 │  │  ├─ ConsumptionQueryFilter.kt
│     │                 │  │  └─ Insights.kt
│     │                 │  ├─ ErrorMessage.kt
│     │                 │  ├─ PlatformType.kt
│     │                 │  ├─ product
│     │                 │  │  └─ RetailRegion.kt
│     │                 │  ├─ rate
│     │                 │  │  ├─ RateGroup.kt
│     │                 │  │  ├─ RateGroupWithPartitions.kt
│     │                 │  │  └─ RateTrend.kt
│     │                 │  ├─ ScreenSizeInfo.kt
│     │                 │  └─ SpecialErrorScreen.kt
│     │                 ├─ navigation
│     │                 │  ├─ AppDestination.kt
│     │                 │  └─ AppNavigationHost.kt
│     │                 ├─ previewsampledata
│     │                 │  ├─ AccountSamples.kt
│     │                 │  ├─ FakeDemoUserProfile.kt
│     │                 │  ├─ InsightsSamples.kt
│     │                 │  └─ TariffSamples.kt
│     │                 ├─ theme
│     │                 │  ├─ Color.kt
│     │                 │  ├─ Dimension.kt
│     │                 │  ├─ ProvideBodyFontFamily.kt
│     │                 │  ├─ ProvideDisplayFontFamily.kt
│     │                 │  ├─ Theme.kt
│     │                 │  └─ Type.kt
│     │                 ├─ tools
│     │                 │  ├─ interfaces
│     │                 │  │  └─ StringResourceProvider.kt
│     │                 │  └─ MultiplatformStringResourceProvider.kt
│     │                 └─ viewmodels
│     │                    ├─ AccountViewModel.kt
│     │                    ├─ AgileViewModel.kt
│     │                    ├─ TariffsViewModel.kt
│     │                    └─ UsageViewModel.kt
│     ├─ commonTest
│     │  └─ kotlin
│     │     └─ com
│     │        ├─ example
│     │        │  └─ octometerdemo
│     │        │     └─ ComposeAppCommonTest.kt
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              ├─ data
│     │              │  ├─ repository
│     │              │  │  ├─ DemoRestApiRepositoryTest.kt
│     │              │  │  ├─ GraphQLTokenRepositoryTest.kt
│     │              │  │  ├─ OctopusGraphQLRepositoryTest.kt
│     │              │  │  └─ OctopusUserPreferencesRepositoryTest.kt
│     │              │  └─ source
│     │              │     ├─ local
│     │              │     │  ├─ cache
│     │              │     │  │  └─ InMemoryCacheDataSourceTest.kt
│     │              │     │  ├─ database
│     │              │     │  │  ├─ dao
│     │              │     │  │  │  ├─ FakeConsumptionDao.kt
│     │              │     │  │  │  └─ FakeRateDao.kt
│     │              │     │  │  ├─ entity
│     │              │     │  │  │  └─ RateEntityKtTest.kt
│     │              │     │  │  ├─ FakeDataBaseDataSource.kt
│     │              │     │  │  └─ RoomDatabaseDataSourceTest.kt
│     │              │     │  └─ preferences
│     │              │     │     └─ FakePreferencesStore.kt
│     │              │     └─ network
│     │              │        ├─ dto
│     │              │        │  └─ auth
│     │              │        │     └─ TokenTest.kt
│     │              │        ├─ graphql
│     │              │        │  └─ FakeGraphQLEndpoint.kt
│     │              │        └─ restapi
│     │              │           ├─ AccountEndpointTest.kt
│     │              │           └─ ProductsEndpointTest.kt
│     │              ├─ domain
│     │              │  ├─ extensions
│     │              │  │  ├─ DoubleExtensionsKtTest.kt
│     │              │  │  └─ InstantExtensionsKtTest.kt
│     │              │  ├─ model
│     │              │  │  ├─ account
│     │              │  │  │  ├─ AccountTest.kt
│     │              │  │  │  └─ ElectricityMeterPointTest.kt
│     │              │  │  ├─ consumption
│     │              │  │  │  └─ ConsumptionTest.kt
│     │              │  │  ├─ product
│     │              │  │  │  ├─ ExitFeesTypeTest.kt
│     │              │  │  │  ├─ ProductDirectionTest.kt
│     │              │  │  │  ├─ ProductFeatureTest.kt
│     │              │  │  │  └─ TariffTest.kt
│     │              │  │  ├─ rate
│     │              │  │  │  ├─ PaymentMethodTest.kt
│     │              │  │  │  └─ RateTest.kt
│     │              │  │  └─ RateTest.kt
│     │              │  ├─ repository
│     │              │  │  ├─ FakeOctopusApiRepository.kt
│     │              │  │  └─ FakeUserPreferencesRepository.kt
│     │              │  └─ usecase
│     │              │     ├─ account
│     │              │     │  ├─ ClearCacheUseCaseTest.kt
│     │              │     │  ├─ GetDefaultPostcodeUseCaseTest.kt
│     │              │     │  ├─ InitialiseAccountUseCaseTest.kt
│     │              │     │  ├─ SyncUserProfileUseCaseTest.kt
│     │              │     │  └─ UpdateMeterPreferenceUseCaseTest.kt
│     │              │     ├─ consumption
│     │              │     │  ├─ GenerateUsageInsightsUseCaseTest.kt
│     │              │     │  └─ GetConsumptionAndCostUseCaseTest.kt
│     │              │     └─ product
│     │              │        ├─ GetFilteredProductsUseCaseTest.kt
│     │              │        ├─ GetLatestProductByKeywordUseCaseTest.kt
│     │              │        ├─ GetStandardUnitRateUseCaseTest.kt
│     │              │        ├─ GetTariffRatesUseCaseTest.kt
│     │              │        └─ GetTariffSummaryUseCaseTest.kt
│     │              ├─ test
│     │              │  └─ samples
│     │              │     ├─ AccountSampleData.kt
│     │              │     ├─ ConsumptionEntitySampleData.kt
│     │              │     ├─ ConsumptionSampleData.kt
│     │              │     ├─ GetAccountSampleData.kt
│     │              │     ├─ GetConsumptionSampleData.kt
│     │              │     ├─ GetDayUnitRatesSampleData.kt
│     │              │     ├─ GetNightUnitRatesSampleData.kt
│     │              │     ├─ GetProductSampleData.kt
│     │              │     ├─ GetProductsSampleData.kt
│     │              │     ├─ GetStandardUnitRatesSampleData.kt
│     │              │     ├─ GetStandingChargesSampleData.kt
│     │              │     ├─ GetTariffSampleData.kt
│     │              │     ├─ RateEntitySampleData.kt
│     │              │     ├─ RateSampleData.kt
│     │              │     └─ TariffSampleData.kt
│     │              └─ ui
│     │                 ├─ extensions
│     │                 │  ├─ ListExtensionsKtTest.kt
│     │                 │  └─ PostcodeStringExtensionsKtTest.kt
│     │                 ├─ model
│     │                 │  ├─ consumption
│     │                 │  │  ├─ ConsumptionGroupedCellsTest.kt
│     │                 │  │  ├─ ConsumptionPresentationStyleTest.kt
│     │                 │  │  └─ ConsumptionQueryFilterTest.kt
│     │                 │  ├─ product
│     │                 │  │  └─ RetailRegionTest.kt
│     │                 │  ├─ rate
│     │                 │  │  └─ RateGroupTest.kt
│     │                 │  └─ StubStringResourceProvider.kt
│     │                 └─ viewmodels
│     │                    ├─ AccountViewModelTest.kt
│     │                    ├─ AgileViewModelTest.kt
│     │                    ├─ TariffsViewModelTest.kt
│     │                    └─ UsageViewModelTest.kt
│     ├─ desktopMain
│     │  └─ kotlin
│     │     └─ com
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              ├─ data
│     │              │  └─ source
│     │              │     └─ local
│     │              │        └─ preferences
│     │              │           └─ ProvideSettings.desktop.kt
│     │              ├─ di
│     │              │  └─ PlatformModule.desktop.kt
│     │              ├─ domain
│     │              │  └─ extensions
│     │              │     └─ InstantExtensions.desktop.kt
│     │              ├─ Main.kt
│     │              └─ ui
│     │                 ├─ components
│     │                 │  └─ ScrollbarMultiplatform.desktop.kt
│     │                 ├─ composehelper
│     │                 │  ├─ CollectAsStateMultiplatform.desktop.kt
│     │                 │  ├─ CustomizeMacOsAboutMenu.desktop.kt
│     │                 │  ├─ GetScreenSizeInfo.desktop.kt
│     │                 │  └─ ShouldUseDarkTheme.desktop.kt
│     │                 ├─ extensions
│     │                 │  ├─ GenerateRandomLong.desktop.kt
│     │                 │  ├─ ThrowableExtensions.desktop.kt
│     │                 │  └─ WindowSizeClassExtensions.desktop.kt
│     │                 ├─ theme
│     │                 │  ├─ ProvideBodyFontFamily.desktop.kt
│     │                 │  └─ ProvideDisplayFontFamily.desktop.kt
│     │                 └─ viewmodels
│     │                    └─ PlatformMainViewModel.kt
│     ├─ desktopTest
│     │  └─ kotlin
│     │     └─ com
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              └─ ui
│     │                 ├─ model
│     │                 │  └─ chart
│     │                 │     └─ BarChartDataTest.kt
│     │                 └─ viewmodels
│     │                    └─ PlatformMainViewModelTest.kt
│     ├─ iosMain
│     │  └─ kotlin
│     │     └─ com
│     │        ├─ example
│     │        │  └─ octometerdemo
│     │        │     ├─ MainViewController.kt
│     │        │     └─ Platform.ios.kt
│     │        └─ rwmobi
│     │           └─ kunigami
│     │              ├─ data
│     │              │  └─ source
│     │              │     └─ local
│     │              │        └─ preferences
│     │              │           └─ ProvideSettings.ios.kt
│     │              ├─ di
│     │              │  ├─ KoinHelper.kt
│     │              │  └─ PlatformModule.ios.kt
│     │              ├─ domain
│     │              │  └─ extensions
│     │              │     └─ InstantExtensions.ios.kt
│     │              ├─ MainViewController.kt
│     │              └─ ui
│     │                 ├─ components
│     │                 │  └─ ScrollbarMultiplatform.ios.kt
│     │                 ├─ composehelper
│     │                 │  ├─ CollectAsStateMultiplatform.ios.kt
│     │                 │  ├─ GetScreenSizeInfo.ios.kt
│     │                 │  └─ ShouldUseDarkTheme.ios.kt
│     │                 ├─ extensions
│     │                 │  ├─ GenerateRandomLong.ios.kt
│     │                 │  ├─ ThrowableExtensions.ios.kt
│     │                 │  └─ WindowSizeClassExtensions.ios.kt
│     │                 └─ theme
│     │                    ├─ ProvideBodyFontFamily.ios.kt
│     │                    └─ ProvideDisplayFontFamily.ios.kt
│     └─ jvmMain
│        └─ kotlin
│           └─ com
│              └─ example
│                 └─ octometerdemo
│                    ├─ main.kt
│                    └─ Platform.jvm.kt
├─ config
│  └─ detekt
│     └─ detekt.yml
├─ gradle
│  ├─ libs.versions.toml
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
├─ iosApp
│  ├─ Configuration
│  │  └─ Config.xcconfig
│  ├─ iosApp
│  │  ├─ Assets.xcassets
│  │  │  ├─ AccentColor.colorset
│  │  │  │  └─ Contents.json
│  │  │  ├─ AppIcon.appiconset
│  │  │  │  ├─ 240909 OctoMeter launcher 1024.png
│  │  │  │  ├─ app-icon-1024.png
│  │  │  │  └─ Contents.json
│  │  │  ├─ Contents.json
│  │  │  ├─ LaunchScreenBackground.colorset
│  │  │  │  └─ Contents.json
│  │  │  └─ LaunchScreenIcon.imageset
│  │  │     ├─ 240909 OctoMeter launcher trans 800.png
│  │  │     ├─ 240909 OctoMeter launcher trans 801.png
│  │  │     ├─ 240909 OctoMeter launcher trans 802.png
│  │  │     └─ Contents.json
│  │  ├─ ContentView.swift
│  │  ├─ Info.plist
│  │  ├─ iOSApp.swift
│  │  ├─ Launch Screen.storyboard
│  │  └─ Preview Content
│  │     └─ Preview Assets.xcassets
│  │        └─ Contents.json
│  ├─ ios_icons
│  │  └─ AppIcon.appiconset
│  │     ├─ app_store_1024x1024.png
│  │     ├─ icon_20x20@2x.png
│  │     ├─ icon_20x20@2x~ipad.png
│  │     ├─ icon_20x20@3x.png
│  │     ├─ icon_29x29@2x.png
│  │     ├─ icon_29x29@2x~ipad.png
│  │     ├─ icon_29x29@3x.png
│  │     ├─ icon_29x29~ipad.png
│  │     ├─ icon_40x40@2x.png
│  │     ├─ icon_40x40@2x~ipad.png
│  │     ├─ icon_40x40@3x.png
│  │     ├─ icon_40x40~ipad.png
│  │     ├─ icon_60x60@2x.png
│  │     ├─ icon_60x60@3x.png
│  │     ├─ icon_76x76@2x~ipad.png
│  │     ├─ icon_76x76~ipad.png
│  │     ├─ icon_83.5x83.5@2x~ipad.png
│  │     └─ marketing_icon_1024x1024.png
│  └─ OctoMeter.xcworkspace
│     ├─ contents.xcworkspacedata
│     └─ xcshareddata
│        └─ IDEWorkspaceChecks.plist
└─ README.md
```
