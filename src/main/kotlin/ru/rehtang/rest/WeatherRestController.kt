package ru.rehtang.rest

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.rehtang.dto.ApiResponseDto
import ru.rehtang.dto.MetricSystem
import ru.rehtang.dto.RequestDto
import ru.rehtang.service.WeatherProviderService

@RestController
class WeatherRestController(private val service: WeatherProviderService) {

  @PostMapping("/weather")
  fun getWeather(@RequestBody requestDto: RequestDto): ApiResponseDto {
    println(requestDto.city)
    return service.receiveWeather(
      requestDto.city,
      requestDto.language,
      requestDto.metricSystem ?: MetricSystem.STANDARD
    )
  }
}
