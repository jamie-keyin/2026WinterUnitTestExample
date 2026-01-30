package com.keyin.flight;

import com.keyin.aircraft.Aircraft;
import com.keyin.aircraft.Status;
import com.keyin.common.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlightOpsClientTest {
    private RestClient restClient = new RestClient();

    @Test
    public void testGetAircraftStatus() {
        FlightOpsClient flightOpsClientUnderTest = new FlightOpsClient();
        flightOpsClientUnderTest.setRestClient(restClient);

        Aircraft aircraftUnderTest = new Aircraft();
        aircraftUnderTest.setTailNumber("1234T");

        Status status = flightOpsClientUnderTest.getAircraftStatus(aircraftUnderTest);

        System.out.println("Status was: " + status);

        Assertions.assertEquals(Status.DEFAULT, status);
    }

}
