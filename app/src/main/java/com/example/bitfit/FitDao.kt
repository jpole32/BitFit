package com.example.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FitDao {
    @Query("SELECT * FROM fitness_table")
    fun getAll(): Flow<List<FitEntity>>

    @Insert
    fun insertAll(articles: List<FitEntity>)

    @Query("DELETE FROM fitness_table")
    fun deleteAll()
}