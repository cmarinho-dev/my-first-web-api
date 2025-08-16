package br.com.marinho.my_first_web_api.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "My First Web API",
                version = "1.0",
                description = "Example of API with Spring Boot 3 and OpenAPI 3 (Swagger UI)"
        )
)
public class SwaggerConfig {}
