package com.example.training.model

import androidx.annotation.DrawableRes

data class Person(
    val name: String,
    val surname: String,
    val hobby: String,
    val birthDate: String,
    val city: String,
    @DrawableRes val image: Int
)
