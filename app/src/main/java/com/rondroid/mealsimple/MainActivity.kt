package com.rondroid.mealsimple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.rondroid.mealsimple.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayListDay = arrayListOf<HomeModel>()

        arrayListDay.add(HomeModel("Sunday"))
        arrayListDay.add(HomeModel("Monday"))
        arrayListDay.add(HomeModel("Tuesday"))
        arrayListDay.add(HomeModel("Wednesday"))
        arrayListDay.add(HomeModel("Thursday"))
        arrayListDay.add(HomeModel("Friday"))
        arrayListDay.add(HomeModel("Saturday"))

        val myAdapter = AdapterHome(arrayListDay, context = this)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        recyclerView1.adapter = myAdapter
    }
}