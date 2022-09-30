package com.example.multiview_recyclerview_example.model

import android.graphics.drawable.Drawable

data class LayoutTwo(
    override val title: String,
    override val image: Drawable?,
    val date: String
) : Data()