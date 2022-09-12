import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSpecifyStationQuantityPositive() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 1);
        Assertions.assertEquals(1, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 121);
        Assertions.assertEquals(120, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative2() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 0);
        Assertions.assertEquals(120, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityPositive() {
        radio.setStation(5);
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative() {
        radio.setStation(11);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative2() {
        radio.setStation(-1);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityPositive() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 60);
        radio.setStation(30);
        Assertions.assertEquals(30, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 60);
        radio.setStation(61);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative2() {
        Radio radio = new Radio((short) 120);
        radio.setStationsQuantity((short) 60);
        radio.setStation(-1);
        Assertions.assertEquals(0, radio.getStation());
    }


    @Test
    void shouldSwitchStationUpToRoundDefault() {
        Radio radio = new Radio("ThroughMax", 9);
        radio.switchStationUp(); // 9~10
        radio.switchStationUp(); // 10~0
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchStationDownToRoundDefault() {
        Radio radio = new Radio("ThroughMin", 1);
        radio.switchStationDown(); // 1~0
        radio.switchStationDown(); // 0~10
        Assertions.assertEquals(10, radio.getStation());
    }


    @Test
    void shouldIncreaseVolumeToThreshold() {
        Radio radio = new Radio(99);
        radio.increaseVolume(); // 99~100
        radio.increaseVolume(); // 100~100
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeToThreshold() {
        Radio radio = new Radio(1);
        radio.decreaseVolume(); // 1~0
        radio.decreaseVolume(); // 0~0
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetVolumeNegative() {
        Radio radio = new Radio(101);
        Assertions.assertEquals(15, radio.getVolume());
    }

    @Test
    void shouldSetVolumeNegative2() {
        Radio radio = new Radio(-1);
        Assertions.assertEquals(15, radio.getVolume());
    }
}
