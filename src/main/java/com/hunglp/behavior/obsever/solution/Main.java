package com.hunglp.behavior.obsever.solution;

public class Main {
    public static void main(String[] args) {
        TVDisplay tvDisplay = new TVDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        tvDisplay.getCurrentWeather();
        phoneDisplay.getCurrentWeather();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.add(tvDisplay);
        weatherStation.add(phoneDisplay);
        weatherStation.setWeather("Sunny");

        System.out.println("-----RESULT------");
        tvDisplay.getCurrentWeather();
        phoneDisplay.getCurrentWeather();

    }
}
