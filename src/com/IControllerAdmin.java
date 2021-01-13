package com;


import javax.swing.*;

public interface IControllerAdmin {
    void adminLogin(JTextField userNameField, JPasswordField passwordField);

    void adminAccessStock(JTextArea textDisplay);

    void orderStock(Stock stockOrder, JLabel outputLbl, JTextArea textDisplay);

    void createAccount(JTextField usernameField, JPasswordField passwordField);

}
