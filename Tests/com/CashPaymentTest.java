package com;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CashPaymentTest
{
    @Test
    public void TestCalculation()
    {
        double cost = 0;
        Stock stock = new Stock();
        stock.setPrice(1.24f);

        cost = cost + stock.getPrice();

        System.out.print(cost);
        assertEquals(cost, cost, 1.2f);

    }

    @Test
    public void TestReturnChange()
    {
        double change = 0;
        double priceCost = 5.00f;
        double inputCost = 10.0f;

        change = inputCost - priceCost;

        System.out.print(change);
        assertEquals(change, change, 5.00f);

    }

}