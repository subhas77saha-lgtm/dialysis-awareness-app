# Dialysis Awareness Android Application

A comprehensive Android application designed to help dialysis patients manage their health, track treatment sessions, medications, fluid intake, and stay informed through educational resources.

## Features

### 1. **Dashboard**
- Real-time health metrics tracking
- Weight monitoring
- Blood pressure tracking
- Potassium and phosphorus levels
- Fluid intake visualization

### 2. **Treatment Session Management**
- Log treatment sessions with detailed information
- Track treatment duration and frequency
- Monitor fluid removal amounts
- Record blood pressure readings before and after treatment
- View treatment history

### 3. **Medication Management**
- Track prescribed medications
- Manage dosage and frequency
- Set medication reminders
- Document side effects
- Medication schedule planning

### 4. **Fluid Intake Tracking**
- Daily fluid intake logging
- Set fluid intake targets
- Visual progress tracking
- Historical data analysis

### 5. **Health Metrics**
- Record vital signs
- Weight tracking
- Blood pressure monitoring
- Laboratory values (glucose, potassium, phosphorus)
- Trend analysis

### 6. **Education Center**
- Comprehensive dialysis education
- Nutrition guidelines
- Lifestyle management tips
- Vascular access care
- Video resources
- Categorized content for easy navigation

### 7. **Appointments & Reminders**
- Schedule doctor appointments
- Treatment reminders
- Medication alerts
- Notification system

### 8. **Local Storage**
- All data stored locally on device
- Privacy-first approach
- Offline functionality
- Data backup capability

## Technical Stack

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Architecture:** MVVM with Clean Architecture
- **Database:** Room Database
- **Dependency Injection:** Hilt
- **Navigation:** Jetpack Navigation
- **Data Storage:** Jetpack DataStore
- **Async:** Kotlin Coroutines
- **Minimum SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)

## Project Structure

```
app/
├── src/main/kotlin/com/example/dialysisawareness/
│   ├── MainActivity.kt                 # Entry point
│   ├── data/
│   │   └── model/                      # Data models
│   │       ├── TreatmentSession.kt
│   │       ├── Medication.kt
│   │       ├── FluidIntake.kt
│   │       ├── HealthMetric.kt
│   │       ├── Appointment.kt
│   │       └── EducationContent.kt
│   └── ui/
│       ├── navigation/
│       │   └── AppNavigation.kt        # Navigation setup
│       ├── screens/                    # UI Screens
│       │   ├── HomeScreen.kt
│       │   ├── DashboardScreen.kt
│       │   ├── TreatmentScreen.kt
│       │   ├── MedicationScreen.kt
│       │   ├── EducationScreen.kt
│       │   └── SettingsScreen.kt
│       └── theme/
│           ├── Theme.kt
│           ├── Color.kt
│           └── Type.kt
├── AndroidManifest.xml                 # App manifest
└── build.gradle.kts                    # Build configuration
```

## Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK 34
- Kotlin 1.9.0 or later

### Installation

1. Clone the repository:
```bash
git clone https://github.com/subhas77saha-lgtm/dialysis-awareness-app.git
cd dialysis-awareness-app
```

2. Open in Android Studio:
   - File → Open → Select the project folder

3. Build the project:
   - Build → Make Project

4. Run the app:
   - Run → Run 'app'

## Future Enhancements

- [ ] Wearable device integration
- [ ] Cloud sync functionality
- [ ] Advanced analytics and reporting
- [ ] Doctor collaboration features
- [ ] Machine learning for health predictions
- [ ] Multi-language support
- [ ] Accessibility improvements
- [ ] Home screen widgets
- [ ] Health data export (PDF reports)
- [ ] Integration with health devices

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support, please email support@dialysisaware.com or open an issue on GitHub.

## Disclaimer

This application is designed as a health management tool and should not replace professional medical advice. Always consult with your healthcare provider before making any changes to your treatment plan.
