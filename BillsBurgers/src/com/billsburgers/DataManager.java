package com.billsburgers;

import java.io.Console;

public class DataManager {

    /*
        Fields relating to the Hamburger class.
        These contain the pre-set values for fields contained in the Hamburger class.
     */
    private final static double hamburgerPrice = 25.00;
    private final static int hamburgerMaxAdditions = 4;
    private final static String hamburgerAdditionError = "A maximum of 4 additions is allowed for the hamburger.";

    /*
        Methods relating to the Hamburger class.
     */
    public static double hamburgerPrice(){
        return hamburgerPrice;
    }

    public static int hamburgerMaxAdditions(){
        return hamburgerMaxAdditions;
    }

    public static String hamburgerAdditionError(){
        return hamburgerAdditionError;
    }

}
