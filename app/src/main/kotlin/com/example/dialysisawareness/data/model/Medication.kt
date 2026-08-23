package com.example.dialysisawareness.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medications")
data class Medication(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val dosage: String,
    val frequency: String, // e.g., "Once daily", "Twice daily"
    val prescribedDate: Long,
    val reason: String,
    val sideEffects: String = "",
    val isTaken: Boolean = false,
    val nextDoseTime: Long? = null
)