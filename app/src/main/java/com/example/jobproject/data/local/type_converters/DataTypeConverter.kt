package com.example.jobproject.data.local.type_converters

import androidx.room.TypeConverter
import java.time.LocalDate

class DataTypeConverter {
    @TypeConverter
    fun fromTimeStamp(value: Long?): LocalDate?{
        return value?.let { LocalDate.ofEpochDay(it) }
    }

    @TypeConverter
    fun dateToTimeSTAMP(date: LocalDate?): Long?{
        return date?.toEpochDay()
    }
}