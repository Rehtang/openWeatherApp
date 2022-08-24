package ru.rehtang.dto

data class WeatherDto(
  var id: Int? = null,
  var main: String? = null,
  var description: String? = null,
  var icon: String? = null
)
