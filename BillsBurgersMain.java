package com.summer.burgersMasterOOP;

public class BillsBurgersMain {
    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger("Test Hamburger 1", new RyeBread(), new Poke(), new Lettuce());
        hamburger1.getTotalHamburgerPrice();

        Hamburger hamburger2 = new Hamburger("Test Hamburger 2", new PitaBread(), new Mutton(), new Lettuce(), new Tomato(), new Carrot(), new Cucumber());
        hamburger2.getTotalHamburgerPrice();

        Hamburger hamburger3 = new Hamburger("Test Hamburger 3", new MultigrainBread(), new Chicken(), new Carrot(), new Cucumber(), new FitnessSauce());
        hamburger3.getTotalHamburgerPrice();

        Hamburger healthyHamburger1 = new HealthyHamburger("Test Healthy Hamburger 1", new Chicken(), new Broccoli(), new Tomato(), new Carrot(), new FitnessSauce());
        healthyHamburger1.getTotalHamburgerPrice();
    }
}
