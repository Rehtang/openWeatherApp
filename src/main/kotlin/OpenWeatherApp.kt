package ru.rehtang.openWeather

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class OpenWeatherApp

    fun main(args: Array<String>) {
        runApplication<OpenWeatherApp>(*args)
    }
