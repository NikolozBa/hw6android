package com.example.hw6android.adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw6android.fragments.FirstFragment
import com.example.hw6android.fragments.SecondFragment
import com.example.hw6android.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity){


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment().apply {
                arguments = Bundle().apply {
                    putString("STRING", "teststr")
                }
            }
            2 -> ThirdFragment()
            else-> FirstFragment()
        }
    }

}