package com.example.multiview_recyclerview_example.model

import android.graphics.drawable.Drawable

data class LayoutOne(
    override val title: String,
    override val image: Drawable?,
    val description: String
) : Data()
