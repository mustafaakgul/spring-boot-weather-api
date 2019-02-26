package com.demo.weatherapp.web;

import com.demo.weatherapp.ows.Weather;
import com.demo.weatherapp.ows.WeatherForecast;
import com.demo.weatherapp.ows.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiRestController {

    /*
    private final WeatherService weatherService;
    public WeatherApiRestController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }*/
    //ust satir yerine hemen altta yapilabilir
    @Autowired
    WeatherService weatherService;

    @RequestMapping("/hello")
    public String sayHello(){
        return "HelloWorld";

    }

    //herhangi hata durumu icin 301 ekleyelim ve inspect networkten grelim
    @RequestMapping("/now/{country}/{city}")
    public Weather getWeather(@PathVariable String country, @PathVariable String city, HttpServletResponse response){
        response.setStatus(301);
        return this.weatherService.getWeather(country, city);


    }

    @RequestMapping("/weekly/{country}/{city}")
    public WeatherForecast getWeatherForecast(@PathVariable String country, @PathVariable String city){
        return this.weatherService.getWeatherForecast(country, city);

    }
}
