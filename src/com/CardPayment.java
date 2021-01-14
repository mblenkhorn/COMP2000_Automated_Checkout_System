package com;


import javax.swing.*;

public class CardPayment extends PaymentMethod {
    public VerificationScreen verificationScreen = new VerificationScreen(); //this is the verificationScreen

    public Bank bank = new Bank(); //this is the Bank

    public boolean acceptOrDenyPayment(JTextField inputCard) {
//begin of modifiable zone(JavaCode)......C/c504698d-fe40-4a46-8834-9cc5ebb79b8d
        String card = "555"; //creates a new String variable called card and gives it the value 555

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
        boolean isAccepted = acceptOrDenyPayment(inputCard); //run this function and give it the value in a boolean variable called isAccepted
        String payment = "CARD"; //creates a String variable called payment and gives it the value of CARD

        if(isAccepted)
        {
            verificationScreen.messageFromBank = "Your card is valid. The Bank has processed the transaction";
            bank.setMessage(verificationScreen.messageFromBank); //sets the message
            verificationScreen.print(verifier, outputLbl); //runs this message with verifier and outputLbl as arguments
        }
        else
        {
            verificationScreen.messageFromBank = "Your card is valid. The Bank has processed the transaction";
            bank.setMessage(verificationScreen.messageFromBank); //sets the message
            verificationScreen.print(verifier, outputLbl); //runs this message with verifier and outputLbl as arguments
        }

        Receipt receipt = new Receipt(payment, totalCostLabel); //creates a new Receipt object called receipt with arguments payment and totalCostLabel
    };

    //NOT USED
    public void startPayment(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel changeLabel)
    {
        System.out.print("HELLO WORLD");
    };

}
