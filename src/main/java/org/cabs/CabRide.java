package org.cabs;

public class CabRide {

    public static final int DISTANCE_COST = 10;
    public static final int WAIT_TIME_COST = 2;
    private final int distance;
    private final int waitTime;

    public CabRide(int distance, int waitTime) {
        this.distance = distance;
        this.waitTime = waitTime;
    }

    public int cost() {
        return (distance * DISTANCE_COST) + (waitTime * WAIT_TIME_COST);
    }
}
