package ru.rehtang.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
  @Bean
  open fun openApi(): OpenAPI {
    return OpenAPI().servers(serverList()).info(apiInfo())
  }

  private fun apiInfo(): Info {
    return Info()
      .title("OpenWeather Provider Service")
      .description("Сервис по получению погоды от сервиса погоды")
      .version("1.0")
      .contact(
        Contact()
          .name("Danil")
          .email("daniltc23@gmail.com")
          .url("https://github.com/Rehtang/openweatherapi")
      )
  }

  private fun serverList(): List<Server> {
    return listOf(Server().url("/").description("localhost"))
  }
}
