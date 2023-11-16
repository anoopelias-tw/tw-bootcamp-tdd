package org.cabs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabRideTest {

    @Test
    void costFor2KmDistanceShouldBe20() {
        CabRide cabRide = new CabRide(2, 0); // given
        int cost = cabRide.cost();  // when
        assertEquals(20, cost); // then
    }

    @Test
    void costFor3kmDistanceShouldBe30() {
        CabRide cabRide = new CabRide(3, 0);
        assertEquals(30, cabRide.cost());
    }

    @Test
    void costFor3MinWaitTimeShouldBe6() {
        CabRide cabRide = new CabRide(0, 3);
        assertEquals(6, cabRide.cost());
    }
}
