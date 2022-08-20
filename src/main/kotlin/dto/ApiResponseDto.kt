package dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class ApiResponseDto {
    private val id: Int? = null
    private val cod: Int? = null
    private val name: String? = null
    private val coord: CoordDto? = null
    private val weather: List<WeatherDto>? = null
    private val base: BaseDto? = null
    private val main: MainDto? = null
    private val wind: WindDto? = null
}