package com.example.training.utils

import com.example.training.model.Person
import com.example.training.R

object DataUtil {
    private val person1 =
        Person(
            name = "John",
            surname = "Doe",
            hobby = "Disappearing",
            birthDate = "01.01.1900",
            city = "Who knows?",
            image = R.drawable.logo
        )
    private val person2 =
        Person(
            name = "Johnny",
            surname = "Does",
            hobby = "Disappearing",
            birthDate = "01.01.1900",
            city = "Who knows?",
            image = R.drawable.logo
        )
    private val person3 =
        Person(
            name = "Jane",
            surname = "Doe",
            hobby = "Disappearing",
            birthDate = "01.01.1900",
            city = "Who knows?",
            image = R.drawable.logo
        )
    val data = listOf(person1, person2, person3)
}