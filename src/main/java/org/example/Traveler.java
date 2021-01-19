package org.example;


import org.example.exceptions.InfectionException;
import org.example.exceptions.NoFlyListException;

import java.util.List;

public class Traveler {

    private String name;
    private String passPortNo;
    private Double money;
    private List<Destination> placesVisted;
    private Boolean noFlyList;
    private CovidResults covidResults;

    public Traveler(String name, String passPortNo, Double money, List<Destination> placesVisted,
                    Boolean noFlyList, CovidResults covidResults) {
        this.name =  name;
        this.passPortNo = passPortNo;
        this.money = money;
        this.placesVisted = placesVisted;
        this.noFlyList = noFlyList;
        this.covidResults = covidResults;
    }

    public void bookATrip(Destination destination) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassPortNo() {
        return passPortNo;
    }

    public void setPassPortNo(String passPortNo) {
        this.passPortNo = passPortNo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public List<Destination> getPlacesVisted() {
        return placesVisted;
    }

    public void setPlacesVisted(List<Destination> placesVisted) {
        this.placesVisted = placesVisted;
    }

    public void noFlyListTrue() throws NoFlyListException {
        if (noFlyList == true) {
            throw new NoFlyListException();
        }
    }

    public boolean noFlyListFalse() {
        if (noFlyList == false) {
            System.out.println("Yay I can fly!");
        }
        return noFlyList;
    }

    public Boolean isNoFlyList() {
        return noFlyList;
    }

    public void setNoFlyList(boolean noFlyList) {

        this.noFlyList = noFlyList;
    }

    public CovidResults getCovidResults() {
        return covidResults;
    }

    public void setCovidResults(CovidResults covidResults) {
        this.covidResults = covidResults;
    }
}
