package com.billsburgers;

import java.util.ArrayList;

public class Hamburger {

    private String name;
    private String rollType;
    private String meat;
    private double basePrice;
    private double totalPrice;
    public int maxAdditions;
    private ArrayList<Addition> additions;

    public Hamburger(String name, String rollType, String meat) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = DataManager.hamburgerPrice();
        this.totalPrice = this.basePrice;
        this.maxAdditions = DataManager.hamburgerMaxAdditions();
        this.additions = new ArrayList<Addition>();
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addAddition(Addition addition){
        if(this.additions.size() < this.maxAdditions){
            this.additions.add(addition);
            this.incrementTotalPrice(addition.getPrice());
        }
        else{
            System.out.println(this.additionError());
        }
    }

    private String additionError() {
        return DataManager.hamburgerAdditionError();
    }

    private void incrementTotalPrice(double price){
        this.totalPrice += price;
    }

}

