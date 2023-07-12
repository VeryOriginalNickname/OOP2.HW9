public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void setRadioStationNext(){
        if (currentRadioStationNumber==9)
        {
            currentRadioStationNumber = 0;
        }
        else {currentRadioStationNumber = currentRadioStationNumber+1;}
    }

    public void setRadioStationPrev(){
        if (currentRadioStationNumber==0)
        {
            currentRadioStationNumber = 9;
        }
        else {currentRadioStationNumber = currentRadioStationNumber-1;}
    }

    public void setVolumeDown(){
        if (currentVolume == 0){currentVolume = currentVolume;}
        else{currentVolume = currentVolume - 1;}
    }

    public void setVolumeUp(){
        if (currentVolume == 100){currentVolume = currentVolume;}
        else{currentVolume = currentVolume + 1;}
    }

}
