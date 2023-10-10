package com.example.imobailiaria.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imobiliaria.Components.NavigationContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
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
        ContentHomeScreen(navController)
    }
}

@Composable
fun ContentHomeScreen(navController: NavController) {
    val buttons = listOf(
        HomeButton("Comprar", Icons.Default.ShoppingCart, "purchase"),
        HomeButton("Alugar", Icons.Default.Home, "purchase"),
        HomeButton("Novos", Icons.Default.Add, "new"),
        HomeButton("Anuncie no App", Icons.Default.Edit, "advertise"),
        HomeButton("Nosso time", Icons.Default.AccountCircle, "aboutus"),
        HomeButton("Sobre nós", Icons.Default.Person, "aboutus")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Red)
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons.forEach { button ->
            RedButton(button.text, button.icon) {
                navController.navigate(button.destination)
            }
            Spacer(modifier = Modifier.height(28.dp))
        }
    }
}

data class HomeButton(val text: String, val icon: ImageVector, val destination: String)

@Composable
fun RedButton(text: String, icon: ImageVector, onClick: () -> Unit) {
    ColoredButton(text, icon, onClick, Color.Red, Color.White)
}

@Composable
fun ColoredButton(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    backgroundColor: Color,
    contentColor: Color
) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, contentColor),
        modifier = Modifier
            .width(315.dp)
            .height(80.dp)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(50.dp)
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = contentColor,
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = text,
                color = contentColor,
                fontSize = 30.sp
            )
        }
    }
}
