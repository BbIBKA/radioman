public class Radio {
    private int currentStation;
    public int maxStation = 9;
    public int minStation = 0;

    private int volumeRadio;

    public int volumeMax = 10;

    public int volumeMin = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {

        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }


    public int getCurrentVolume() {
        return volumeRadio;
    }

    public void setCurrentVolume(int newVolumeRadio) {
        if (newVolumeRadio < volumeMin) {
            return;
        }
        if (newVolumeRadio > volumeMax) {
            return;
        }
        volumeRadio = newVolumeRadio;
    }

    public void increaseVolume() {
        if (volumeRadio == volumeMax) {
            setCurrentVolume(volumeMax);
        } else {
            volumeRadio = volumeRadio + 1;
        }
    }

    public void reduceVolume() {
        if (volumeRadio > volumeMin) {
            setCurrentVolume(volumeRadio - 1);
        } else {
            setCurrentVolume(volumeMin);
        }
    }
}
