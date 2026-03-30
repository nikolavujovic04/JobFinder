package com.example.jobproject.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.jobproject.data.local.models.JobSeeker
import kotlinx.coroutines.flow.Flow

@Dao
interface JobSeekerDao {
    @Query("SELECT * FROM job_seekers")
    fun getAllJobSeekers(): Flow<List<JobSeeker>>

    @Query("SELECT * FROM job_seekers WHERE userId = :userId")
    fun getJobSeekerById(userId: Int): Flow<JobSeeker?>

    @Query("SELECT * FROM job_seekers WHERE firstName LIKE '%' || :query || '%' OR lastName LIKE '%' || :query || '%'")
    fun searchJobSeekers(query: String): Flow<List<JobSeeker>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertJobSeeker(jobSeeker: JobSeeker)

    @Update
    suspend fun updateJobSeeker(jobSeeker: JobSeeker)

    @Delete
    suspend fun deleteJobSeeker(jobSeeker: JobSeeker)
}