package com.company;

import java.util.Random;

public class randomNumber {
    private int min = 0;
    private int max = 0;

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    randomNumber() {
    }

    // get random integer from a range set my min and max variables
    public int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max+1)).limit(1).findFirst().getAsInt();
    }
    //---------------------------------------------
}
