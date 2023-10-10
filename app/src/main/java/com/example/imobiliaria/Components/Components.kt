package com.example.imobiliaria.Components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.painter.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.*
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

@Composable
fun ColoredButton(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, contentColor),
        modifier = modifier
            .background(
                color = backgroundColor
            )
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
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

@Composable
fun RedButton(text: String, icon: ImageVector, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ColoredButton(text, icon, onClick, Color.Red, Color.White, modifier)
}

@Composable
fun WhiteButton(text: String, icon: ImageVector, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ColoredButton(text, icon, onClick, Color.White, Color.Red, modifier)
}

@Composable
fun BackButton(navController: NavController) {
    TextButton(onClick = { navController.navigate("home") }) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Icon",
            tint = Color.White,
            modifier = Modifier.size(30.dp)
        )
    }
}

@Composable
fun ImageCard(
    title: String,
    price: String,
    priceColor: Color,
    image: Painter,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.background(Color.White)
        ) {
            Image(
                painter = image,
                contentDescription = "Image of House"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = title,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = price,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                color = priceColor,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun RealtorCard(
    name: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.background(Color.White)
        ) {
            Image(
                painter = image,
                contentDescription = "Image of Realtor"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = name,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun NavigationContent(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Imobiliária",
            color = Color.White
        )
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search Icon",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}
