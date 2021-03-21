package com.example.myweather.utils

import com.example.myweather.model.FactDTO
import com.example.myweather.model.Weather
import com.example.myweather.model.WeatherDTO
import com.example.myweather.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!,
            fact.icon))
}