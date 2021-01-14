package com;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CashPayment extends PaymentMethod {
    public float cashChange; //this is for the total change

    public void calculateCost(JLabel totalCost, ArrayList<Stock> scannedItems) {
//begin of modifiable zone(JavaCode)......C/b832e3b0-c1d2-431f-8611-661e891aa9f9
        float cost = 0; //creates a new float variable called cost and gives it the value 0
        float priceCost = 0; //creates a new float variable called priceCost and gives it the value 0
        Customers customer = new Customers(); //creates a new Customers object called customer


        for(int i = 0; i < scannedItems.size(); i++){
            priceCost = priceCost + scannedItems.get(i).getPrice(); //multiplies the priceCost by the scannedItem's price by its index
            cost = priceCost; //store priceCost in cost
        }

        String formattedText = String.format("%.02f", cost); //format the cost by 2 decimal places and store it in a String variable called formattedText
        totalCost.setText(formattedText);


//end of modifiable zone(JavaCode)........E/b832e3b0-c1d2-431f-8611-661e891aa9f9
    }

    public void returnAnyChange(float cashAmount, float totalPayment, JLabel totalCost, JLabel changeLabel) {
//begin of modifiable zone(JavaCode)......C/33a6ad51-8fec-47ee-9f01-6938b52e94cd
        cashChange = 0; //assign 0 to the cashChange
        cashChange = cashAmount - totalPayment; //subtract cashAmount by totalPayment and store the value in cashChange
        String formattedString = String.format("%.02f", cashChange); //format the cost by 2 decimal places and store it in a String variable called formattedText
        changeLabel.setText(formattedString);

//end of modifiable zone(JavaCode)........E/33a6ad51-8fec-47ee-9f01-6938b52e94cd
    }

    public void startPayment(JTextField inputMoney, JLabel totalCost, JLabel totalCostLabel, JLabel changeLabel)
    {
        float cashAmount = 0; //creates a new float variable called cashAmount and assign 0 to it
        float totalPayment = 0; //creates a new float variable called totalPayment and assign 0 to it
        String payment = "CASH"; //assign "CASH" to a String variable called payment

        String inputCashAmount = inputMoney.getText();
        String inputTotalPayment = totalCost.getText();

        cashAmount = Float.parseFloat(inputCashAmount); //convert string to float
        totalPayment = Float.parseFloat(inputTotalPayment); //convert string to float

        if(Float.parseFloat(inputCashAmount) > Float.parseFloat(inputTotalPayment)) //if it is greater than
        {
            returnAnyChange(cashAmount, totalPayment, totalCost, changeLabel); //run this method using cashAmount, totalPayment, totalCost, and changeLabel as arguments
        }

        Receipt receipt = new Receipt(payment, totalCost);
    };

    //NOT USED
    public void startTransaction(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel changeLabel){
        System.out.print("HELLO WORLD");
    }

}
