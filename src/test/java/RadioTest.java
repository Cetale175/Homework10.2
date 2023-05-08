import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation3() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation4() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation5() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.next();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void PrevStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
