package com.example.multiview_recyclerview_example.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiview_recyclerview_example.databinding.ItemLayoutOneBinding
import com.example.multiview_recyclerview_example.databinding.ItemLayoutSecondBinding
import com.example.multiview_recyclerview_example.model.Data
import com.example.multiview_recyclerview_example.model.DataType
import com.example.multiview_recyclerview_example.model.LayoutOne
import com.example.multiview_recyclerview_example.model.LayoutTwo

class DataAdapter(
    private val newsList: List<Data>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var bindingLayoutOne: ItemLayoutOneBinding
    private lateinit var bindingLayoutTwo: ItemLayoutSecondBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            DataType.LAYOUT_ONE.value -> {
                bindingLayoutOne = ItemLayoutOneBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LayoutOneViewHolder(bindingLayoutOne)
            }
            DataType.LAYOUT_TWO.value -> {
                bindingLayoutTwo = ItemLayoutSecondBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LayoutTwoViewHolder(bindingLayoutTwo)
            }
            else -> {
                bindingLayoutOne = ItemLayoutOneBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LayoutOneViewHolder(bindingLayoutOne)
            }
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(newsList[position]){
            is LayoutOne -> {
            (holder as LayoutOneViewHolder).bind(newsList[position] as LayoutOne)
            }
            is LayoutTwo -> {
                (holder as LayoutTwoViewHolder).bind(newsList[position] as LayoutTwo)
            }
        }
    }

    override fun getItemCount(): Int = newsList.size

    override fun getItemViewType(position: Int): Int =
        when (newsList[position]) {
            is LayoutOne -> {
                DataType.LAYOUT_ONE.value
            }
            is LayoutTwo -> {
                DataType.LAYOUT_TWO.value
            }
            else -> {
                DataType.LAYOUT_ONE.value
            }
        }
}
