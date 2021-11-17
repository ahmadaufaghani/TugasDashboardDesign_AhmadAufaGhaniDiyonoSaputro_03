package com.example.tugasdesigndashboard_ahmadaufaghanidiyonosaputro_03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FurnitureAdapter2(private val context: Context, private val furniture: List<Furniture>, val listener: (Furniture) -> Unit)
    : RecyclerView.Adapter<FurnitureAdapter2.FurnitureViewHolder>() {

    class FurnitureViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgFurniture = view.findViewById<ImageView>(R.id.item_image)
        val nameFurniture = view.findViewById<TextView>(R.id.item_name)
        val descFurniture = view.findViewById<TextView>(R.id.item_desc)
        val priceFurniture = view.findViewById<TextView>(R.id.item_price)

        fun bindView(furniture: Furniture, listener: (Furniture) -> Unit ) {
            imgFurniture.setImageResource(furniture.imgItem)
            nameFurniture.text = furniture.nameItem
            descFurniture.text = furniture.descItem
            priceFurniture.text = furniture.priceItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FurnitureViewHolder {
        return FurnitureViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FurnitureViewHolder, position: Int) {
        holder.bindView(furniture[position],listener)
    }

    override fun getItemCount(): Int = furniture.size
}