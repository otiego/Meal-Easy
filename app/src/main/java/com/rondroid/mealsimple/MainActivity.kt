package com.rondroid.mealsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rondroid.mealsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var numberClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (numberClicked == 0){
            display(Meal("Sunday"))
        }


        binding.nextTv.setOnClickListener {
            numberClicked++

            when(numberClicked % 7){
                0 -> display(Meal("Sunday"))
                1 -> display(Meal("Monday"))
                2 -> display(Meal("Tuesday"))
                3 -> display(Meal("Wednesday"))
                4 -> display(Meal("Thursday"))
                5 -> display(Meal("Friday"))
                6-> display(Meal("Saturday"))
            }
        }
    }

    private fun display(meal: Meal){
       binding.dayTv.text = meal.days
    }

    data class Meal(val days:String)
}