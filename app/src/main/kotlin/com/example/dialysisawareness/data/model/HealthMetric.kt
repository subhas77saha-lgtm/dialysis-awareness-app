package com.example.dialysisawareness.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "health_metrics")
data class HealthMetric(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Long,
    val time: String,
    val weight: Double, // kg
    val bloodPressure: String, // e.g., "120/80"
    val glucose: Int?, // mg/dL
    val potassium: Double?, // mEq/L
    val phosphorus: Double?, // mg/dL
    val notes: String = ""
)