package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class BankTest
{

    @Test
    public void setMessage()
    {
        Scanner scanner = new Scanner(System.in);
        String cardPin = scanner.next();
        String acceptedPin = "555";

        if(cardPin.equals(acceptedPin)){
            System.out.print("Your bank can now process the transaction");
        }else{
            System.out.print("Your bank cannot process the transaction due to invalid PIN number");
        }

        Assert.assertEquals(acceptedPin, cardPin);
    }

}