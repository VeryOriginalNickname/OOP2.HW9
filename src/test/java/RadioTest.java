import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchToNextRadioNumber() {
        Radio radio = new Radio();

        radio.currentRadioStationNumber = 2;
        radio.setRadioStationNext();

        int expected = 3;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToNextRadioNumberIs9() {
        Radio radio = new Radio();

        radio.currentRadioStationNumber = 9;
        radio.setRadioStationNext();

        int expected = 0;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioNumber() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 3;
        radio.setRadioStationPrev();

        int expected = 2;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioNumberIf0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;
        radio.setRadioStationPrev();

        int expected = 9;
        int actual = radio.currentRadioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.setVolumeUp();

        int expected = 51;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpIf100() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.setVolumeUp();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.currentVolume = 50;
        radio.setVolumeDown();

        int expected = 49;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownIf0() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
