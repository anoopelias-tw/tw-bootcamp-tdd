package org.cabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRideTest {

    @Test
    void costFor2KmDistanceShouldBe20() {
        CabRide cabRide = new CabRide(5, 0); // given
        int cost = cabRide.cost();  // when
        assertEquals(50, cost); // then
    }

    @Test
    void costFor3kmDistanceShouldBe30() {
        CabRide cabRide = new CabRide(6, 0);
        assertEquals(60, cabRide.cost());
    }

    @Test
    void costFor3MinWaitTimeShouldBe6() {
        CabRide cabRide = new CabRide(5, 3);
        assertEquals(56, cabRide.cost());
    }

    @Test
    void minimumCostOfARideShouldBe40() {
        CabRide cabRide = new CabRide(1, 2);
        assertEquals(40, cabRide.cost());
    }
}
