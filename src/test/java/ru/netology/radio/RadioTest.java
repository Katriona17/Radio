package ru.netology.radio;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(14);

        int expected = 14;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationOverMax() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(16);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationUnder10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationOver10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationUnder0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStation() {
        Radio radio = new Radio(15);

        radio.setNextRadioStation(12);

        int expected = 13;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStationOverMax() {
        Radio radio = new Radio(15);

        radio.setNextRadioStation(16);

        int expected = 0;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStationUnder10() {
        Radio radio = new Radio();

        radio.setNextRadioStation(8);

        int expected = 9;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStationOver10() {
        Radio radio = new Radio();

        radio.setNextRadioStation(11);

        int expected = 0;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNextRadioStationFrom10To0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);
        radio.setNextRadioStationFrom10To0();

        int expected = 0;
        int actual = radio.getNextRadioStationFrom10To0();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStation() {
        Radio radio = new Radio(15);


        radio.setPrevRadioStation(11);

        int expected = 10;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStation0() {
        Radio radio = new Radio(15);


        radio.setPrevRadioStation(0);

        int expected = 14;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStationMax() {
        Radio radio = new Radio(15);

        radio.setPrevRadioStation(15);

        int expected = 14;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStationUnder10() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(6);

        int expected = 5;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStation10() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(10);

        int expected = 9;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevRadioStationMin() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(0);

        int expected = 9;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUnder0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSetIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.setIncreaseVolume();

        int expected = 4;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseVolumeOver100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.setIncreaseVolume();

        int expected = 100;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setDecreaseVolume();

        int expected = 7;
        int actual = radio.getDecreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetDecreaseVolumeUnder0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.setDecreaseVolume();

        int expected = 0;
        int actual = radio.getDecreaseVolume();

        assertEquals(expected, actual);
    }


}