package com;


import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUser implements IControllerAdmin, IObserverAdmin {
    public StockOrders stockOrders;

    public ArrayList<Stock> stocks = new ArrayList<Stock>();

    public String userName;

    public String password;

    String filePath = "Resources\\data.txt";
    String separator = "\\|";

    public void adminLogin(JTextField usernameField, JPasswordField passwordField) {
//begin of modifiable zone(JavaCode)......C/04c97770-dd62-4da7-8b88-16fea723b0d7
        StockDatabase databaseUser = new StockDatabase();
        AdminUser user = new AdminUser();

        for(int index = 0; index < databaseUser.adminUsers.size(); index++)
        {
            if(usernameField.getText().equals(databaseUser.adminUsers.get(index).userName)
                    && passwordField.getText().equals(databaseUser.adminUsers.get(index).password))
            {
                System.out.print("Hello World");
            }
        }





//end of modifiable zone(JavaCode)........E/04c97770-dd62-4da7-8b88-16fea723b0d7
    }

    public void adminAccessStock(JTextArea textDisplay) {
//begin of modifiable zone(JavaCode)......C/cdfb3af3-d9b5-401d-803b-c1f6a61663db
        try{
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String tableRow = scanner.nextLine();
                String[] userData = tableRow.split(separator);

                Stock stock = new Stock();

                int barCodeToInt = Integer.parseInt(userData[0]);
                stock.setBarCode(barCodeToInt);
                stock.setName(userData[1]);
                float priceToFloat = Float.parseFloat(userData[2]);
                stock.setPrice(priceToFloat);

                stocks.add(stock);
            }

            scanner.close();

            for(int i = 0; i < stocks.size(); i++)
            {
                textDisplay.append(stocks.get(i).getBarCode() + " " + stocks.get(i).getName() + " "
                        + "£ " +  stocks.get(i).getPrice() + "\n");
            }

            System.out.print("File Read Successful");


        }catch(FileNotFoundException exception){
            exception.printStackTrace();
        }


//end of modifiable zone(JavaCode)........E/cdfb3af3-d9b5-401d-803b-c1f6a61663db
    }

    public void replenishStockWarning(JLabel notifier) {
//begin of modifiable zone(JavaCode)......C/d009cb0c-2980-482c-9d04-4959a9dd8944
        int count = 0;

        StockDatabase database = new StockDatabase();

        for(int index = 0; index < database.stockItems.size(); index++)
        {
            count++;
        }

        if(count < 3)
        {
            notifier.setText("Your stock is almost depleted!. You need to order some stock!");
        }

//end of modifiable zone(JavaCode)........E/d009cb0c-2980-482c-9d04-4959a9dd8944
    }

    public void orderStock() {
//begin of modifiable zone(JavaCode)......C/23ef2dd5-ade8-4143-aaa8-862d22f01370

//end of modifiable zone(JavaCode)........E/23ef2dd5-ade8-4143-aaa8-862d22f01370
    }

    public void updateOnDelivery() {
//begin of modifiable zone(JavaCode)......C/c314ea4f-fe00-4f3f-8f89-ba7205e74287

//end of modifiable zone(JavaCode)........E/c314ea4f-fe00-4f3f-8f89-ba7205e74287
    }

    public void createAccount(JTextField usernameField, JPasswordField passwordField) {
//begin of modifiable zone(JavaCode)......C/1498d2f0-bee4-4c02-894b-0948ae2b6ffa
        try{
            String filePath = "Resources\\accounts.txt";
            FileWriter writer = new FileWriter(filePath);

            StockDatabase databaseUser = new StockDatabase();

            AdminUser user = new AdminUser();
            user.userName = usernameField.getText();
            user.password = passwordField.getText();

            databaseUser.adminUsers.add(user);

            for(int index = 0; index < databaseUser.adminUsers.size(); index++)
            {
                String userAccountDataRow = "";

                if(index > 0)
                {
                    userAccountDataRow += "\n";
                }

                userAccountDataRow += "|" + databaseUser.adminUsers.get(index).userName;
                userAccountDataRow += "|" + databaseUser.adminUsers.get(index).password;

                writer.write(userAccountDataRow);
            }

            writer.close();
            System.out.println("File Write successful");

        }catch(IOException exception)
        {
            exception.printStackTrace();
        }


//end of modifiable zone(JavaCode)........E/1498d2f0-bee4-4c02-894b-0948ae2b6ffa
    }

    public void saveStock(){}

}
