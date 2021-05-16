package com.example.hw6android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.hw6android.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tab: TabLayout
    private lateinit var pager: ViewPager2
    private lateinit var adapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab = findViewById(R.id.tabLayout)
        pager = findViewById(R.id.viewpager)
        adapter = ViewPagerFragmentAdapter(this)

        pager.adapter = adapter

        TabLayoutMediator(tab, pager){tab, position ->
            tab.text = "object ${position +1}"
        }.attach()
    }
}