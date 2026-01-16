package com.keyin;

public class Flight {
    private Aircraft aircraft;
    private String destination;
    private String origin;

    public boolean isComplete() {
        return aircraft.getStatus().equals("landed-at-gate");
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
