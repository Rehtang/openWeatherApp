package ru.rehtang.openWeather.feign

import dto.ApiResponseDto
import dto.Language
import dto.MetricSystem
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@FeignClient(name = "openWeatherFeignClient", url = "\${openWeatherApi.feign.url}")
interface OpenWeatherFeignClient {
    @GetMapping("/weather")
    fun receiveWeather(
        @RequestParam("q") city: String?,
        @RequestParam("appid") apiKey: String?,
        @RequestParam("lang") language: Language?,
        @RequestParam("units") metricSystem: MetricSystem?
    ): ApiResponseDto?
}