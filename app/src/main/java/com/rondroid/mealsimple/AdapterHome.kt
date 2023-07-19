package com.rondroid.mealsimple

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_two.view.*

class AdapterHome (private val arrayDays:ArrayList<HomeModel>, val context: Context):RecyclerView.Adapter<AdapterHome.ViewHolderHome>(){
    class ViewHolderHome(binding: View):RecyclerView.ViewHolder(binding){
        fun bindItems(homeModel: HomeModel){
            itemView.dayTv.text = homeModel.day
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHome {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_two,parent,false)
        return ViewHolderHome(view)
    }

    override fun onBindViewHolder(holder: ViewHolderHome, position: Int) {
        holder.bindItems(arrayDays[position])
    }

    override fun getItemCount(): Int {
        return arrayDays.size
    }
}