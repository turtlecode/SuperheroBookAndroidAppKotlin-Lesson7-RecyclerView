package com.turtlecode.super_hero_book_youtube

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class Adapter(val hero_list : ArrayList<String>,
              val hero_image : ArrayList<Int>,
              val information : ArrayList<String>) : RecyclerView.Adapter<Adapter.SuperHeroVH>() {
    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperHeroVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.recycler_texview.text = hero_list.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Information_activity::class.java)
            intent.putExtra("superhero_information", information.get(position))
            intent.putExtra("superhero_image",hero_image.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return hero_list.size
    }

}