package dto

import lombok.Getter
import lombok.RequiredArgsConstructor

@Getter
@RequiredArgsConstructor
enum class MetricSystem(private val metricCode: String? = null) {
  STANDARD("standard"),
  METRIC("metric"),
  IMPERIAL("imperial")
}
