package com.example.imobiliaria.Views

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.imobiliaria.Components.NavigationContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdvertiseScreen(navController: NavController) {
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

                }
            )
        }
    ) {
        ContentAnuncieScreen(navController)
    }
}

@Composable
fun ContentAnuncieScreen(navController: NavController) {

}
