package com;


import javax.swing.*;
import java.util.ArrayList;

public class Kiosk implements IView {
    public void display(JTextArea scannedStockOutput, ArrayList<Stock> scannedItems) {
//begin of modifiable zone(JavaCode)......C/799925c8-54c9-4074-a624-3029f91912c6
        for(int i = 0; i < scannedItems.size(); i++)
        {
            scannedStockOutput.append(scannedItems.get(i).getName() + " " +  scannedItems.get(i).getPrice() + "\n");
        }

//end of modifiable zone(JavaCode)........E/799925c8-54c9-4074-a624-3029f91912c6
    }

    //NOT USED
    public void print(JLabel outputLbl, JLabel outputLabel){System.out.print("Hello World");}

}
