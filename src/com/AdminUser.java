package com;


import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUser implements IControllerAdmin, IObserverAdmin {
    public StockOrders stockOrders; //this is the orders

    public ArrayList<Stock> stocks = new ArrayList<Stock>(); //this is the stock array that will store the stock

    public String userName; //this is the username of the user

    public String password; //this is the password of the user

    String filePath = "Resources\\data.txt"; //the filepath needed to read the data.txt file
    String separator = "\\|"; //separates the data (removes the bar from the data.txt file)

    public void adminLogin(JTextField usernameField, JPasswordField passwordField) {
//begin of modifiable zone(JavaCode)......C/04c97770-dd62-4da7-8b88-16fea723b0d7
        StockDatabase databaseUser = new StockDatabase(); //creates a new StockDatabase object called databaseUser
        AdminUser user = new AdminUser(); //creates a new AdminUser object called user

        for(int index = 0; index < databaseUser.adminUsers.size(); index++) //before it reaches the size of the adminUsers ArrayList
        {
            //if the username and password inputs matches the adminUser username and password
            if(usernameField.getText().equals(databaseUser.adminUsers.get(index).userName)
                    && passwordField.getText().equals(databaseUser.adminUsers.get(index).password))
            {
                System.out.print("Hello World"); //tests the correct login
            }
        }
//end of modifiable zone(JavaCode)........E/04c97770-dd62-4da7-8b88-16fea723b0d7
    }

    public void adminAccessStock(JTextArea textDisplay) {
//begin of modifiable zone(JavaCode)......C/cdfb3af3-d9b5-401d-803b-c1f6a61663db
        try{
            File file = new File(filePath); //creates a new file object called file and uses the filepath for reading
            Scanner scanner = new Scanner(file); //creates a new scanner object called scanner and uses the file for scanning

            while(scanner.hasNextLine()) //while scanner has lines to read
            {
                String tableRow = scanner.nextLine(); //the tableRow is the first line read by scanner
                String[] userData = tableRow.split(separator); //splits the tableRow into different parts

                Stock stock = new Stock(); //creates a new stock object called Stock

                //converts the data to a new data type if necessary, sets the data from userData index, and adds the stock to the arrayList

                int barCodeToInt = Integer.parseInt(userData[0]);
                stock.setBarCode(barCodeToInt);
                stock.setName(userData[1]);
                float priceToFloat = Float.parseFloat(userData[2]);
                stock.setPrice(priceToFloat);

                stocks.add(stock);
            }

            scanner.close();

            for(int i = 0; i < stocks.size(); i++) //before it reaches the size of the stock
            {
                textDisplay.append(stocks.get(i).getBarCode() + " " + stocks.get(i).getName() + " "
                        + "£ " +  stocks.get(i).getPrice() + "\n");
            }

            System.out.print("File Read Successful"); //test successful login


        }catch(FileNotFoundException exception){
            exception.printStackTrace();
        }


//end of modifiable zone(JavaCode)........E/cdfb3af3-d9b5-401d-803b-c1f6a61663db
    }

    public void replenishStockWarning(JLabel notifier) {
//begin of modifiable zone(JavaCode)......C/d009cb0c-2980-482c-9d04-4959a9dd8944
        int count = 0; //creates a int variable called count and gives it the value of 0

        StockDatabase database = new StockDatabase(); //creates a new StockDatabase object called database

        for(int index = 0; index < database.stockItems.size(); index++) //before it reaches the stockitems's size
        {
            count++; //increment by 1
        }

        if(count < 3)
        {
            notifier.setText("Your stock is almost depleted!. You need to order some stock!");
        }

//end of modifiable zone(JavaCode)........E/d009cb0c-2980-482c-9d04-4959a9dd8944
    }

    public void orderStock(Stock stockOrder, JLabel outputLbl, JTextArea textDisplay) {
//begin of modifiable zone(JavaCode)......C/23ef2dd5-ade8-4143-aaa8-862d22f01370
        outputLbl.setText("Your order has been processed!");
        stockOrders = new StockOrders(); //creates a new StockOrders object
        stockOrders.setQuantity(3); //runs this function using 3 as an argument
        StockDatabase database = new StockDatabase();

        for(int i = 0; i < stockOrders.quantity; i++)
        {
            //sets the data and adds it the arrayList
            stockOrder.setBarCode(1004);
            stockOrder.setName("Pineapples");
            stockOrder.setPrice(1.24f);
            stocks.add(stockOrder);
        }

        database.updateStockDatabase(textDisplay, stocks);

        int j = 0;
        int waitForSeconds = 100; //time for waiting

        while(j != waitForSeconds)
        {
            j++; //increment by 1
        }

        updateOnDelivery(outputLbl, textDisplay);

//end of modifiable zone(JavaCode)........E/23ef2dd5-ade8-4143-aaa8-862d22f01370
    }

    public void updateOnDelivery(JLabel outputLbl, JTextArea textDisplay) {
//begin of modifiable zone(JavaCode)......C/c314ea4f-fe00-4f3f-8f89-ba7205e74287
        outputLbl.setText("Your order has now been delivered" + " Click on the Database tab!");
        StockDatabase stockDatabase = new StockDatabase(); //creates a new StockDatabase object
        stockDatabase.updateStockDatabase(textDisplay, stocks);

//end of modifiable zone(JavaCode)........E/c314ea4f-fe00-4f3f-8f89-ba7205e74287
    }

    public void createAccount(JTextField usernameField, JPasswordField passwordField) {
//begin of modifiable zone(JavaCode)......C/1498d2f0-bee4-4c02-894b-0948ae2b6ffa
        try{
            String filePath = "Resources\\accounts.txt"; //creates a new String called filePath and gives the filepath to read
            FileWriter writer = new FileWriter(filePath); //creates a new FileWriter object called writer which will write to the file

            StockDatabase databaseUser = new StockDatabase(); //creates a new StockDatabase object called databaseUser

            AdminUser user = new AdminUser(); //creates a new AdminUser object called user
            user.userName = usernameField.getText();
            user.password = passwordField.getText();

            databaseUser.adminUsers.add(user);

            for(int index = 0; index < databaseUser.adminUsers.size(); index++)
            {
                String userAccountDataRow = ""; //creates a new String variable object called userAccountDataRow

                if(index > 0)
                {
                    userAccountDataRow += "\n";
                }

                userAccountDataRow += "|" + databaseUser.adminUsers.get(index).userName;
                userAccountDataRow += "|" + databaseUser.adminUsers.get(index).password;

                writer.write(userAccountDataRow); //writes the userData to the file
            }

            writer.close();
            System.out.println("File Write successful");

        }catch(IOException exception)
        {
            exception.printStackTrace();
        }


//end of modifiable zone(JavaCode)........E/1498d2f0-bee4-4c02-894b-0948ae2b6ffa
    }

}
