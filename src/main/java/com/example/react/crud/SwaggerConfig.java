package com.example.react.crud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "React CRUD API",          // Title of your API
        version = "1.0",                  // Version of your API
        description = "API documentation for React CRUD application" // Description of your API
    )
)
public class SwaggerConfig {
    // You can add additional configurations here if needed
}