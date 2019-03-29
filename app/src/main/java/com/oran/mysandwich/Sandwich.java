package com.oran.mysandwich;

public class Sandwich {

    private boolean bread;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean cucumber;
    private boolean mayo;

    private static final Sandwich instance = new Sandwich();


    public static Sandwich getInstance() {
        return instance;

    }

    public boolean isBread() {
        return bread;
    }

    public void setBread(boolean bread) {
        this.bread = bread;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isCucumber() {
        return cucumber;
    }

    public void setCucumber(boolean cucumber) {
        this.cucumber = cucumber;
    }

    public boolean isMayo() {
        return mayo;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

}

