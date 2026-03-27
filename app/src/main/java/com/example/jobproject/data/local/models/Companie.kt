package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "companies",
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
    )
data class Companie(
    @PrimaryKey val userId: Int,
    val companyName: String,
    val industry: String = "",
    val description: String = ""
)