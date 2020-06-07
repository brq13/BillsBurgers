package com.summer.burgersMasterOOP;

public class HealthyHamburger extends Hamburger {

    private HealthyAdditionsType[] healthyAdditionsType;

    public HealthyHamburger(String hamburgerName, MeatType meatType, AdditionsType... additionsType) {
        super(hamburgerName, new RyeBread(), meatType, additionsType);
    }
}

class HealthyAdditionsType extends AdditionsType {

    public HealthyAdditionsType(String additionsTypeName, double additionsTypePrice) {
        super(additionsTypeName, additionsTypePrice);
    }

}

class Broccoli extends HealthyAdditionsType {

    public Broccoli() {
        super("Broccoli", 4);
    }
}

class FitnessSauce extends HealthyAdditionsType {

    public FitnessSauce() {
        super("Fitness Sauce", 4);
    }
}


