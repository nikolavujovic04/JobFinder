package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "job"
)
data class Job(
    @PrimaryKey val id: Int,
    val title: String,
    val category: String,
    val jobType: String,
    val description: String
)