package com;


import javax.swing.*;

public class CardPayment extends PaymentMethod {
    public VerificationScreen verificationScreen = new VerificationScreen();

    public Bank bank = new Bank();

    public boolean acceptOrDenyPayment(JTextField inputCard) {
//begin of modifiable zone(JavaCode)......C/c504698d-fe40-4a46-8834-9cc5ebb79b8d
        String card = "555";

        if(card.equals(inputCard.getText()))
        {
            return true;
        }
        else
        {
            return false;
        }


//end of modifiable zone(JavaCode)........E/c504698d-fe40-4a46-8834-9cc5ebb79b8d
    }


    public void startTransaction(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel verifier)
    {
        boolean isAccepted = acceptOrDenyPayment(inputCard);
        String payment = "CARD";

        if(isAccepted)
        {
            verificationScreen.messageFromBank = "Your card is valid. The Bank has processed the transaction";
            bank.setMessage(verificationScreen.messageFromBank);
            verificationScreen.print(verifier, outputLbl);
        }
        else
        {
            verificationScreen.messageFromBank = "Your card is valid. The Bank has processed the transaction";
            bank.setMessage(verificationScreen.messageFromBank);
            verificationScreen.print(verifier, outputLbl);
        }

        Receipt receipt = new Receipt(payment, totalCostLabel);
    };

    //NOT USED
    public void startPayment(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel changeLabel)
    {
        System.out.print("HELLO WORLD");
    };

}
