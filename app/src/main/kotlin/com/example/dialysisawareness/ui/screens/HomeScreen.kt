package com.example.dialysisawareness.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Dialysis Awareness") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                "Welcome to Dialysis Awareness",
                style = MaterialTheme.typography.headlineSmall
            )

            Text(
                "Manage your health and stay informed about your dialysis treatment",
                style = MaterialTheme.typography.bodyMedium
            )

            // Quick Access Cards
            QuickAccessCard(
                title = "Dashboard",
                description = "View your health metrics",
                icon = Icons.Default.Dashboard,
                onClick = { navController.navigate("dashboard") }
            )

            QuickAccessCard(
                title = "Treatment Sessions",
                description = "Log and track treatments",
                icon = Icons.Default.LocalHospital,
                onClick = { navController.navigate("treatment") }
            )

            QuickAccessCard(
                title = "Medications",
                description = "Manage your medications",
                icon = Icons.Default.Medication,
                onClick = { navController.navigate("medication") }
            )

            QuickAccessCard(
                title = "Education",
                description = "Learn about dialysis care",
                icon = Icons.Default.School,
                onClick = { navController.navigate("education") }
            )

            QuickAccessCard(
                title = "Settings",
                description = "Manage your preferences",
                icon = Icons.Default.Settings,
                onClick = { navController.navigate("settings") }
            )
        }
    }
}

@Composable
fun QuickAccessCard(
    title: String,
    description: String,
    icon: androidx.compose.material.icons.Icons,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                modifier = Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Column {
                Text(title, style = MaterialTheme.typography.titleMedium)
                Text(description, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}