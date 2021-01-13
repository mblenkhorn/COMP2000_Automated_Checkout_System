package com;


import javax.swing.*;

public abstract class PaymentMethod {
    public abstract void startPayment(JTextField inputMoney, JLabel totalCost, JLabel totalCostLabel, JLabel changeLabel);
    public abstract void startTransaction(JTextField inputCard, JLabel outputLbl, JLabel totalCostLabel, JLabel verifier);

}
