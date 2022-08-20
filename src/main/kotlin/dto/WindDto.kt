package dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
class WindDto {
    private val speed: Float? = null
    private val gust: Float? = null
    private val deg: Int? = null
}