package com.example.demoApi.infrastracture;

import com.example.demoApi.domain.WeatherFeature;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ApiRepository {
    private static final String WEATHER_URL = "https://map.yahooapis.jp/weather/V1/place?coordinates=139.6246707,35.7239015&appid=dj00aiZpPXVFRVJIcHNuNWJuRSZzPWNvbnN1bWVyc2VjcmV0Jng9ZDc-&output=json";


    /**
     * WeatherAPI(GET)
     * I/F仕様書:https://developer.yahoo.co.jp/webapi/map/openlocalplatform/v1/weather.html
     *
     * @return WEATHER
     */
    public WeatherFeature getWeather(){
        //リクエストの送信
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(WEATHER_URL, WeatherFeature.class);
    }



}
