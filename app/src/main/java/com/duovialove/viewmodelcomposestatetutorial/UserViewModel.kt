package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    var userName = mutableStateOf("Gedson").value
        private set

    fun updateUserName(newName:String){
        userName = newName
    }

}