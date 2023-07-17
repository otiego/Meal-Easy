package com.rondroid.mealsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

            if((binding.breakfastETv.text.isEmpty() || binding.lunchETv.text.isEmpty() || binding.dinnerETv.text.isEmpty())){
                Toast.makeText(applicationContext,"One or more details is missing!",Toast.LENGTH_LONG).show()
            }
            else {
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

        binding.button.setOnClickListener {
            val intent =  Intent(applicationContext,Complete::class.java)

            if ((binding.dayTv.text!="Saturday" && (binding.breakfastETv.text.isEmpty() && binding.lunchETv.text.isEmpty() && binding.dinnerETv.text.isEmpty()))) {
                Log.d("Cont","It worked")
                Toast.makeText(applicationContext,"Fill in all the details to proceed",Toast.LENGTH_LONG).show()
            }
            else
                startActivity(intent)
        }
    }

    private fun display(meal: Meal){
       binding.dayTv.text = meal.days
    }

    data class Meal(val days:String)
}