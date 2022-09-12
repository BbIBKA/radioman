public class Radio {
    private String radioName = "Конструктор";
    private int station;
    private short stationsQuantity = 10;
    private int volume = 15;


    public Radio() {
    }

    public Radio(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public Radio(short stationsQuantity) {
        setStationsQuantity(stationsQuantity);
    }

    public Radio(String radioName, int station) {
        this.radioName = radioName;
        setStation(station);
    }

    public void setStationsQuantity(short stationsQuantity) {
        if (stationsQuantity > 120) {
            return;
        }
        if (stationsQuantity < 1) {
            return;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public void setStation(int station) {
        if (station > stationsQuantity) {
            return;
        }
        if (station < 0) {
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void switchStationUp() {
        if (station == stationsQuantity) {
            setStation(0);
            return;
        }
        setStation(++station);
    }

    public void switchStationDown() {
        if (station == 0) {
            setStation(stationsQuantity);
            return;
        }
        setStation(--station);
    }


    public void increaseVolume() {
        if (volume == 100) {
            return;
        }
        setVolume(++volume);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(--volume);
    }


    public int getVolume() {
        return volume;
    }

    public int getStation() {
        return station;
    }

    public short getStationsQuantity() {
        return stationsQuantity;
    }
}