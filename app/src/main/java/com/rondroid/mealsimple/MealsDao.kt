package com.rondroid.mealsimple

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MealsDao {

    @Insert
    suspend fun addMeal(meals: Meals)

    @Query("SELECT * FROM meals ORDER BY id DESC")
    suspend fun getAllMeal():List<Meals>

    @Delete
    suspend fun deleteMeal(meals: Meals)
}