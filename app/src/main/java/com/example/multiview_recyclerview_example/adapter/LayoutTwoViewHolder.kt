package com.example.multiview_recyclerview_example.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.multiview_recyclerview_example.databinding.ItemLayoutSecondBinding
import com.example.multiview_recyclerview_example.model.LayoutTwo

class LayoutTwoViewHolder(
    private val binding: ItemLayoutSecondBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(layoutTwo: LayoutTwo) {
        binding.layoutTwo = layoutTwo
    }
}