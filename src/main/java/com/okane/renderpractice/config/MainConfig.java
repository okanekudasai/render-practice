package com.okane.renderpractice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MainConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        // 모든 경로에 대해 모든 HTTP 메서드에 대한 CORS를 허용
        registry.addMapping("/**")
            // .allowedOrigins(frontHost, frontHostCname, frontLocalHost)
            .allowedOrigins("*")
            .allowedMethods("*");
//            .allowCredentials(true)
//            .allowedHeaders("*");
    }
}