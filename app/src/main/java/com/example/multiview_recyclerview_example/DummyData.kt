package com.example.multiview_recyclerview_example

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.multiview_recyclerview_example.model.Data
import com.example.multiview_recyclerview_example.model.LayoutOne
import com.example.multiview_recyclerview_example.model.LayoutTwo

object DummyData {
    fun getDummyData(context: Context): List<Data> {
        val dataList = arrayListOf<Data>()

        val layoutOne1 = LayoutOne(
                "Large One Title 1",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_one),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )
        val layoutTwo1 = LayoutTwo(
            "Layout Two Title 1",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_second),
            "23.01.2022"
        )
        val layoutTwo2 = LayoutTwo(
            "Layout Two Title 2",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_second),
            "22.01.2022"
        )
        val layoutOne2 = LayoutOne(
            "Layout One Title 2",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_one),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )
        val layoutTwo3 = LayoutTwo(
            "Layout Two Title 3",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_second),
            "21.01.2022"
        )
        val layoutTwo4 = LayoutTwo(
            "Layout Two Title 4",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_second),
            "20.01.2022"
        )
        val layoutOne3 = LayoutOne(
            "Layout One Title 3",
            ContextCompat.getDrawable(context, R.drawable.ic_layout_one),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )

        dataList.add(layoutOne1)
        dataList.add(layoutTwo1)
        dataList.add(layoutTwo2)
        dataList.add(layoutOne2)
        dataList.add(layoutTwo3)
        dataList.add(layoutTwo4)
        dataList.add(layoutOne3)
        return dataList
    }
}