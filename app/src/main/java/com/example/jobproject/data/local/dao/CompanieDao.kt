package com.example.jobproject.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.example.jobproject.data.local.models.Companie
import kotlinx.coroutines.flow.Flow

@Dao
interface CompanieDao {

    @Query("SELECT * FROM companies")
    fun getAllCompanies(): Flow<List<Companie>>



    @Update
    suspend fun updateCompanie(companie: Companie)

    @Delete
    suspend fun deleteCompanie(companie: Companie)
}