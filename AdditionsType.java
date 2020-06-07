package com.summer.burgersMasterOOP;

public class AdditionsType {
    private String additionsTypeName;
    protected double additionsTypePrice;

    public AdditionsType(String additionsTypeName, double additionsTypePrice) {
        this.additionsTypeName = additionsTypeName;
        this.additionsTypePrice = additionsTypePrice;
    }

    public String getAdditionsTypeName() {
        return additionsTypeName;
    }

    public double getAdditionsTypePrice() {
        return additionsTypePrice;
    }
}

class Lettuce extends AdditionsType {
    public Lettuce() {
        super("Lettuce", 2);
    }
}

class Tomato extends AdditionsType {
    public Tomato() {
        super("Tomato", 2);
    }
}

class Carrot extends AdditionsType {
    public Carrot() {
        super("Carrot", 2);
    }
}

class Cucumber extends AdditionsType {
    public Cucumber() {
        super("Cucumber", 2);
    }
}


