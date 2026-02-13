package com.keyin;

import com.keyin.aircraft.Aircraft;
import com.keyin.flight.FlightOpsClient;

public class FlightOpsClientApplication {

    public static void main(String[] args) {
        FlightOpsClient flightOpsClient = new FlightOpsClient();

        Aircraft aircraft = new Aircraft();
        aircraft.setTailNumber("T12345");

        aircraft.setStatus(flightOpsClient.getAircraftStatus(aircraft));

        System.out.println("** Status for Aircraft with Tail# " + aircraft.getTailNumber() + " is: " + aircraft.getStatus() + "**");
    }
}
