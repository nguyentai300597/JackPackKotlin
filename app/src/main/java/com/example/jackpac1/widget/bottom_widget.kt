package com.example.jackpac1.widget

import MainViewModel
import android.annotation.SuppressLint
import android.provider.CalendarContract
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import com.example.jackpac1.naviagtor.NavigationItem
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState


@SuppressLint("SuspiciousIndentation")
@Composable
fun BottomNavigationBar(navController:NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Sms,
        NavigationItem.Factory,
        NavigationItem.Account,

    )

        androidx.compose.material3.Surface(color= Color(0xFF368CA0)) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(all=10.dp),
                horizontalArrangement=Arrangement.SpaceAround
            ){
                items.forEach { item ->
                    IconField(item.title,leadingIcon=item.icon,navController=navController)
                }
            }
        }
    }

@Composable
fun IconField(
    label: String,
    modifier: Modifier = Modifier,
    navController:NavController,
    leadingIcon: Int, // You can change ImageVector with Painter or ImageBitmap


) {
    var state by remember { mutableStateOf(true) }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Column(modifier = modifier.clickable (onClick = { state = !state
        navController.navigate(label)
        println("--$label}")


    })) {
        Icon(
            painter = painterResource(id =leadingIcon),
            contentDescription = null ,
            tint=(if(currentRoute==label) { Color(0xFFF8031F)
            }else Color(0xFFF5FDFf))

        )

        Text(text =label)
    }
}


