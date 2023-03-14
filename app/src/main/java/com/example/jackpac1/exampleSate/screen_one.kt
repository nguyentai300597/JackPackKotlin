package com.example.jackpac1.exampleSate

import WaterCounter
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun WellnessScreen(navicontroler:NavController) {
    WaterCounter(Modifier,navicontroler)
}