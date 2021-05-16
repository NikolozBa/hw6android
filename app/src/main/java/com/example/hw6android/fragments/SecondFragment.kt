package com.example.hw6android.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.hw6android.R

class SecondFragment : Fragment(R.layout.fragment_second){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.text).text = arguments?.getString("STRING")

    }

}