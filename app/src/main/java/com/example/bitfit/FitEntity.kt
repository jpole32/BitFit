package com.example.bitfit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fitness_table")
data class FitEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hoursOfSleep") val headline: String?,
    @ColumnInfo(name = "moods") val articleAbstract: String?
)