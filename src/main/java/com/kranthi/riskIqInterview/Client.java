package com.kranthi.riskIqInterview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    @Test
    public void testAirlineSearch(){
        //AddFlights
        Flight flight1 = new Flight("B1", 2, "vegas", "kansasCode", new ArrayList<>());
        Flight flight2 = new Flight("B2", 2, "sfo", "kansas", new ArrayList<>());
        Flight flight3 = new Flight("B3", 2, "florida", "kansas", new ArrayList<>());
        Flight flight4 = new Flight("B4", 2, "losangeles", "kansas", new ArrayList<>());
        Flight flight5 = new Flight("B5", 2, "dallas", "kansas", new ArrayList<>());
        Flight flight6 = new Flight("B6", 2, "vegas", "kansasCode", new ArrayList<>());
        Flight flight7 = new Flight("B7", 2, "vegas", "kansasCode", new ArrayList<>());
        Flight flight8 = new Flight("B8", 2, "sfo", "kansas", new ArrayList<>());
        Flight flight9 = new Flight("B9", 2, "dallas", "kansas", new ArrayList<>());
        Flight flight10 = new Flight("B10", 2, "miami", "kansas", new ArrayList<>());
        List<Flight> flights = new ArrayList<>(Arrays.asList(flight1,flight2,flight3,flight4,flight5,flight6,flight7,flight8,flight9,flight10));

        //Add airports
        Airport airport1 = new Airport("vegas", "vegasCode", new Address(), new ArrayList<>(Arrays.asList(flight1,flight6,flight7)));
        Airport airport2 = new Airport("kansas", "kansasCode", new Address(), new ArrayList<>(Arrays.asList(flight1)));
        Airport airport3 = new Airport("dallas", "dallasCode", new Address(), new ArrayList<>(Arrays.asList(flight2)));
        Airport airport4 = new Airport("losangeles", "losangelesCode", new Address(), new ArrayList<>(Arrays.asList(flight3)));
        Airport airport5 = new Airport("sfo", "sfoCode", new Address(), new ArrayList<>(Arrays.asList(flight4)));
        Airport airport6 = new Airport("miami", "miamiCode", new Address(), new ArrayList<>(Arrays.asList(flight5)));
        List<Airport> airports = new ArrayList<>(Arrays.asList(airport1,airport2,airport3,airport4,airport5,airport6));

        //write Search algorithm using source and destination
        Airport source = airport1;
        Airport destination = airport2;

        List<Flight> vegasDirectFlights =
                airport1.getFlightsList().stream().filter(s->s.getArrival().equals(destination.getAirportCode())).collect(Collectors.toList());
        System.out.println(vegasDirectFlights);
        for(Flight vegasFlight: vegasDirectFlights){
            System.out.println(vegasFlight.getFlightNumber());
        }

    }


}
