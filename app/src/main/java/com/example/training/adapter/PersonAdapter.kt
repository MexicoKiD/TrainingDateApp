package com.example.training.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.training.databinding.PersonRowBinding
import com.example.training.model.Person

class PersonAdapter(
    private val persons: List<Person>,
    private val onUserClick: (Person) -> Unit
) :
    RecyclerView.Adapter<PersonAdapter.MyViewHolder>() {

    inner class MyViewHolder(binding: PersonRowBinding): ViewHolder(binding.root) {
        val image = binding.imageViewRow
        val name = binding.nameRow
        val hobby = binding.hobbyRow

        init {
            binding.root.setOnClickListener{
                onUserClick(persons[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(PersonRowBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(persons[position].image)
        holder.name.text = persons[position].name
        holder.hobby.text = persons[position].hobby
    }

    override fun getItemCount(): Int {
        return persons.size
    }
}