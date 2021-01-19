package com.example;

import java.text.DecimalFormat;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {
        HashMap<String, Item> myHashMap = getItemCollection();
        DecimalFormat deciForm = new DecimalFormat("#0.00");
        System.out.println("AppSystem Inventory:");
        System.out.println(String.format("%-20s", "Name") + " " + String.format("%-20s", "Description") + " "
                + String.format("%-10s", "Price") + " " + String.format("%-10s", "Available Quantity"));
        for (String name : myHashMap.keySet()) {
            Item myItem = myHashMap.get(name);
            String myItemName = myItem.getItemName();
            myItemName = String.format("%-20s", myItemName);
            String myItemDesc = myItem.getItemDesc();
            myItemDesc = String.format("%-20s", myItemDesc);
            String myItemPrice = deciForm.format(myItem.getItemPrice());
            myItemPrice = String.format("%-10s", myItemPrice);
            String myItemAvailableQuantity = myItem.getAvailableQuantity().toString();
            myItemAvailableQuantity = String.format("%-10s", myItemAvailableQuantity);
            System.out.println(myItemName + " " + myItemDesc + " " + myItemPrice + " " + myItemAvailableQuantity);
        }
    }

    @Override
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        }
        if (getItemCollection().containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the App System");
            return false;
        } else {
            getItemCollection().put(item.getItemName(), item);
            return true;
        }
    }

    public Item reduceAvailableQuantity(String item_name) {
        if (!getItemCollection().containsKey(item_name)) {
            return null;
        } else {
            Item myItem = getItemCollection().get(item_name);
            myItem.setAvailableQuantity(myItem.getAvailableQuantity() - 1);
            if (myItem.getAvailableQuantity() == 0) {
                getItemCollection().remove(item_name);
                return null;
            }
            return myItem;
        }
    }
}