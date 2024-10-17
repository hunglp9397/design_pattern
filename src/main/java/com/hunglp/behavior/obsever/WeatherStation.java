package com.hunglp.behavior.obsever;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observers = new ArrayList<>();
    String weather;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyEvent() {
        for(Observer observer : observers){
            observer.update(weather);
        }
    }

    void setWeather(String weather){
        this.weather = weather;
        notifyEvent();
    }

}
