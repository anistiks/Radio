package radioman;

public class Radio {

    protected int numberStation;
    protected int maxRadioStation;
    protected int currentVolume;
    protected int minRadioStation;

    //конструкторы

    public Radio() {
        maxRadioStation = 9;
        minRadioStation = 0;
    }

    public Radio(int stationCount) {
        if (numberStation < 1) {
            maxRadioStation = 0;
        } else {
            maxRadioStation = stationCount - 1;
        }


    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void nextStation() {
        if (numberStation != maxRadioStation) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }

    }

    public void prevStation() {
        if (numberStation != 0) {
            numberStation = numberStation - 1;
        } else {
            numberStation = 9;
        }

    }


    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
