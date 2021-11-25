package com.ljs.and.viewpagerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.ljs.and.viewpagerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val textList = listOf("VIEW A", "VIEW B", "VIEW C", "VIEW D")
        val customAdapter = CustomPagerAdapter()
        customAdapter.textList = textList
        binding.viewPager.adapter = customAdapter

        val tabTitles = listOf("뷰A", "뷰B", "뷰C", "뷰D")
        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            tab.text = tabTitles[position]
        }.attach()

    }



}