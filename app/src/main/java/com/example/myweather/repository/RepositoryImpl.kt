package com.example.myweather.repository

import com.example.myweather.model.Weather
import com.example.myweather.model.getRussianCities
import com.example.myweather.model.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}
