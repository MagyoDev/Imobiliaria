package com.example.imobiliaria.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.imobiliaria.Components.BackButton
import com.example.imobiliaria.Components.NavigationContent
import com.example.imobiliaria.Components.WhiteButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavigationContent(navController)
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.DarkGray
                ),
                navigationIcon = {
                    BackButton(navController)
                }
            )
        }
    ) {
        NovoComprarScreen(navController)
    }
}

@Composable
fun NovoComprarScreen(navController: NavController) {
    val items = listOf(
        "Casa" to "home",
        "Apartamentos" to "home",
        "Chácaras" to "home"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Red)
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Spacer(modifier = Modifier.height(28.dp)) // Espaço entre os botões
        }
    }
