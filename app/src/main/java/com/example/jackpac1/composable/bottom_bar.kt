package com.example.jackpac1.composable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier


//@Composable
//private fun SootheBottomNavigation(modifier: Modifier = Modifier()) {
//    BottomNavigation(modifier) {
//        BottomNavigationItem(
//            icon = {
//                Icon(
//                    imageVector = Icons.Default.Spa,
//                    contentDescription = null
//                )
//            },
//            label = {
//                Text(stringResource(R.string.bottom_navigation_home))
//            },
//            selected = true,
//            onClick = {}
//        )
//        BottomNavigationItem(
//            icon = {
//                Icon(
//                    imageVector = Icons.Default.AccountCircle,
//                    contentDescription = null
//                )
//            },
//            label = {
//                Text(stringResource(R.string.bottom_navigation_profile))
//            },
//            selected = false,
//            onClick = {}
//        )
//    }
//}

//@Composable
//fun MySootheApp() {
//    MySootheTheme {
//        Scaffold(
//            bottomBar = { SootheBottomNavigation() }
//        ) { padding ->
//            HomeScreen(Modifier.padding(padding))
//        }
//    }
//}