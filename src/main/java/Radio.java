public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 10) {
            if (newRadioStationNumber > -1) {
                currentRadioStationNumber = newRadioStationNumber;
            }
        }
    }

    void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 101) {
            if (newCurrentVolume > -1) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    void setRadioStationNext() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    void setRadioStationPrev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    void setVolumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    void setVolumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
}

