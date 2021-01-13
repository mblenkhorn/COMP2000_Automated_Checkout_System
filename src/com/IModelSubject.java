package com;


import javax.swing.*;

public interface IModelSubject {
    void removeStock();

    void addStock(Stock newStock, JTextField barCodeInput, JTextField nameInput, JTextField priceInput, JTextArea dataDisplay);

    void editStock(JTextField stockIndexInput, JTextField barCodeInput, JTextField nameInput, JTextField priceInput);

    void updateStockDatabase(JTextArea textDisplay);

}
