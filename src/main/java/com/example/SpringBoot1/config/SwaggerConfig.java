package com.example.SpringBoot1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket postApi() {


        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.SpringBoot1")).paths(regex("/api/employees.*")).build();
    }

//
//    private ApiInfo metaInfo() {
//
//        return new ApiInfo(
//                "Spring Boot Swagger Example API",
//                "Spring Boot Swagger Example API for Youtube",
//                "1.0",
//                "Terms of Service",
//                new Contact("Daivik", "https://www.youtube.com/TechPrimers",
//                        "techprimerschannel@gmail.com"),
//                "Apache License Version 2.0",
//                "https://www.apache.org/licesen.html"
//        );
//    }
}

//
//
//    private ApiInfo apiInfo() {
//
//
//        return new ApiInfoBuilder()
//        			.title(String.valueOf(title))
//        			.description(String.valueOf(description))
//        			.version(version)
//        			.contact(new Contact("Daivik", "gmail.com","daivik.softvan@gmail.com"))
//        			.build();
//        	}


