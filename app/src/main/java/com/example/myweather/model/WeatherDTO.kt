package com.example.myweather.model

import java.util.concurrent.locks.Condition

class WeatherDTO(
        val fact: FactDTO?
)

data class FactDTO(
        val temp: Int?,
        val feels_like: Int?,
        val condition: String?
)