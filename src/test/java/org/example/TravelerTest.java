package org.example;

import org.example.exceptions.NoFlyListException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class TravelerTest {

    Traveler traveler;
    Destination destination;

    @Before
    public void setUp() {
        String name = "Adam";
        String passPortNo = "12345";
        Double money = 50.00;
        List<Destination> placesVisited = new ArrayList<>();
        placesVisited.add(new Destination("Switzerland", 4011.00, 0.15, false));
        boolean noFlyList = false || true;
        CovidResults covidResults = new CovidResults(new Date(), false);

        traveler = new Traveler(name, passPortNo, money, placesVisited, noFlyList, covidResults);

    }

    @Test
    public void bookATripTest() {

    }

    @Test
    public void getNameTest() {
    }

    @Test
    public void setNameTest() {
    }

    @Test
    public void getPassPortNoTest() {
    }

    @Test
    public void setPassPortNoTest() {
    }

    @Test
    public void getMoneyTest() {
    }

    @Test
    public void setMoneyTest() {
    }

    @Test
    public void getPlacesVistedTest() {
    }

    @Test
    public void setPlacesVistedTest() {
    }

    @Test(expected = NoFlyListException.class)
    public void NoFlyListTrue() {
    //boolean noFlyList = true;
    traveler.noFlyListTrue();

    }

    @Test
    public void NoFlyListFalse() {

        boolean expected = false;
        boolean actual = traveler.noFlyListFalse();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNoFlyListTest() {
    }

    @Test
    public void getCovidResultsTest() {
    }

    @Test
    public void setCovidResultsTest() {
    }
}