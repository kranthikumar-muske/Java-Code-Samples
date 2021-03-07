package com.kranthi.riskIqInterview;

import java.util.List;

public class Airport {
    private String airportName;
    private String airportCode;
    private Address airportAddress;
    private List<Flight> flights;

    public List<Flight> getFlightsList(){
        return flights;
    }

    public Airport(String airportName, String airportCode, Address airportAddress, List<Flight> flights) {
        this.airportName = airportName;
        this.airportCode = airportCode;
        this.airportAddress = airportAddress;
        this.flights = flights;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Address getAirportAddress() {
        return airportAddress;
    }

    public void setAirportAddress(Address airportAddress) {
        this.airportAddress = airportAddress;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
