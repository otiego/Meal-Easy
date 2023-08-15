package com.rondroid.mealsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rondroid.mealsimple.databinding.ActivityCompleteBinding

//import com.rondroid.mealsimple.databinding.ActivityCompleteBinding

class Complete : AppCompatActivity() {

//    private lateinit var binding:ActivityCompleteBinding
    private lateinit var binding : ActivityCompleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

//        binding = ActivityCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextTv.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        }
    }
