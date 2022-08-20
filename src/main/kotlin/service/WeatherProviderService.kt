package service

import dto.ApiResponseDto
import dto.Language
import dto.MetricSystem
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.rehtang.openWeather.feign.OpenWeatherFeignClient

@Service
@RequiredArgsConstructor
class WeatherProviderService {
    private val client: OpenWeatherFeignClient? = null

    @Value("\${openWeatherApi.feign.apiKey}")
    private val openWeatherApiKey: String? = null
    fun receiveWeather(city: String?, language: Language?, metricSystem: MetricSystem?): ApiResponseDto {
        return client?.receiveWeather(city, openWeatherApiKey, language, metricSystem)
    }
}