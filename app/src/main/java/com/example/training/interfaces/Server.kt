package com.example.training.interfaces

import com.example.training.model.Person

interface Server {
    fun loadData(): List<Person>
}