package com;


import javax.swing.*;

public interface IModelSubject {
    void removeStock();

    void addStock(Stock newStock, JTextField barCodeInput, JTextField nameInput, JTextField priceInput);

    void editStock();

    void updateStockDatabase();

}
