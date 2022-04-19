package ru.netology.radio;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    @Test
    void shouldGetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setNextRadioStation(4);

        int expected = 5;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(0);

        int expected = 9;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(3);

        int expected = 4;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume() {
        Radio radio = new Radio();

        radio.setDecreaseVolume(8);

        int expected = 7;
        int actual = radio.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(11);

        int expected = 10;
        int actual = radio.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        int expected = 0;
        int actual = radio.getMinVolume();

        assertEquals(expected, actual);
    }


}