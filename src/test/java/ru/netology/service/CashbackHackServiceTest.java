package ru.netology.service;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

        CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void testRemainFor900() {

        int expected = 100;
        int actual = cashbackHackService.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainFor1000() {

        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainFor1100() {

        int expected = 900;
        int actual = cashbackHackService.remain(1100);

        assertEquals(actual, expected);
    }
}