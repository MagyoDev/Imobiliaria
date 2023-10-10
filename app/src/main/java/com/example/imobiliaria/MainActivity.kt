package com.example.imobiliaria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.imobiliaria.Navigation.NavigationManager
import com.example.imobiliaria.ui.theme.ImobiliariaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImobiliariaTheme {
                NavigationManager()
            }
        }
    }
}

