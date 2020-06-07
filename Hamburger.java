package com.summer.burgersMasterOOP;

public class Hamburger {
    private String hamburgerName;
    private BreadType breadType; // Rye Bread, Multigrain Bread, Pita Bread
    private MeatType meatType; // Poke, Beef, Chicken, Mutton
    private AdditionsType[] additionsType; // Every addition costs 2$
    private double totalHamburgerPrice;

    public Hamburger(String hamburgerName, BreadType breadType, MeatType meatType, AdditionsType ... additionsType) {
        this.hamburgerName = hamburgerName;
        this.breadType = breadType;
        this.meatType = meatType;
        this.additionsType = additionsType;
    }

    public String getHamburgerName() {
        return hamburgerName;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public AdditionsType[] getAdditionsType() {
        return additionsType;
    }

    public double getTotalAdditionsPrice() {
        int totalAdditionsPrice = 0;
        for(int i = 0; i < additionsType.length; i++) {
            totalAdditionsPrice+=additionsType[i].getAdditionsTypePrice();
        }
        return totalAdditionsPrice;
    }

    public void getTotalAdditionsName() {
        for(int i = 0; i < additionsType.length; i++) {
            System.out.println(additionsType[i].getAdditionsTypeName() + " : " + additionsType[i].getAdditionsTypePrice());
        }

    }

    public void getTotalHamburgerPrice() {
        totalHamburgerPrice = breadType.getBreadTypePrice() + meatType.getMeatTypePrice() + getTotalAdditionsPrice();
        System.out.print(hamburgerName + " consists of:\n" + "BREAD:\n" + breadType.getBreadTypeName() + " : " + breadType.getBreadTypePrice() + "\n"
                + "MEAT:\n" + meatType.getMeatTypeName() + " : " + meatType.getMeatTypePrice() + "\n"
                + "ADDITIONS:\n");
        getTotalAdditionsName();
        System.out.println("\n"
                + "TOTAL PRICE: " + totalHamburgerPrice + "\n");
    }
}
