package com.example.jobproject.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jobproject.data.local.dao.CompanieDao
import com.example.jobproject.data.local.dao.JobSeekerDao
import com.example.jobproject.data.local.dao.UserDao
import com.example.jobproject.data.local.models.Companie
import com.example.jobproject.data.local.models.JobSeeker
import com.example.jobproject.data.local.models.User
import com.example.jobproject.data.local.type_converters.DataTypeConverter

@Database(
    entities = [
        User::class,
        Companie::class,
        JobSeeker::class
               ],
    version = 1,
    exportSchema = false)

@TypeConverters(DataTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun companieDao(): CompanieDao
    abstract fun jobSeekerDao(): JobSeekerDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context = context.applicationContext,
                    klass = AppDatabase::class.java,
                    name = "job_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}