package com.hunglp.behavior.obsever.issue;

public class WeatherStation {
    public void update(){
        String weather = getCurrentWeather();
        new PhoneDisplay().updateWeather(weather);
        new TVDisplay().updateWeather(weather);
    }

    public String getCurrentWeather() {
        return "temp: x" + "humidity: y" + "pressure: z";
    }

}


/*
- Vấn đề:
    + Không có cách nào để thêm mới hoặc xóa các thiết bị

* */
