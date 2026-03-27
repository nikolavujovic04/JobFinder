package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "job_seekers",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class JobSeeker(
    @PrimaryKey val id: Int,
    val firstName: String,
    val lastName: String,
    val bio: String = ""
)