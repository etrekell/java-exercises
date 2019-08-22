package org.launchcode.java.demos.java4python.restaurant;

public class Restaurant {

    public static void main(String[] args) {
    Menu menu = new Menu();
    MenuItem pizza = new MenuItem("Pizza", 6.99, "Cheesy", MenuCategory.BREAKFAST,true);
    MenuItem chicken = new MenuItem("Chicken", 8.99, "Roasted", MenuCategory.LUNCH,false);
    MenuItem burger = new MenuItem("Burger", 5.99, "Juicy", MenuCategory.DINNER,true);


    menu.addItem(pizza);
    menu.addItem(chicken);
    menu.addItem(burger);


    menu.printMenu();


    }
}
