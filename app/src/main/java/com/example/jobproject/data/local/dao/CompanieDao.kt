package com.example.jobproject.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.jobproject.data.local.models.Companie
import com.example.jobproject.data.local.models.Industry
import kotlinx.coroutines.flow.Flow

@Dao
interface CompanieDao {

    @Query("SELECT * FROM companies")
    fun getAllCompanies(): Flow<List<Companie>>

    @Query("SELECT * FROM companies WHERE userId = :userId")
    fun getCompanieById(userId: Int): Flow<Companie?>

    @Query("SELECT * FROM companies WHERE industry = :industry")
    fun getCompaniesByIndustry(industry: Industry): Flow<List<Companie>>

    @Query("SELECT * FROM companies WHERE companyName LIKE '%' || :query || '%'")
    fun searchCompaniesByName(query: String): Flow<List<Companie>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertCompani(companie: Companie)

    @Update
    suspend fun updateCompanie(companie: Companie)

    @Delete
    suspend fun deleteCompanie(companie: Companie)
}