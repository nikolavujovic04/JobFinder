package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "job_seeker_skills",
    foreignKeys = [ForeignKey(
        entity = JobSeeker::class,
        parentColumns = ["id"],
        childColumns = ["jobSeekerId"],
        onDelete = ForeignKey.CASCADE
    ),
        ForeignKey(
            entity = Skill::class,
            parentColumns = ["id"],
            childColumns = ["skillId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class JobSeekerSkill(
    @PrimaryKey val id: Int,
    val jobSeekerId: Int,
    val skillId: Int,
    val level: Int
)