package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashBackHackerTest {
    @Test

    public void border() {
        CashBackHacker bonus = new CashBackHacker();
        int amount = 1000;

        int actual = bonus.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test

    public void minimumPurchase() {
        CashBackHacker bonus = new CashBackHacker();
        int amount = 1;

        int actual = bonus.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void purchase() {
        CashBackHacker bonus = new CashBackHacker();
        int amount = 150;

        int actual = bonus.remain(amount);
        int expected = 850;

        assertEquals(actual, expected);
    }

    @Test
    public void zero() {
        CashBackHacker bonus = new CashBackHacker();
        int amount = 0;

        int actual = bonus.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void abroad() {
        CashBackHacker bonus = new CashBackHacker();
        int amount = 1002;

        int actual = bonus.remain(amount);
        int expected = 998;

        assertEquals(actual, expected);
    }
}