package org.launchcode.java.demos.java4python.restaurant;

public class Menu {
    private Double lastUpdated;

    public Menu(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Double getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
