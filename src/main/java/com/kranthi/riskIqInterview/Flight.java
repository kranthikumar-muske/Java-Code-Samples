package com.kranthi.riskIqInterview;

import java.util.List;

public class Flight {
    private String flightNumber;
    private int duration;
    private String departure;
    private String arrival;
    List<Seat> seats;

    public Flight(String flightNumber, int duration, String departure, String arrival, List<Seat> seats) {
        this.flightNumber = flightNumber;
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
        this.seats = seats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
