package org.launchcode.java.demos.java4python.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private Double lastUpdated;
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public void printMenu() {


        System.out.println("Item\t\tPrice\t\tDescription" +
                "\n------------------------------------");

        for (MenuItem item : this.items) {
            String newItemTag = "";

            if (item.getIsNewItem()) {
                newItemTag = "New item!";
            }

            System.out.println(item.getName() + "\t\t" + item.getPrice()
                    + "\t\t" + item.getDescription() + "\t\t" + newItemTag);
        }
    }

    public Double getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
