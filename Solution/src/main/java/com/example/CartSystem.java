package com.example;

import java.text.DecimalFormat;
import java.util.HashMap;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
        HashMap<String, Item> hm = getItemCollection();
        Double sumSubTotal = 0.0;
        DecimalFormat deciForm = new DecimalFormat("#0.00");
        System.out.println("Cart:");
        System.out.println(String.format("%-20s", "Name") + " " + String.format("%-20s", "Description") + " "
                + String.format("%-10s", "Price") + " " + String.format("%-10s", "Quantity") + " "
                + String.format("%-10s", "Sub Total"));
        for (String name : hm.keySet()) {
            Item myItem = hm.get(name);
            String myItemName = myItem.getItemName();
            myItemName = String.format("%-20s", myItemName);
            String myItemDesc = myItem.getItemDesc();
            myItemDesc = String.format("%-20s", myItemDesc);
            String myItemPrice = deciForm.format(myItem.getItemPrice());
            myItemPrice = String.format("%-10s", myItemPrice);
            String myItemQuantity = myItem.getQuantity().toString();
            myItemQuantity = String.format("%-10s", myItemQuantity);
            Double myItemOverallPrice = myItem.getQuantity() * myItem.getItemPrice();
            String myItemFormatedOverallPrice = String.format("%-10s", deciForm.format(myItemOverallPrice));
            System.out.println(myItemName + " " + myItemDesc + " " + myItemPrice + " " + myItemQuantity + " "
                    + myItemFormatedOverallPrice);
            sumSubTotal = sumSubTotal + myItemOverallPrice;
        }

        Double tax = sumSubTotal * 0.05;
        Double total = tax + sumSubTotal;

        System.out.print(String.format("%-20s", "Pre-tax Total"));
        System.out.println(" " + String.format("%-20s", deciForm.format(sumSubTotal)));
        System.out.print(String.format("%-20s", "Tax"));
        System.out.println(String.format(" " + "%-20s", deciForm.format(tax)));
        System.out.print(String.format("%-20s", "Total"));
        System.out.println(String.format(" " + "%-20s", deciForm.format(total)));
    }
}