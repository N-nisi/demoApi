package com.example.demoApi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor

public class WeatherFeature {
    private Property property;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Property{
        private WeatherList weatherList;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        public static class WeatherList{
            private Weather weatherFeature;

            @Data
            @AllArgsConstructor
            @NoArgsConstructor
            public static class Weather{
                private String type;
                private Integer date;
                private Integer rainfall;
                public Integer getRainfall() {
                    return rainfall;
                }
            }

        }
    }
}
