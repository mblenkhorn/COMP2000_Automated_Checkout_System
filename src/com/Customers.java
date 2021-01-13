package com;


import javax.swing.*;
import java.util.ArrayList;

public class Customers implements IControllerStrategy, IObserver {
    public Stock stock;

    public ArrayList<Stock> scannedItems = new ArrayList<Stock>();

    public void PayWithCash(JTextField inputMoney, JLabel totalCost) {
//begin of modifiable zone(JavaCode)......C/7a874ad9-e1c3-4f84-b03b-c3d7e0eb74bf
        CashPayment payment = new CashPayment();
        payment.startPayment(inputMoney, totalCost);

//end of modifiable zone(JavaCode)........E/7a874ad9-e1c3-4f84-b03b-c3d7e0eb74bf
    }

    public void PayWithCard(JTextField inputCard, JLabel outputLbl){
        CardPayment payment = new CardPayment();
        payment.startTransaction(inputCard, outputLbl);
    }

    public void scanStock(JTextArea output, JLabel outputLabel, JLabel totalCost) {
//begin of modifiable zone(JavaCode)......C/2876f45b-c7e4-4691-ac77-b313b037575e
        for(int i = 0; i < scannedItems.size(); i++){
            stock = new Stock();
            stock.setName("Apples");
            stock.setPrice(1.24f);
            scannedItems.add(stock);
        }

        updateDatabase(outputLabel);
        CashPayment payment = new CashPayment();
        payment.calculateCost(totalCost);
        Kiosk kiosk = new Kiosk();
        kiosk.display(output, scannedItems);

//end of modifiable zone(JavaCode)........E/2876f45b-c7e4-4691-ac77-b313b037575e
    }

    public void updateDatabase(JLabel notifier) {
//begin of modifiable zone(JavaCode)......C/5bf0c6f0-d635-4c8f-b012-3b8498fe4812
        notifier.setText("Your database has been updated!");
//end of modifiable zone(JavaCode)........E/5bf0c6f0-d635-4c8f-b012-3b8498fe4812
    }

}
