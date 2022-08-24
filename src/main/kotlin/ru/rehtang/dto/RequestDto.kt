package ru.rehtang.dto

data class RequestDto (
    var city: String? = null,
    var language: Language? = null,
    var metricSystem: MetricSystem? = null
)
