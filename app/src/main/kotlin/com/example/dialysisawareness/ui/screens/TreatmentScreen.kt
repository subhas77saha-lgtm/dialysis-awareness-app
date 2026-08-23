package com.example.dialysisawareness.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TreatmentScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Treatment Sessions") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Add treatment */ }) {
                Icon(Icons.Default.Add, contentDescription = "Log Treatment")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                "Treatment History",
                style = MaterialTheme.typography.headlineSmall
            )

            TreatmentSessionCard(
                date = "Today",
                time = "08:00 AM - 11:00 AM",
                duration = "3 hours",
                fluidRemoved = "2.5 kg",
                bloodPressure = "120/80"
            )

            TreatmentSessionCard(
                date = "Yesterday",
                time = "08:00 AM - 11:00 AM",
                duration = "3 hours",
                fluidRemoved = "2.3 kg",
                bloodPressure = "125/85"
            )
        }
    }
}

@Composable
fun TreatmentSessionCard(
    date: String,
    time: String,
    duration: String,
    fluidRemoved: String,
    bloodPressure: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(date, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Time", style = MaterialTheme.typography.labelSmall)
                    Text(time, style = MaterialTheme.typography.bodySmall)
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Duration", style = MaterialTheme.typography.labelSmall)
                    Text(duration, style = MaterialTheme.typography.bodySmall)
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Fluid Removed", style = MaterialTheme.typography.labelSmall)
                    Text(fluidRemoved, style = MaterialTheme.typography.bodySmall)
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("BP", style = MaterialTheme.typography.labelSmall)
                    Text(bloodPressure, style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}