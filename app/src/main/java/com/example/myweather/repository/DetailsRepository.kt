package com.example.myweather.repository

import com.example.myweather.model.WeatherDTO
import retrofit2.Callback

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
            lat: Double,
            lon: Double,
            callback: Callback<WeatherDTO>
    )
}