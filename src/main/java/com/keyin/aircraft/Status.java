package com.keyin.aircraft;

public class Status {
    public static Status LANDED_AT_GATE = new Status("landed-at-gate");
    public static Status IN_FLIGHT = new Status("in-flight");
    public static Status DEFAULT = new Status("no-status");

    private String status;

    public Status() {

    }

    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            return ((Status)obj).getStatus().equalsIgnoreCase(this.status);
        }

        return false;
    }

    @Override
    public String toString() {
        return status;
    }
}
