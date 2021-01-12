package com;


import javax.swing.*;

public interface IControllerAdmin {
    void adminLogin(JTextField userNameField, JPasswordField passwordField);

    void adminAccessStock();

    void orderStock();

    void createAccount(JTextField usernameField, JPasswordField passwordField);

}
