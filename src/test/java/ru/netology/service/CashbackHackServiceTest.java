package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;


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
}