package org.example;

import org.example.exceptions.InfectionException;

import java.util.Date;

public class CovidResults {

    public static boolean covidPositive;
    private Date date;
    //private Boolean covidPositive;

    public CovidResults(Date date, Boolean covidPositive) {
        this.date = date;
        this.covidPositive = covidPositive;
    }

    public void covidPositive() throws InfectionException{
       if (covidPositive == true) {
           throw new InfectionException();
       }
    }

    public void covidNegative() {
        if (covidPositive == false) {
            System.out.println("It's false yay!");
        }
    }


    public Date getDate() {
        return date;
    }
}
