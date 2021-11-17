package com.example.tugasdesigndashboard_ahmadaufaghanidiyonosaputro_03

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Furniture(
    val imgItem : Int,
    val nameItem : String,
    val descItem : String,
    val priceItem : String
): Parcelable
