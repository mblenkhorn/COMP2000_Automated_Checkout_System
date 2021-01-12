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
    private JButton updateStockButton;
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

    private int amount = 0;

    public AutomatedCheckoutSystem()
    {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //loginButton.setVisible(false);
                //usernamePrompt.setVisible(false);
                //usernameInput.setVisible(false);
                //passwordPrompt.setVisible(false);
                //passwordInput.setVisible(false);
                programView.remove(1);

                amount = 5;

                if(amount < 3)
                {
                    loginLabelNotifier.setText("You need to order some stock to replenish the database");
                }else{
                    loginLabelNotifier.setText("Welcome Admin");
                }



            }
        });
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