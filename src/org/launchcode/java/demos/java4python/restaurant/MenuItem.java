package org.launchcode.java.demos.java4python.restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private int category;
    private boolean isNewItem;

    public MenuItem(String name, double price, String description, int category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = newItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(boolean newItem) {
        this.isNewItem = newItem;
    }
}
