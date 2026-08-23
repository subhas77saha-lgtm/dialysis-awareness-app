package com.example.dialysisawareness.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dialysisawareness.ui.screens.HomeScreen
import com.example.dialysisawareness.ui.screens.EducationScreen
import com.example.dialysisawareness.ui.screens.MedicationScreen
import com.example.dialysisawareness.ui.screens.TreatmentScreen
import com.example.dialysisawareness.ui.screens.SettingsScreen
import com.example.dialysisawareness.ui.screens.DashboardScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    AppNavHost(navController = navController)
}

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("dashboard") {
            DashboardScreen(navController = navController)
        }
        composable("education") {
            EducationScreen(navController = navController)
        }
        composable("medication") {
            MedicationScreen(navController = navController)
        }
        composable("treatment") {
            TreatmentScreen(navController = navController)
        }
        composable("settings") {
            SettingsScreen(navController = navController)
        }
    }
}