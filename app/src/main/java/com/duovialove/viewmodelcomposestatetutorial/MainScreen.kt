package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    val userViewModel: UserViewModel = viewModel()

    Scaffold(
        bottomBar = {
            CustomBottomNavigationBar(navController)
        }
    ) { innerPadding->

        NavHost(
            navController,
            Screen.Home.route,
            modifier = Modifier.padding(innerPadding)){

            composable(Screen.Home.route) {
                HomeScreen(userViewModel)
            }

            composable(Screen.Profile.route){
                ProfileScreen(userViewModel)
            }

        }
    }

}