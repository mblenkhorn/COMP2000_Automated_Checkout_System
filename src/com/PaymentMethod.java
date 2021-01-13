package com;


import javax.swing.*;

public abstract class PaymentMethod {
    public abstract void startPayment(JTextField inputMoney, JLabel totalCost);
    public abstract void startTransaction(JTextField inputCard, JLabel outputLbl);

}
