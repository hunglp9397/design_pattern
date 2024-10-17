package com.hunglp.behavior.obsever;

public class TVDisplay implements Observer{

    private String weatherOnTV;

    @Override
    public void update(String weather) {
        this.weatherOnTV = weather;
        System.out.println("TV Display|Weather updated: " + this.weatherOnTV);
    }

    @Override
    public void getCurrentWeather(){
        System.out.println("TV Display|Current weather: "+ this.weatherOnTV);
    }
}
