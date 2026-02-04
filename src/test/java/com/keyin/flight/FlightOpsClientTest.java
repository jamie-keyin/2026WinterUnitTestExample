package com.keyin.flight;

import com.keyin.aircraft.Aircraft;
import com.keyin.aircraft.Status;
import com.keyin.common.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FlightOpsClientTest {
    private RestClient restClient = new RestClient();

    @Mock
    private RestClient mockRestClient;

    @Test
    public void testGetAircraftStatus() {
        FlightOpsClient flightOpsClientUnderTest = new FlightOpsClient();
        flightOpsClientUnderTest.setRestClient(restClient);

        Aircraft aircraftUnderTest = new Aircraft();
        aircraftUnderTest.setTailNumber("1234T");

        Status status = flightOpsClientUnderTest.getAircraftStatus(aircraftUnderTest);

        System.out.println("Status was: " + status);

        Assertions.assertEquals(Status.DEFAULT, status);

        // Test In-Flight Status

        flightOpsClientUnderTest.setRestClient(mockRestClient);

        Mockito.when(mockRestClient.sendGetRequest(aircraftUnderTest)).thenReturn("{ \"status\": \"in-flight\" }");
        status = flightOpsClientUnderTest.getAircraftStatus(aircraftUnderTest);

        System.out.println("Status was: " + status);

        Assertions.assertEquals(Status.IN_FLIGHT, status);

    }

}
