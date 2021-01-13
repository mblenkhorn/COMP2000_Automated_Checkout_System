package com;


import javax.swing.*;

public class CashPayment extends PaymentMethod {
    public float cashChange;

    public void calculateCost(JLabel totalCost) {
//begin of modifiable zone(JavaCode)......C/b832e3b0-c1d2-431f-8611-661e891aa9f9
        float cost = 0;
        Customers customer = new Customers();


        for(int i = 0; i < 10; i++){
            cost = cost + 10;
        }

        String formattedText = String.format("%.02f", cost);
        totalCost.setText("TOTAL COST: " + formattedText);


//end of modifiable zone(JavaCode)........E/b832e3b0-c1d2-431f-8611-661e891aa9f9
    }

    public void returnAnyChange(float cashAmount, float totalPayment, JLabel totalCost) {
//begin of modifiable zone(JavaCode)......C/33a6ad51-8fec-47ee-9f01-6938b52e94cd
        cashChange = 0;
        cashChange = cashAmount - totalPayment;


        String formattedString = String.format("%.02f", cashChange);

        totalCost.setText("Here's your change: " + formattedString);

//end of modifiable zone(JavaCode)........E/33a6ad51-8fec-47ee-9f01-6938b52e94cd
    }

    public void startPayment(JTextField inputMoney, JLabel totalCost)
    {
        float cashAmount = 0;
        float totalPayment = 0;

        String inputCashAmount = inputMoney.getText();
        String inputTotalPayment = totalCost.getText();

        cashAmount = Float.parseFloat(inputCashAmount);
        totalPayment = Float.parseFloat(inputTotalPayment);

        if(Float.parseFloat(inputCashAmount) > Float.parseFloat(inputTotalPayment))
        {
            returnAnyChange(cashAmount, totalPayment, totalCost);
        }
    };

    //NOT USED
    public void startTransaction(JTextField inputCard, JLabel outputLbl){
        System.out.print("HELLO WORLD");
    }

}
