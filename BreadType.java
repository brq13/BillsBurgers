package com.summer.burgersMasterOOP;

public class BreadType {
    private String breadTypeName;
    private double breadTypePrice;

    public BreadType(String breadTypeName, double breadTypePrice) {
        this.breadTypeName = breadTypeName;
        this.breadTypePrice = breadTypePrice;
    }

    public String getBreadTypeName() {
        return breadTypeName;
    }

    public double getBreadTypePrice() {
        return breadTypePrice;
    }
}

class RyeBread extends BreadType {
    public RyeBread() {
        super("Rye Bread", 5);
    }
}

class MultigrainBread extends BreadType {
    public MultigrainBread() {
        super("Multigrain Bread", 6);
    }
}

class PitaBread extends BreadType {
    public PitaBread() {
        super("Pita Bread", 7);
    }
}