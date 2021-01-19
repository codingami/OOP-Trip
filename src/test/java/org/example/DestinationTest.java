package org.example;

import org.example.exceptions.InsufficientFundsException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class DestinationTest {

    Destination destination;

    @Before
    public void SetUp() {
        destination = new Destination("Tokyo", 6754.00, 0.15, false);
    }

    @Test
    public void allowToVisitIsTrue() {
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(destination);
        CovidResults covidResults = new CovidResults(new Date(), false);
        Traveler traveler = new Traveler("Ciel", "12346", 55.00,
                placesVisited, false, covidResults);

        destination.allowToVisit(traveler);

        //If no exception is thrown, this test passes.

    }

    @Test(expected = InsufficientFundsException.class)
    public void allowToVisitIsFalse() {
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(destination);
        CovidResults covidResults = new CovidResults(new Date(), false);
        Traveler traveler = new Traveler("Boruto", "12345", 50.00,
                placesVisited, false, covidResults);

        destination.allowToVisit(traveler);

        //If InsufficientFundsException exception is thrown, this test passes.
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getDistance() {
    }

    @Test
    public void setDistance() {
    }

    @Test
    public void getCostPerMile() {
    }

    @Test
    public void setCostPerMile() {
    }

    @Test
    public void getRequireCovidTest() {
    }

    @Test
    public void setRequireCovidTest() {
    }
}