package com.demo.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//weaherapp calss uygulamnn propertilerini okndgu class
@SpringBootApplication
@EnableConfigurationProperties(WeatherAppProperties.class)
public class WeatherappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherappApplication.class, args);
    }

}
