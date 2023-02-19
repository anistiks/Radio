package radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void middleStation() {
        Radio radio = new Radio();

        radio.setNumberStation(4);

        int expected = 4;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitLowStation() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitHighStation() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitBehindStation() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitMinusStation() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextHighLimitStation() {  //граница
        Radio radio = new Radio();

        radio.setNumberStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBeforeLimitStation() {  // до границы
        Radio radio = new Radio();

        radio.setNumberStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextLowLimitStation() {  //нижняя граница
        Radio radio = new Radio();

        radio.setNumberStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMiddleStation() {  //середина граница
        Radio radio = new Radio();

        radio.setNumberStation(4);

        radio.nextStation();

        int expected = 5;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevLowLimitStation() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMiddleStation() {
        Radio radio = new Radio();

        radio.setNumberStation(6);

        radio.prevStation();

        int expected = 5;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevHighLimitStation() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.numberStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeHigh() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeLow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMiddle() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int expected = 6;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseHighVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseLowVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseHighVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMiddleVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMiddleStation() {
        Radio radio = new Radio();

        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getLowStation() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getLHighStation() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVolumeHigh() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVolumeLow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNextHighLimitStation() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeHigh() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeLow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
