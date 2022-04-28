package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int minVolume;
    private int maxVolume = 100;
    private int numberOfStations = 10;



    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;

    }

    public Radio() {

    }



    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= minRadioStation) {
            return;
        }
        if (currentRadioStation > numberOfStations) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }



    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        }

    }

    public int getNextRadioStationFrom10To0() {
        return currentRadioStation;
    }

    public void setNextRadioStationFrom10To0() {
        this. currentRadioStation = minRadioStation;
    }

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation() {

        int newStation = currentRadioStation - 1;
        this.currentRadioStation = newStation;

    }

    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume= currentVolume;
    }


    public void setIncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

}
