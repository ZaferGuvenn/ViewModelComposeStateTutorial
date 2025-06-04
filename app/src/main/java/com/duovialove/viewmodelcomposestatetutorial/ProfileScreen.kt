package com.duovialove.viewmodelcomposestatetutorial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ProfileScreen( userViewModel: UserViewModel = viewModel ()){

    val name = userViewModel.userName

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "User name = $name")
        Spacer(Modifier.height(16.dp))
        Button(
            onClick = {userViewModel.updateUserName("Changed User Name")}
        ) {
            Text("Change your name")
        }
    }

}