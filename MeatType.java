package com.summer.burgersMasterOOP;

public class MeatType {
    private String meatTypeName; // Poke, Beef, Chicken, Mutton
    private double meatTypePrice;

    public MeatType(String meatTypeName, double meatTypePrice) {
        this.meatTypeName = meatTypeName;
        this.meatTypePrice = meatTypePrice;
    }

    public String getMeatTypeName() {
        return meatTypeName;
    }

    public double getMeatTypePrice() {
        return meatTypePrice;
    }
}

class Poke extends MeatType {

    public Poke() {
        super("Poke", 9);
    }
}

class Beef extends MeatType {

    public Beef() {
        super("Beef", 11);
    }
}

class Chicken extends MeatType {

    public Chicken() {
        super("Chicken", 7);
    }
}

class Mutton extends MeatType {

    public Mutton() {
        super("Mutton", 15);
    }
}
