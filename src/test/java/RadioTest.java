import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchToNextRadioNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(2);
        radio.setRadioStationNext();

        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToNextRadioNumberIs9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.setRadioStationNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(3);
        radio.setRadioStationPrev();

        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioNumberIf0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.setRadioStationPrev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchRadioNumber10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        radio.setCurrentRadioStationNumber(10);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSwitchRadioNumberMinus1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(5);
        radio.setCurrentRadioStationNumber(-1);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.setVolumeUp();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpIf100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setVolumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.setVolumeDown();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownIf0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.setCurrentVolume(101);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(-1);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
