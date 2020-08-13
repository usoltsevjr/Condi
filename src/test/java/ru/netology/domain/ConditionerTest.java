package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncrease(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(25);
        conditioner.increaseTemperature();


        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseOverMax(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(30);
        conditioner.increaseTemperature();


        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseToMax(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(29);
        conditioner.increaseTemperature();


        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecrease(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(25);
        conditioner.decreaseTemperature();


        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseToMin(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(11);
        conditioner.decreaseTemperature();


        assertEquals(10, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseOverMin(){
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(10);
        conditioner.decreaseTemperature();


        assertEquals(10, conditioner.getCurrentTemperature());
    }

}