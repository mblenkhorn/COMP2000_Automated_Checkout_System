package com;


import java.io.FileWriter;
import java.io.IOException;

public class AdminUser implements IControllerAdmin, IObserverAdmin {
    public StockOrders stockOrders;

    public String userName = "Adam";

    public String password = "33333";

    public void adminLogin() {
//begin of modifiable zone(JavaCode)......C/04c97770-dd62-4da7-8b88-16fea723b0d7

//end of modifiable zone(JavaCode)........E/04c97770-dd62-4da7-8b88-16fea723b0d7
    }

    public void adminAccessStock() {
//begin of modifiable zone(JavaCode)......C/cdfb3af3-d9b5-401d-803b-c1f6a61663db

//end of modifiable zone(JavaCode)........E/cdfb3af3-d9b5-401d-803b-c1f6a61663db
    }

    public void replenishStockWarning() {
//begin of modifiable zone(JavaCode)......C/d009cb0c-2980-482c-9d04-4959a9dd8944

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

    public void createAccount() {
//begin of modifiable zone(JavaCode)......C/1498d2f0-bee4-4c02-894b-0948ae2b6ffa
        try{
            String filePath = "Resources\\accounts.txt";
            FileWriter writer = new FileWriter(filePath);

            StockDatabase databaseUser = new StockDatabase();

            AdminUser user = new AdminUser();

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

}
