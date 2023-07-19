package com.rondroid.mealsimple

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.MonthDay

@Entity
data class Meals(
    var day :String = "",
    var breakfast:String = "",
    var lunch:String = "",
    var dinner:String = ""
) {
    @PrimaryKey(autoGenerate = true) var id:Int =0
}