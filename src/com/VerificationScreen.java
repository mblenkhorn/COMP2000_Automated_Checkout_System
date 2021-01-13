package com;


import javax.swing.*;
import java.util.ArrayList;

public class VerificationScreen implements IView {
    public String messageFromBank;


    public void print(JLabel outputLbl, JLabel outputLabel) {
//begin of modifiable zone(JavaCode)......C/f2b69b79-b38b-421f-bfc5-c7ffcc7b4353
        outputLbl.setText(messageFromBank);

//end of modifiable zone(JavaCode)........E/f2b69b79-b38b-421f-bfc5-c7ffcc7b4353
    }


    //NOT USED
    public void display(JTextArea scannedStockOutput, ArrayList<Stock> scannedItems){System.out.print("Hello World");}

}
