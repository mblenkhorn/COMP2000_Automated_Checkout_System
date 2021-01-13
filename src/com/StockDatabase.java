package com;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StockDatabase implements IModelSubject {
    public ArrayList<Stock> stockItems = new ArrayList<Stock>();

    public ArrayList<AdminUser> adminUsers = new ArrayList<AdminUser>();

    String filePath = "Resources\\data.txt";

    public void removeStock() {
//begin of modifiable zone(JavaCode)......C/eead22e9-f6a3-4475-b4a8-a52eebdaafc7
        try{
            Stock stockToRemove = new Stock();
            stockItems.remove(stockToRemove);
        }
        catch(Exception error){
            error.printStackTrace();
        }


//end of modifiable zone(JavaCode)........E/eead22e9-f6a3-4475-b4a8-a52eebdaafc7
    }

    public void addStock(Stock newStock, JTextField barCodeInput, JTextField nameInput, JTextField priceInput, JTextArea dataDisplay) {
//begin of modifiable zone(JavaCode)......C/a8d17de0-d8e6-4bdc-85b5-fff935603d17
        newStock.setBarCode(Integer.parseInt(barCodeInput.getText()));
        newStock.setName(nameInput.getText());
        newStock.setPrice(Float.parseFloat(priceInput.getText()));
        stockItems.add(newStock);
        updateStockDatabase(dataDisplay);

//end of modifiable zone(JavaCode)........E/a8d17de0-d8e6-4bdc-85b5-fff935603d17
    }

    public void editStock(JTextField stockIndexInput, JTextField barCodeInput, JTextField nameInput, JTextField priceInput) {
//begin of modifiable zone(JavaCode)......C/7dd1a4c1-90e8-4193-b144-a8c82f8fbbc8
        try{
            Stock stock = new Stock();
            stock.setBarCode(Integer.parseInt(barCodeInput.getText()));
            stock.setName(nameInput.getText());
            stock.setPrice(Float.parseFloat(priceInput.getText()));
            stockItems.add(stock);
        }
        catch(Exception error){
            error.printStackTrace();
        }



//end of modifiable zone(JavaCode)........E/7dd1a4c1-90e8-4193-b144-a8c82f8fbbc8
    }

    public void updateStockDatabase(JTextArea textDisplay) {
//begin of modifiable zone(JavaCode)......C/0cdd81ce-d018-487c-a2a1-e42e31efd7da
        for(int i = 0; i < stockItems.size(); i++)
        {
            textDisplay.append(stockItems.get(i).getBarCode() + " " + stockItems.get(i).getName() + " "
                    + "£ " +  stockItems.get(i).getPrice() + "\n");
        }

//end of modifiable zone(JavaCode)........E/0cdd81ce-d018-487c-a2a1-e42e31efd7da
    }


}
