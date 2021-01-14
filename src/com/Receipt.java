package com;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Receipt extends JFrame implements IView {
    public Stock[] stockItems;

    public String paymentMethod; //this is the paymentMethod


    public void printOutReceipt(String payment, JLabel totalCostLabel)
    {
        try{
            Thread.sleep(12000); //sleep for 12000 milliseconds
        }catch(InterruptedException exception){
            exception.printStackTrace();
        }

        //THREADING
        new Runnable(){
            @Override
            public void run(){
                System.out.println("My Thread: " + Thread.currentThread().getName());
                try{
                    Receipt receipt = new Receipt(payment, totalCostLabel); //run this method within Thread
                }catch(Exception error){
                    error.printStackTrace();
                }
            }
        }.run();

    }

    public Receipt(String payment, JLabel totalCostLabel) {
//begin of modifiable zone(JavaSuper).....C/d28f0793-daa3-48a3-be60-a7126e021ce6
        paymentMethod = payment; //assign payment to paymentMethod
        Customers customers = new Customers();
        String name = "Obscurus Supermarkets Ltd - We sell invisible items for a very reasonable price!";
        JPanel receiptPanel = new JPanel();
        JLabel nameLabel = new JLabel();
        nameLabel.setText(name);
        JLabel dateLabel = new JLabel();
        dateLabel.setText(new SimpleDateFormat("dd-MMM-YYYY").format(new Date())); //gets the date from the operating system
        JTextArea itemDisplay = new JTextArea();
        itemDisplay.setForeground(Color.GRAY);
        itemDisplay.setEditable(false);

        for(int i = 0; i < 3; i++){
            itemDisplay.append("Apples " + " " + "1.24" + "\n");
        }

        JLabel paymentMethodLabel = new JLabel();
        paymentMethodLabel.setText(paymentMethod);
        JLabel totalCost = new JLabel();
        totalCost.setText("£ " + totalCostLabel.getText());

        //adds the components the receiptPanel
        receiptPanel.add(nameLabel);
        receiptPanel.add(dateLabel);
        receiptPanel.add(itemDisplay);
        receiptPanel.add(paymentMethodLabel);
        receiptPanel.add(totalCost);

        //creates the receiptPanel pane
        this.setContentPane(receiptPanel);
        this.setLayout(new GridLayout(10, 15));
        this.setPreferredSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.pack();
        this.setVisible(true);



//end of modifiable zone(JavaSuper).......E/d28f0793-daa3-48a3-be60-a7126e021ce6
//begin of modifiable zone(JavaCode)......C/d28f0793-daa3-48a3-be60-a7126e021ce6

//end of modifiable zone(JavaCode)........E/d28f0793-daa3-48a3-be60-a7126e021ce6
    }

    //NOT USED IN PROJECT
    public void print(JLabel outputLbl, JLabel outputLabel){System.out.print("HELLO WORLD");}
    public void display(JTextArea scannedStockOutput, ArrayList<Stock> scannedItems){System.out.print("HELLO WORLD");}

}
