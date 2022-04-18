package ru.netology.radio;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    @Test

    void shouldGetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.currentRadioStation = 6;

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    void shouldSetNextRadioStation() {
        Radio radio = new Radio();

     radio.setNextRadioStation(4);

     int expected = 4;
     int actual = radio.setNextRadioStation(4);

     assertEquals(expected, actual);
    }




}