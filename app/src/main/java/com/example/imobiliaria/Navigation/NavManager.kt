package com.example.imobiliaria.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.imobailiaria.Views.HomeScreen
import com.example.imobiliaria.Views.AboutUsScreen
import com.example.imobiliaria.Views.AdvertiseScreen
import com.example.imobiliaria.Views.NewScreen
import com.example.imobiliaria.Views.PurchaseScreen


@Composable
fun NavigationManager() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }

        composable("purchase") {
            PurchaseScreen(navController)
        }

        composable("new") {
            NewScreen(navController)
        }

        composable("advertise") {
            AdvertiseScreen(navController)
        }

        composable("aboutus") {
            AboutUsScreen(navController)
        }
    }
}
