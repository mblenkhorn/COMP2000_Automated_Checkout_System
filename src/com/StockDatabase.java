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

//end of modifiable zone(JavaCode)........E/eead22e9-f6a3-4475-b4a8-a52eebdaafc7
    }

    public void addStock(Stock newStock, JTextField barCodeInput, JTextField nameInput, JTextField priceInput) {
//begin of modifiable zone(JavaCode)......C/a8d17de0-d8e6-4bdc-85b5-fff935603d17
        newStock.setBarCode(Integer.parseInt(barCodeInput.getText()));
        newStock.setName(nameInput.getText());
        newStock.setPrice(Float.parseFloat(priceInput.getText()));
        stockItems.add(newStock);

//end of modifiable zone(JavaCode)........E/a8d17de0-d8e6-4bdc-85b5-fff935603d17
    }

    public void editStock() {
//begin of modifiable zone(JavaCode)......C/7dd1a4c1-90e8-4193-b144-a8c82f8fbbc8

//end of modifiable zone(JavaCode)........E/7dd1a4c1-90e8-4193-b144-a8c82f8fbbc8
    }

    public void updateStockDatabase() {
//begin of modifiable zone(JavaCode)......C/0cdd81ce-d018-487c-a2a1-e42e31efd7da

//end of modifiable zone(JavaCode)........E/0cdd81ce-d018-487c-a2a1-e42e31efd7da
    }

    public void saveStock(){
        try
        {
            FileWriter writer = new FileWriter(filePath);

            for(int index = 0; index < stockItems.size(); index++)
            {
                String dataRow = "";

                if(index > 0 )
                {
                    dataRow += "\n";
                }

                String barCodeToString = Integer.toString(stockItems.get(index).getBarCode());
                dataRow += barCodeToString;

                dataRow += "|" + stockItems.get(index).getName();

                String priceToString = Float.toString(stockItems.get(index).getPrice());
                dataRow += "|" + priceToString;

                writer.write(dataRow);
            }

            writer.close();
            System.out.println("User File Successfully Saved");
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

}
