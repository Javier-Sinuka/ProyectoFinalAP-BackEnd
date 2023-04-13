package com.contenidoPortafolio.contenidoPortafolioExperiencia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/login")
                        .allowedOrigins("http://localhost:4200")
//                        .allowedOrigins("https://frontend-argentinaprogra-e915a.web.app")
                        .allowedMethods("*")
                        .exposedHeaders("*");

                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:4200")
//                        .allowedOrigins("https://frontend-argentinaprogra-e915a.web.app")
                        .allowedMethods("*");

//                registry.addMapping("/api/laboral/listaLaboral")
//                        .allowedOrigins("http://localhost:4200")
////                        .allowedOrigins("https://frontend-argentinaprogra-e915a.web.app")
//                        .allowedMethods("*");
            }
        };
    }
}
