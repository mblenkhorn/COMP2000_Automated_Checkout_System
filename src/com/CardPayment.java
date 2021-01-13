package com;


import javax.swing.*;

public class CardPayment extends PaymentMethod {
    public VerificationScreen verificationScreen;

    public Bank bank;

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


    public void startTransaction(JTextField inputCard, JLabel outputLbl)
    {
        boolean isAccepted = acceptOrDenyPayment(inputCard);

        if(isAccepted)
        {
            verificationScreen.messageFromBank = "Your card is valid. The Bank has processed the transaction";
            bank.setMessage(verificationScreen.messageFromBank);
            verificationScreen.print(outputLbl, outputLbl);
        }
        else
        {
            System.out.println("Your card is invalid. The transaction cannot be processed");
        }
    };

    //NOT USED
    public void startPayment(JTextField inputMoney, JLabel totalCost)
    {
        System.out.print("HELLO WORLD");
    };

}
