public class Radio {
    private int totalStation = 10;
    private int minStation = 0;
    private int maxStation = totalStation - 1;
    private int currentRadioStationNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int totalStation) {
        this.totalStation = totalStation;
    }

    void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= maxStation) {
            if (newRadioStationNumber >= minStation) {
                currentRadioStationNumber = newRadioStationNumber;
            }
        }
    }

    void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= maxVolume) {
            if (newCurrentVolume >= minVolume) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    void setRadioStationNext() {
        if (currentRadioStationNumber == maxStation) {
            currentRadioStationNumber = minStation;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    void setRadioStationPrev() {
        if (currentRadioStationNumber == minStation) {
            currentRadioStationNumber = maxStation;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    void setVolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    void setVolumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getTotalStation() {
        return totalStation;
    }
}

