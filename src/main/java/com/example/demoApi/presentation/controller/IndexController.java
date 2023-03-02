package com.example.demoApi.presentation.controller;

import com.example.demoApi.application.ApiService;
import com.example.demoApi.domain.WeatherFeature;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class IndexController {

    private final ApiService apiService;

    @GetMapping("/")
    public String index(Model model) {

        WeatherFeature response = apiService.getWeatherFeature();
        model.addAttribute("response",response);

        return "index";
    }

}
