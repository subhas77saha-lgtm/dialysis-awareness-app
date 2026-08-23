package com.example.dialysisawareness.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appointments")
data class Appointment(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Long,
    val time: String,
    val doctorName: String,
    val clinicName: String,
    val clinicPhone: String,
    val appointmentType: String, // e.g., "Consultation", "Check-up"
    val notes: String = "",
    val reminderEnabled: Boolean = true
)