package ru.rehtang.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class MainDto(
  @JsonProperty("feels_like") var feelsLike: Float? = null,
  @JsonProperty("temp_min") var tempMin: Float? = null,
  var temp: Float? = null,
  @JsonProperty("temp_max") var tempMax: Float? = null,
  var pressure: Int? = null,
  var humidity: Int? = null,
  @JsonProperty("sea_level") var seaLevel: Int? = null,
  @JsonProperty("grnd_level") var grndLevel: Int? = null
)
