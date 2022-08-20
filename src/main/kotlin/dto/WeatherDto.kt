package dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
class WeatherDto {
    private val id: Int? = null
    private val main: String? = null
    private val description: String? = null
    private val icon: String? = null
}