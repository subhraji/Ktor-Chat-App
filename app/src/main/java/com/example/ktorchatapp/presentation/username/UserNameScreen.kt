package com.example.ktorchatapp.presentation.username

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun UserNameScreen(
    viewModel: UserNameViewModel = hiltViewModel(),
    onNavigate: (String) -> Unit
){
    LaunchedEffect(key1 = true) {

    }
}