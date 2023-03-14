package com.example.jackpac1.naviagtor

import com.example.jackpac1.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home",R.drawable.ic_baseline_home_24, "Home")
    object Sms : NavigationItem("sms", R.drawable.ic_baseline_sms_24, "sms")
    object Factory : NavigationItem("factory", R.drawable.ic_baseline_favorite_border_24, "factory")
    object Account : NavigationItem("account", R.drawable.ic_baseline_account_circle_24, "account")

}