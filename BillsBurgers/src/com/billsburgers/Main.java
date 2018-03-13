package com.billsburgers;

public class Main {

    public static void main(String[] args) {
        Addition lettuce = new Addition("Lettuce", 2.00);
        Addition tomato = new Addition("Tomato", 3.00);
        Addition gherkin = new Addition("Gherkins", 5.00);
        Addition mushroom = new Addition("Mushrooms", 7.25);
        Addition chips = new Addition("Chips", 12.00);
        Addition drink = new Addition("Drink", 10.00);

        Hamburger hamburger = new Hamburger("Hamburger", "Rye Bread", "Chicken");
        System.out.println(hamburger.getName() + " selected!\nBase Price: \t\tR" + hamburger.getBasePrice() + "\nTotal Price: \t\tR" + hamburger.getTotalPrice());

        hamburger.addAddition(lettuce);
        System.out.println("Total Price: \t\tR" + hamburger.getTotalPrice());

        hamburger.addAddition(tomato);
        System.out.println("Total Price: \t\tR" + hamburger.getTotalPrice());

        hamburger.addAddition(chips);
        System.out.println("Total Price: \t\tR" + hamburger.getTotalPrice());

        hamburger.addAddition(drink);
        System.out.println("Total Price: \t\tR" + hamburger.getTotalPrice());

        hamburger.addAddition(gherkin);
        System.out.println("Total Price: \t\tR" + hamburger.getTotalPrice());
    }
}
