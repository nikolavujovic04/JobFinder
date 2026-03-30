package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(
    tableName = "job_postings",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
    )
data class JobPosting(
    @PrimaryKey val idJobPosting: Int,
    val status: String,
    val salaryMin: Double,
    val salaryMax: Double,
    val location: String,
    val postedAt: LocalDate,
    val expiresAt: LocalDate
)