package com.example.training.viewmodel

import androidx.lifecycle.ViewModel
import com.example.training.interfaces.Server
import com.example.training.model.Person
import com.example.training.utils.DataUtil

class MainViewModel : ViewModel(), Server {
    private var person: Person? = null

    override fun loadData(): List<Person> {
        return DataUtil.data
    }

    fun setPerson(person: Person){
        this.person = person
    }

    fun getPerson() = person
}