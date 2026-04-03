package com.example.jobproject.data.local.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "job_skills",
    foreignKeys = [ForeignKey(
        entity = Skill::class,
        parentColumns = ["id"],
        childColumns = ["skillId"],
        onDelete = ForeignKey.CASCADE
    ),
        ForeignKey(
            entity = Job::class,
            parentColumns = ["id"],
            childColumns = ["jobId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class JobSkill(
    @PrimaryKey val id: Int,
    val required: Boolean,
    val skillId: Int,
    val jodId: Int
)