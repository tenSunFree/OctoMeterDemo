package com.rwmobi.kunigami.ui.destinations.agile

/**
 * Agile actions used by the UI to handle refresh and live consumption updates.
 */
interface AgileActions {
    fun onRefresh()
    fun onStartLiveConsumptionUpdates()
    fun onStopLiveConsumptionUpdates()
    fun onErrorShown(errorId: Long)
}