package com.example.imobiliaria.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.imobiliaria.Components.BackButton
import com.example.imobiliaria.Components.RealtorCard
import com.example.imobiliaria.Components.NavigationContent
import com.example.imobiliaria.Components.ImageCard
import com.example.imobiliaria.Components.ColoredButton
import com.example.imobiliaria.Components.RedButton
import com.example.imobiliaria.Components.WhiteButton
import com.example.imobiliaria.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutUsScreen(navController: NavController) {
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
        ContentSobreScreen(navController)
    }
}

@Composable
fun ContentSobreScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Red)
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            RealtorCard(
                "Corretor A",
                painterResource(R.drawable.imagem_generica)
            )

            RealtorCard(
                "Corretor B",
                painterResource(R.drawable.imagem_generica)
            )
        }
    }
}
