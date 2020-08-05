package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateBonus1(){
       CashbackHackService service = new CashbackHackService();
       int amount = 10500;
       int actual = service.remain(amount);
       int expected = 500;
       assertEquals(expected,actual);
    }

    @Test
    public void calculateBonus2(){
        CashbackHackService service = new CashbackHackService();
        int amount = 956;
        int actual = service.remain(amount);
        int expected = 44;
        assertEquals(expected,actual);
    }

    @Test
    public void calculateBonus3(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }

}