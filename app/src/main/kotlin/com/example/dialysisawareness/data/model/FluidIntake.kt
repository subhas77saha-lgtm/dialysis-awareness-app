package com.example.dialysisawareness.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fluid_intake")
data class FluidIntake(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Long,
    val beverage: String, // e.g., "Water", "Coffee", "Juice"
    val amount: Double, // in mL
    val time: String,
    val notes: String = ""
)