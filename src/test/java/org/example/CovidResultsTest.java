package org.example;

import org.example.exceptions.InfectionException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CovidResultsTest {

    @Test(expected = InfectionException.class)
    public void covidPositive() {
        CovidResults covidResults = new CovidResults(new Date(), true);
        
    }

    @Test
    public void covidNegative() {
        CovidResults covidResults = new CovidResults(new Date(), false);

        boolean expected = false;
        boolean actual = CovidResults.covidPositive;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDate() {
    }
}