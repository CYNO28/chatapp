package com.example.chatapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.ui_examples.HomeScreen
import com.example.chatapp.ui_examples.ScaffoldExample

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController, 
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(onNavigateToScaffold = { navController.navigate(Screen.Scaffold.route) })
        }
        composable(Screen.Scaffold.route) {
            ScaffoldExample(onBack = { navController.popBackStack() })
        }
    }
}