package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val username: String,
    val email: String,
    val password: String,
    val role: UserRole,
    val syncStatus: SyncStatus = SyncStatus.CREATED
)

enum class UserRole{
    COMPANY,
    JOB_SEEKER
}