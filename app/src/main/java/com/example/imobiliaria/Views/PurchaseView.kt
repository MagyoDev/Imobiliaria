package com.example.imobiliaria.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.imobiliaria.Components.BackButton
import com.example.imobiliaria.Components.ImageCard
import com.example.imobiliaria.Components.NavigationContent
import com.example.imobiliaria.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PurchaseScreen(navController: NavController) {
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
        ContentComprarScreen(navController)
    }
}

@Composable
fun ContentComprarScreen(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxSize().padding(top = 80.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ImageCard(
            "Casa 1",
            "R$ 70.000,00",
            Color.Black,
            painterResource(R.drawable.casa_generica)
        )

        ImageCard(
            "Casa 2",
            "R$ 50.000,00",
            Color.DarkGray,
            painterResource(R.drawable.casa_generica)
        )
    }
}
