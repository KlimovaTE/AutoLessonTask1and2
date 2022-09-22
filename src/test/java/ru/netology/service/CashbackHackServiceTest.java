package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest{
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void testRemainFor900() {
        int expected = 100;
        int actual = cashbackHackService.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainFor1000() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainFor1100() {
        int expected = 900;
        int actual = cashbackHackService.remain(1100);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainFor900WithAPIJUnitJupiter() {
        int expected = 100;
        int actual = cashbackHackService.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainFor1000WithAPIJUnitJupiter() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainFor1100WithAPIJUnitJupiter() {
        int expected = 900;
        int actual = cashbackHackService.remain(1100);

        assertEquals(expected, actual);
    }
}