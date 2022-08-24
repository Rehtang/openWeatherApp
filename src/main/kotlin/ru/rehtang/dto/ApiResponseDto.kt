package ru.rehtang.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ApiResponseDto(
  var base: String? = null,
  var coord: CoordDto? = null,
  var weather: MutableList<WeatherDto>? = null,
  var id: Int? = null,
  var cod: Int? = null,
  var name: String? = null,
  var main: MainDto? = null,
  var wind: WindDto? = null
)
