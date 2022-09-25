import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        Assertions.assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextCurrentRadioStation();
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.prevCurrentRadioStation();
        Assertions.assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldNextCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        radioStation.nextCurrentRadioStation();
        Assertions.assertEquals(6, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(6);
        radioStation.prevCurrentRadioStation();
        Assertions.assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationTwo() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldPlusCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);
        volume.plusCurrentVolume();
        Assertions.assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldMinusCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.minusCurrentVolume();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.plusCurrentVolume();
        Assertions.assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.minusCurrentVolume();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        Assertions.assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeTwo() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldMaxRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setMaxRadioStation(9);
        Assertions.assertEquals(9, radioStation.getMaxRadioStation());
    }

    @Test
    public void shouldMinRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setMinRadioStation(0);
        Assertions.assertEquals(0, radioStation.getMinRadioStation());
    }

    @Test
    public void shouldMinVolume() {
        Radio radioStation = new Radio();
        radioStation.setMinVolume(0);
        Assertions.assertEquals(0, radioStation.getMinVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radioStation = new Radio();
        radioStation.setMaxVolume(10);
        Assertions.assertEquals(10, radioStation.getMaxVolume());
    }
}