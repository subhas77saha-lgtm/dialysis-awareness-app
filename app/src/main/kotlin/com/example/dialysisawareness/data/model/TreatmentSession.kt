package com.example.dialysisawareness.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "treatment_sessions")
data class TreatmentSession(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Long, // Timestamp
    val startTime: String,
    val endTime: String,
    val duration: Int, // in minutes
    val fluidRemoved: Double, // in kg
    val bloodPressureBefore: String, // e.g., "120/80"
    val bloodPressureAfter: String,
    val weight: Double, // kg
    val bloodFlow: Int, // mL/min
    val notes: String = ""
)