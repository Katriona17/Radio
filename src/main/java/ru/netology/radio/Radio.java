package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            this.currentRadioStation = 9;
        }
    }

    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume= currentVolume;
    }


    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

    public void setMaxVolume(int currentVolume) {
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
        if (currentVolume < 10) {
            this.currentVolume = currentVolume;
        }
    }

    public int getMaxVolume() {
        return currentVolume;
    }

    public void setMinVolume(int currentVolume) {
        if (currentVolume < 1) {
            this.currentVolume = 0;
        }
        if (currentVolume >= 1) {
            this.currentVolume = currentVolume;
        }
    }

    public int getMinVolume() {
        return currentVolume;
    }
}
