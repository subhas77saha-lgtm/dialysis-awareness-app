package com.example.dialysisawareness.data.model

data class EducationContent(
    val id: Int,
    val title: String,
    val category: String,
    val description: String,
    val content: String,
    val imageUrl: String? = null,
    val videoUrl: String? = null,
    val readTime: Int // in minutes
)

val educationContents = listOf(
    EducationContent(
        id = 1,
        title = "Understanding Dialysis",
        category = "Basics",
        description = "Learn the fundamentals of how dialysis works",
        content = "Dialysis is a treatment that filters wastes and water from your blood when your kidneys can no longer do this job. There are different types of dialysis including hemodialysis and peritoneal dialysis.",
        readTime = 5
    ),
    EducationContent(
        id = 2,
        title = "Nutrition for Dialysis Patients",
        category = "Nutrition",
        description = "Dietary guidelines for maintaining health during dialysis",
        content = "A proper diet is essential for dialysis patients. You may need to limit sodium, potassium, phosphorus, and protein intake. Work with your dietitian to create a meal plan.",
        readTime = 7
    ),
    EducationContent(
        id = 3,
        title = "Managing Fluid Intake",
        category = "Lifestyle",
        description = "Tips for controlling fluid intake between treatments",
        content = "Limiting fluid intake is important as your kidneys cannot regulate fluid balance. This includes water, beverages, and foods with high water content.",
        readTime = 6
    ),
    EducationContent(
        id = 4,
        title = "Vascular Access Care",
        category = "Care",
        description = "How to care for your fistula or graft",
        content = "Your vascular access is crucial for dialysis. Keep it clean, avoid heavy lifting with that arm, and watch for signs of infection or problems.",
        readTime = 5
    )
)