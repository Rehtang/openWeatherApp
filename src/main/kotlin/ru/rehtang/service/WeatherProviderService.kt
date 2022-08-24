package ru.rehtang.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.rehtang.dto.ApiResponseDto
import ru.rehtang.dto.Language
import ru.rehtang.dto.MetricSystem
import ru.rehtang.openWeather.feign.OpenWeatherFeignClient

@Service
class WeatherProviderService(private val client: OpenWeatherFeignClient) {

  @Value("\${openWeatherApi.feign.apiKey}") lateinit var openWeatherApiKey: String

  fun receiveWeather(
    city: String?,
    language: Language?,
    metricSystem: MetricSystem?
  ): ApiResponseDto {
    return client.receiveWeather(city, openWeatherApiKey, language, metricSystem)
  }
}
