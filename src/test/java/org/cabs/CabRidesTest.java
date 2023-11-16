package org.cabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRidesTest {

    @Test
    void averageCabRideFareShouldBe45() {
        CabRide cabRide1 = new CabRide(5, 0);
        CabRide cabRide2 = new CabRide(3, 0);

        CabRides cabRides = new CabRides()
                .add(cabRide1)
                .add(cabRide2);

        double averageCost = cabRides.averageCost();

        assertEquals(45.0, averageCost);
    }

    @Test
    void averageCabRideFareShouldBe80() {
        CabRide cabRide1 = new CabRide(5, 5); //60
        CabRide cabRide2 = new CabRide(8, 10); // 100

        CabRides cabRides = new CabRides()
                .add(cabRide1)
                .add(cabRide2);

        assertEquals(80, cabRides.averageCost());
    }

    @Test
    void averageCabRideShouldBe0ForNoRides() {
        CabRides cabRides = new CabRides();
        assertEquals(0, cabRides.averageCost());
    }
}
