package com;


import javax.swing.*;
import java.util.ArrayList;

public interface IView {
    void display(JTextArea scannedStockOutput, ArrayList<Stock> scannedItems);
    void print(JLabel outputLbl, JLabel outputLabel);

}
