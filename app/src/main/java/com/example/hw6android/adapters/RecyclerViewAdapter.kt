package com.example.hw6android.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw6android.Person
import com.example.hw6android.R

class RecyclerViewAdapter (private val list: List<Person>): RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {


    class RecyclerViewHolder(item: View) : RecyclerView.ViewHolder(item){
        private val img = itemView.findViewById<ImageView>(R.id.img)
        private val firstName: TextView = itemView.findViewById(R.id.firstName)
        private val lastName: TextView = itemView.findViewById(R.id.lastName)

        fun bindPerson(person: Person) {

            Glide.with(itemView)
                .load(person.imgURL)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(img)

            firstName.text = person.firstName
            lastName.text = person.lastName

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindPerson(list[position])
    }

}