package com;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class VerificationScreenTest
{
    @Test
    public void TestVerification()
    {
        String acceptedCard = "Your card has been accepted. The bank can process this transaction";
        String deniedCard = "Your card has been denied. The bank cannot process this transaction";

        String cardPin = "555";

        Scanner scanner = new Scanner(System.in);
        String pinNumber = scanner.next();

        if(pinNumber.equals(cardPin))
        {
            System.out.print(acceptedCard);
        }else{
            System.out.print(deniedCard);
        }

        assertEquals(cardPin, pinNumber);
    }

}