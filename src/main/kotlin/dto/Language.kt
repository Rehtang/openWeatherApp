package dto

import lombok.Getter
import lombok.RequiredArgsConstructor

@Getter
@RequiredArgsConstructor
enum class Language(private val code: String? = null) {
    RU("ru"), EN("en"), FR("fr")
}