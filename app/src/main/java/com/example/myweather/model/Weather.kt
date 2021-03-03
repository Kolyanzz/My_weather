package com.example.myweather.model

data class Weather (
    val city: City = getDefaultCity(),
    val temperature: Int = -10,
    val feelsLike: Int = -17
)
fun getDefaultCity() = City("Благовещенск", lat = 48.4827, lon = 135.084)