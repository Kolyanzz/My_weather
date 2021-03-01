package com.example.myweather.viewmodel

import com.example.myweather.model.Weather

class AppState {
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}