package com;


import javax.swing.*;
import java.util.ArrayList;

public interface IModelSubject {
    void removeStock();

    void addStock(Stock newStock, JTextField barCodeInput, JTextField nameInput, JTextField priceInput, JTextArea dataDisplay);

    void editStock(JTextField stockIndexInput, JTextField barCodeInput, JTextField nameInput, JTextField priceInput);

    void updateStockDatabase(JTextArea textDisplay, ArrayList<Stock> stockItems);

}
