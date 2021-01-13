package com;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CashPayment extends PaymentMethod {
    public float cashChange;

    public void calculateCost(JLabel totalCost, ArrayList<Stock> scannedItems) {
//begin of modifiable zone(JavaCode)......C/b832e3b0-c1d2-431f-8611-661e891aa9f9
        float cost = 0;
        float priceCost = 0;
        Customers customer = new Customers();


        for(int i = 0; i < scannedItems.size(); i++){
            priceCost = 2.50f * 2;
            cost = priceCost;
        }

        String formattedText = String.format("%.02f", cost);
        totalCost.setText(formattedText);


//end of modifiable zone(JavaCode)........E/b832e3b0-c1d2-431f-8611-661e891aa9f9
    }

    public void returnAnyChange(float cashAmount, float totalPayment, JLabel totalCost, JLabel changeLabel) {
//begin of modifiable zone(JavaCode)......C/33a6ad51-8fec-47ee-9f01-6938b52e94cd
        cashChange = 0;
        cashChange = cashAmount - totalPayment;
        String formattedString = String.format("%.02f", cashChange);
        changeLabel.setText(formattedString);

//end of modifiable zone(JavaCode)........E/33a6ad51-8fec-47ee-9f01-6938b52e94cd
    }

    public void startPayment(JTextField inputMoney, JLabel totalCost, JLabel totalCostLabel, JLabel changeLabel)
    {
        float cashAmount = 0;
        float totalPayment = 0;
        String payment = "CASH";

        String inputCashAmount = inputMoney.getText();
        String inputTotalPayment = totalCost.getText();

        cashAmount = Float.parseFloat(inputCashAmount);
        totalPayment = Float.parseFloat(inputTotalPayment);

        if(Float.parseFloat(inputCashAmount) > Float.parseFloat(inputTotalPayment))
        {
            returnAnyChange(cashAmount, totalPayment, totalCost, changeLabel);
        }

        Receipt receipt = new Receipt(payment, totalCost);
    };

    //NOT USED
    public void startTransaction(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel changeLabel){
        System.out.print("HELLO WORLD");
    }

}
