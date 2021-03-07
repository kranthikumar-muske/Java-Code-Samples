package com.kranthi.riskIqInterview;

import java.util.Date;
import java.util.Map;

public class FlightReservation {
    String reservationNumber;
    FlightSchedule flightSchedule;
    Map<Passenger,Seat> seatMap;
    Date reservedDate;
    ReservationStatus status;
}
