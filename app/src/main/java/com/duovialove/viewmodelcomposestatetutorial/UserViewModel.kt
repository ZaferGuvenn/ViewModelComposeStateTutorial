package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    var userName by mutableStateOf("Gedson")
        private set

    fun updateUserName(newName:String){
        userName = newName
    }

}