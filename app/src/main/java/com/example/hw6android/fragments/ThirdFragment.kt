package com.example.hw6android.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw6android.Person
import com.example.hw6android.R
import com.example.hw6android.adapters.RecyclerViewAdapter


class ThirdFragment : Fragment(R.layout.fragment_third){

    private lateinit var recycler : RecyclerView
    private lateinit var adapter : RecyclerViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler = view.findViewById(R.id.recycler)
        adapter = RecyclerViewAdapter(getData())

        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = adapter


    }

    private fun getData(): List<Person> {

        val persons = ArrayList<Person>()

        persons.add(
            Person(
                1,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Donald_Trump_official_portrait.jpg/1200px-Donald_Trump_official_portrait.jpg",
                "donald",
                "trump"
            )
        )

        persons.add(
            Person(
                2,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/1200px-President_Barack_Obama.jpg",
                "barack",
                "obama"
            )
        )

        persons.add(
            Person(
                3,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/George-W-Bush.jpeg/1200px-George-W-Bush.jpeg",
                "george",
                "bush"
            )
        )

        persons.add(
            Person(
                4,
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Bill_Clinton.jpg",
                "bill",
                "clinton"
            )
        )

        persons.add(
            Person(
                5,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/George_H._W._Bush_presidential_portrait_%28cropped%29.jpg/1200px-George_H._W._Bush_presidential_portrait_%28cropped%29.jpg",
                "george",
                "h.w. bush"
            )
        )

        persons.add(
            Person(
                6,
                "https://upload.wikimedia.org/wikipedia/commons/1/16/Official_Portrait_of_President_Reagan_1981.jpg",
                "ronald",
                "reagan"
            )
        )

        return persons


    }

}