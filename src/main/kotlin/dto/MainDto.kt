package dto

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
class MainDto {
    private val temp: Float? = null

    @JsonProperty("feels_like")
    private val feelsLike: Float? = null

    @JsonProperty("temp_min")
    private val tempMin: Float? = null

    @JsonProperty("temp_max")
    private val tempMax: Float? = null
    private val pressure: Int? = null
    private val humidity: Int? = null

    @JsonProperty("sea_level")
    private val seaLevel: Int? = null

    @JsonProperty("grnd_level")
    private val grndLevel: Int? = null
}