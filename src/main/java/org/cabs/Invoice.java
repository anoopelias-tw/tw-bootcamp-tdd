package org.cabs;

public class Invoice {
    public int numberOfRides;
    public int totalFare;
    public double averageCost;

    public Invoice(int numberOfRides, int totalFare, double averageCost) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageCost = averageCost;
    }
}
