package com.rondroid.mealsimple

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Meals(
    var breakfast:String = "",
    var lunch:String = "",
    var dinner:String = ""
) {
    @PrimaryKey(autoGenerate = true) var id:Int =0
}