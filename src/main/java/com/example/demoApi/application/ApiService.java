package com.example.demoApi.application;

import com.example.demoApi.domain.WeatherFeature;
import com.example.demoApi.infrastracture.ApiRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApiService {
    private final ApiRepository apiRepository;

    public WeatherFeature getWeatherFeature(){
        return apiRepository.getWeather();
    }
}

