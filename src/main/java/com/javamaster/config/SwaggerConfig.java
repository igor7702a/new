package com.javamaster.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author upagge 26.05.2022
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("For test project!")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("gklsov@mail.ru")
                                                .url("https://tass.ru")
                                                .name(" Tarasov Igor")
                                )
                );
    }

}
