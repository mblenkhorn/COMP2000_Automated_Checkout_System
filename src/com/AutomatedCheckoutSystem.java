package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatedCheckoutSystem extends JFrame
{
    private JPanel mainPanel;
    private JTabbedPane programView;
    private JButton loginButton;
    private JLabel usernamePrompt;
    private JTextField usernameInput;
    private JLabel passwordPrompt;
    private JLabel loginLabelNotifier;
    private JButton addStockButton;
    private JButton editStockButton;
    private JButton removeStockButton;
    private JTextArea databaseDisplay;
    private JTextField barCodeInput;
    private JTextField stockNameInput;
    private JTextField priceInput;
    private JTextField stockIndexInput;
    private JPasswordField passwordField1;
    private JTextField inputBarcode;
    private JTextField inputName;
    private JTextField inputPrice;
    private JTextField inputQuantity;
    private JButton orderStock;
    private JLabel replenisherLabel;
    private JButton registerButton;
    private JTextField barcodeInput;
    private JButton scanStockButton;
    private JButton payWithCashButton;
    private JButton payWithCardButton;
    private JTextField cashInput;
    private JTextField cardPinInput;
    private JLabel totalCost;
    private JLabel cardVerifier;
    private JLabel totalChange;
    private JTextArea scannedItemsDisplay;


    public AutomatedCheckoutSystem()
    {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                AdminUser user = new AdminUser();
                user.adminLogin(usernameInput, passwordField1);
                programView.remove(1);
                user.adminAccessStock(databaseDisplay);
                user.replenishStockWarning(loginLabelNotifier);

            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminUser user = new AdminUser();
                user.createAccount(usernameInput, passwordField1);
                loginButton.setEnabled(true);
            }
        });


        addStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Stock stock = new Stock();
                IModelSubject subject = new StockDatabase();
                subject.addStock(stock, barCodeInput, stockNameInput, priceInput, databaseDisplay);
            }
        });

        editStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StockDatabase database = new StockDatabase();
                database.editStock(stockIndexInput, barCodeInput, stockNameInput, priceInput);
            }
        });

        orderStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Stock stock = new Stock();
                stock.setBarCode(Integer.parseInt(inputBarcode.getText()));
                stock.setName(inputName.getText());
                stock.setPrice(Float.parseFloat(inputPrice.getText()));
                AdminUser user = new AdminUser();
                user.orderStock(stock, replenisherLabel, databaseDisplay);
            }
        });

        scanStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customers customer = new Customers();
                customer.scanStock(scannedItemsDisplay, loginLabelNotifier, totalCost);
            }
        });

        payWithCashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customers customer = new Customers();
                customer.PayWithCash(cashInput, totalCost, totalChange);
            }
        });

        payWithCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customers customer = new Customers();
                customer.PayWithCard(cardPinInput, totalCost, totalCost, cardVerifier);
            }
        });


        databaseDisplay.setEditable(false);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500, 300));
        this.pack();
    }

    public static void main(String[] args)
    {
        AutomatedCheckoutSystem system = new AutomatedCheckoutSystem();
        system.setVisible(true);
    }
}