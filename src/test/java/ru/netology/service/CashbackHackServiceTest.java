package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

//import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {

        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldRemainIf0() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int amount = 0;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldRemainIf1() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf500() {

        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int amount = 500;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf999() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int amount = 999;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf1001() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 1001;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf2000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int amount = 2000;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemainIf2001() {

        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int amount = 2001;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIf2999() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int amount = 2999;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}

