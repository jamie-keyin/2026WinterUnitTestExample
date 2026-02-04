package com.keyin.flight;

import com.keyin.aircraft.Aircraft;
import com.keyin.aircraft.Status;
import com.keyin.common.RestClient;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

public class FlightOpsClient {
    private RestClient restClient;

    public Status getAircraftStatus(Aircraft aircraft) {
        if (restClient != null) {
            restClient.setURLRoot("http://localhost:8080/flight_ops/status");

            String response = restClient.sendGetRequest(aircraft);

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response, Status.class);
        }

        return Status.DEFAULT;
    }

    public RestClient getRestClient() {
        return restClient;
    }

    public void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }
}
