package com.hunglp.behavior.obsever;

public class PhoneDisplay implements Observer{

    private String weatherOnPhone;

    @Override
    public void update(String weather) {
        this.weatherOnPhone = weather;
        System.out.println("PhoneDisplay | Weather updated: " + this.weatherOnPhone);
    }

    @Override
    public void getCurrentWeather() {
        System.out.println("PhoneDisplay | Current weather: " + this.weatherOnPhone);
    }


}
