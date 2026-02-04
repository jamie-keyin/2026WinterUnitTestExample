package com.keyin.common;

import com.keyin.aircraft.Aircraft;

public class RestClient {
    private String URLRoot;

    public String sendGetRequest(Aircraft aircraft) {
        //TODO: Handle construction of the URL properly
        return "{ \"status\": \"no-status\" }";
    }

    public String getURLRoot() {
        return URLRoot;
    }

    public void setURLRoot(String URLRoot) {
        this.URLRoot = URLRoot;
    }
}
