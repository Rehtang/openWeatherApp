package dto

import lombok.Data
import lombok.Getter
import lombok.NoArgsConstructor

@Data
@Getter
@NoArgsConstructor
class RequestDto {
    private val city: String? = null
    private val language: Language? = null
    private val metricSystem: MetricSystem? = null
}