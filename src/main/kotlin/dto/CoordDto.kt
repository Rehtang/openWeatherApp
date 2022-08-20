package dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
class CoordDto {
    private val lon: Float? = null
    private val lat: Float? = null
}