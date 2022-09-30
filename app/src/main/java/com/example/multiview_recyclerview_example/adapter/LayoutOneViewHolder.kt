package com.example.multiview_recyclerview_example.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.multiview_recyclerview_example.databinding.ItemLayoutOneBinding
import com.example.multiview_recyclerview_example.model.LayoutOne

class LayoutOneViewHolder(
    private val binding: ItemLayoutOneBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(layoutOne: LayoutOne) {
        binding.layoutOne = layoutOne
    }
}