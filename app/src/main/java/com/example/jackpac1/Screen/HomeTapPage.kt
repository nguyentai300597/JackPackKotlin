package com.example.jackpac1.Screen
import MainViewModel
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.jackpac1.naviagtor.NavigatorRouter
import com.example.jackpac1.widget.BottomNavigationBar
import com.example.jackpac1.widget.FloatBtn

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTest(viewModel: MainViewModel){
    val navController = rememberNavController()
   Scaffold(
       content = { padding ->
           Box(modifier = Modifier.padding(padding)) {
               NavigatorRouter(navController = navController,viewModel=viewModel)
           }
       },

floatingActionButton ={FloatBtn()},
       bottomBar = {BottomNavigationBar(navController = navController)}
   )

   }

