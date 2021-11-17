package com.example.tugasdesigndashboard_ahmadaufaghanidiyonosaputro_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val furnitureList1 = listOf<Furniture>(
            Furniture(R.drawable.chair_1,
            "White Balcony Chair",
            "Chair",
            "Rp 350.000,00"),

            Furniture(R.drawable.chair_2,
            "White Lounge Chair",
            "Chair",
            "Rp 250.000,00"),

            Furniture(R.drawable.chair_3,
            "Grey Living Room Sofa",
            "Chair",
            "Rp 150.000,00"),

            Furniture(R.drawable.chair_4,
            "Grey Balcony Chair",
            "Chair",
            "Rp 100.000,00")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.furniture_list)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FurnitureAdapter(this, furnitureList1) {
        }

        val furnitureList2 = listOf<Furniture>(
            Furniture(R.drawable.chair_5,
            "Occasional Chair Grey",
            "A comfortable grey chair for family.",
            "Rp. 500.000,00"),

            Furniture(R.drawable.chair_6,
            "Modern Grey Chair",
            "A comfortable grey chair for family.",
            "Rp. 350.000,00"),

            Furniture(R.drawable.chair_7,
                "Dark Oak Wooden Chair",
                "A comfortable wooden chair for family.",
                "Rp. 250.000,00"),

            Furniture(R.drawable.chair_8,
                "Oak Wooden Chair",
                "A comfortable wooden chair for family.",
                "Rp. 150.000,00")
        )
        val recyclerView2 = findViewById<RecyclerView>(R.id.furniture_list2)
        recyclerView2.layoutManager = LinearLayoutManager(this)
        recyclerView2.setHasFixedSize(true)
        recyclerView2.adapter = FurnitureAdapter2(this, furnitureList2){

        }
    }
}