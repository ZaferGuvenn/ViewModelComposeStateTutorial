package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen( val route: String, val title:String, val icon: ImageVector) {

    object Home : Screen("home","Home",Icons.Default.Home)
    object Profile : Screen("profile","Profile",Icons.Default.Person)


}

val bottomNavItems = listOf(Screen.Home, Screen.Profile)
