package ru.netology.domain;

public class Conditioner {

    private String name;
    private int currentTemperature;
    private int maxTemperature = 30;
    private int minTemperature = 10;
    private boolean on;

    public int getCurrentTemperature(){
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature){
        this.currentTemperature = currentTemperature;
    }

    public void increaseTemperature() {
        if (currentTemperature >= maxTemperature){
            this.currentTemperature = maxTemperature;
        }
        if (currentTemperature < maxTemperature){
            this.currentTemperature = currentTemperature + 1;
        }
    }

    public void decreaseTemperature() {
        if (currentTemperature <= minTemperature){
            this.currentTemperature = minTemperature;
        }
        if (currentTemperature > minTemperature){
            this.currentTemperature = currentTemperature - 1;
        }
    }

}
