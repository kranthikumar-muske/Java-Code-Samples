package com.kranthi.abcd;

import java.util.Map;

public class FlightReservation {
    String reservationCode;
    FlightSchedule flightSchedule;
    Map<Passenger,Seat> seatMap;
    Instant reservedDateTm;
    ReservationStatus reservationStatus;
}
