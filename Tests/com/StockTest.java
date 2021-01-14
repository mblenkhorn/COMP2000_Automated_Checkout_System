package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest
{
    @Test
    public void TestBarCode()
    {
        Stock stock = new Stock();
        stock.setBarCode(1001);
        System.out.print(stock.getBarCode());
        assertEquals(stock.getBarCode(), 1001);
    }

    @Test
    public void TestName()
    {
        Stock stock = new Stock();
        stock.setName("Apples");
        System.out.print(stock.getName());
        assertEquals(stock.getName(), "Apples");
    }

    @Test
    public void TestPrice()
    {
        Stock stock = new Stock();
        stock.setPrice(1.24f);
        System.out.print(stock.getPrice());
        assertEquals(stock.getPrice(), stock.getPrice(), 1.24f);
    }

}