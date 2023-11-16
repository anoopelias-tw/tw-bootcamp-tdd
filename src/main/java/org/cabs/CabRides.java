package org.cabs;

import java.util.ArrayList;
import java.util.List;

public class CabRides {

    private final List<CabRide> cabRideList;

    private CabRides(List<CabRide> cabRides) {
        cabRideList = cabRides;
    }

    public CabRides() {
        cabRideList = new ArrayList<>();
    }

    public CabRides add(CabRide cabRide) {
        ArrayList<CabRide> newCabRides = new ArrayList<>(cabRideList);
        newCabRides.add(cabRide);
        return new CabRides(List.copyOf(newCabRides));
    }

    public double averageCost() {
        return cabRideList
                .stream()
                .mapToDouble(CabRide::cost)
                .average()
                .orElse(0);
    }

    private int totalCost() {
        return cabRideList
                .stream()
                .mapToInt(CabRide::cost)
                .sum();
    }

    public Invoice invoice() {
        return new Invoice(cabRideList.size(), totalCost(), averageCost());
    }
}
