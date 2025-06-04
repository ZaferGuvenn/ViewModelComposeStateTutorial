package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.navigation.NavController

import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun CustomBottomNavigationBar(navController: NavController) {

    val currentBackStack by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStack?.destination?.route

    NavigationBar{
        bottomNavItems.forEach { screen->

            NavigationBarItem(
                icon = {Icon(screen.icon,screen.title)},
                label = { Text(screen.title) },
                selected = currentRoute==screen.route,
                onClick = {
                    if (currentRoute != screen.route){

                        navController.navigate(screen.route){
                            popUpTo(navController.graph.startDestinationId){
                                saveState = true
                            }

                            launchSingleTop = true
                            restoreState = true
                        }

                    }
                }
            )

        }
    }
}