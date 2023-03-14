package com.example.jackpac1.naviagtor
import MainViewModel
import MealCategoriesScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import com.example.jackpac1.Screen.AccontScreen
import com.example.jackpac1.Screen.FactoryScreen
import com.example.jackpac1.Screen.MainTest
import com.example.jackpac1.Screen.SmsScreen
import com.example.jackpac1.exampleSate.WellnessScreen

@Composable
fun NavigatorRouter(navController: NavHostController,viewModel:MainViewModel){


   // val navController = rememberNavController()
    NavHost(navController, startDestination ="WellnessScreen") {
        composable("WellnessScreen") { WellnessScreen(navController) }
        composable(
            NavigationItem.Account.title,

           ) {

            AccontScreen()

        }
        composable(
            NavigationItem.Factory.title,

            ) {

            FactoryScreen()

        }

        composable(
            NavigationItem.Sms.title,

            ) {

            //SmsScreen()
            viewModel.updateMealCategoriesWithRetrofitGson()
            MealCategoriesScreen(viewModel)

        }
        composable(
            NavigationItem.Home.title,

            ) {

            WellnessScreen(navController)

        }


    }
}