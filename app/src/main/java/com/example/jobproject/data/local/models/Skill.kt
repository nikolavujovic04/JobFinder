package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "skills")
data class Skill(
    @PrimaryKey val id: Int,
    val name: String,
    val category: String
)