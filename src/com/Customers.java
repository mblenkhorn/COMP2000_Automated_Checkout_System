package com;


import javax.swing.*;
import java.util.ArrayList;

public class Customers implements IControllerStrategy, IObserver {
    public Stock stock; //this is the stock

    public ArrayList<Stock> scannedItems = new ArrayList<Stock>(); //this is for the scannedItems

    public void PayWithCash(JTextField inputMoney, JLabel totalCost, JLabel changeLabel) {
//begin of modifiable zone(JavaCode)......C/7a874ad9-e1c3-4f84-b03b-c3d7e0eb74bf
        CashPayment payment = new CashPayment(); //creates a new CashPayment object called payment
        payment.startPayment(inputMoney, totalCost, totalCost, changeLabel); //runs this method

//end of modifiable zone(JavaCode)........E/7a874ad9-e1c3-4f84-b03b-c3d7e0eb74bf
    }

    public void PayWithCard(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel notifier){
        CardPayment payment = new CardPayment(); //creates a new CardPayment object called payment
        payment.startTransaction(inputCard, outputLbl, totalCostLabel, notifier); //runs this method
    }

    public void scanStock(JTextArea output, JLabel outputLabel, JLabel totalCost) {
//begin of modifiable zone(JavaCode)......C/2876f45b-c7e4-4691-ac77-b313b037575e
            stock = new Stock();
            stock.setName("Apples");
            stock.setPrice(1.24f);
            scannedItems.add(stock);


        updateDatabase(outputLabel); //runs this method with outputLbl as an argument
        CashPayment payment = new CashPayment(); //creates a new CardPayment object called payment
        payment.calculateCost(totalCost, scannedItems); //runs this method
        Kiosk kiosk = new Kiosk(); //creates a new Kiosk object called kiosk
        kiosk.display(output, scannedItems); //runs this method with output and scannedItems as arguments

//end of modifiable zone(JavaCode)........E/2876f45b-c7e4-4691-ac77-b313b037575e
    }

    public void updateDatabase(JLabel notifier) {
//begin of modifiable zone(JavaCode)......C/5bf0c6f0-d635-4c8f-b012-3b8498fe4812
        notifier.setText("Your database has been updated!");
//end of modifiable zone(JavaCode)........E/5bf0c6f0-d635-4c8f-b012-3b8498fe4812
    }

}
