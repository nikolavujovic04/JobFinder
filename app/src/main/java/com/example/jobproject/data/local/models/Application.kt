package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(
    tableName = "application",
    foreignKeys = [ForeignKey(
        entity = JobSeeker::class,
        parentColumns = ["userId"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    ), ForeignKey(
        entity = JobPosting::class,
        parentColumns = ["idJobPosting"],
        childColumns = ["idJobPosting"],
        onDelete = ForeignKey.CASCADE
    )])

data class Application(
    @PrimaryKey val applicationId: Int,
    val status: String,
    val coverLetter: String,
    val appliedAt: LocalDate
)