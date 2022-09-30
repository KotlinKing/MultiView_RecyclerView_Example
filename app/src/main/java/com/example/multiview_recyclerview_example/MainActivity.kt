package com.example.multiview_recyclerview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiview_recyclerview_example.adapter.DataAdapter
import com.example.multiview_recyclerview_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewData = binding.rvData
        val dataList = DummyData.getDummyData(this)
        val newsAdapter = DataAdapter(dataList)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerViewData.adapter = newsAdapter
        recyclerViewData.layoutManager = layoutManager
        recyclerViewData.setHasFixedSize(true)
        recyclerViewData.addItemDecoration(
            DividerItemDecoration(
                this,
                layoutManager.orientation
            )
        )
    }
}