package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int setNextRadioStation(int i) {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    public int getPrevRadioStation() {
        if (currentRadioStation < 1) {
            return 9;
        }
        this.currentRadioStation = currentRadioStation - 1;
        return currentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
    }

    public void setMaxVolume(int currentVolume) {
        if (currentVolume >= 10) {
            return;
        }
    }

    public void setMinVolume(int currentVolume) {
        if (currentVolume < 1) {
            return;
        }
    }
}
