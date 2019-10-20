package com.company;

public class bubbleSort {
    bubbleSort() {
    }

    public static void runSort(){
        // Create Array of Integers to be sorted.
        int[] numArray = new int[10];
        randomNumber r = new randomNumber();

        for(int i=0; i<numArray.length; i++) {
            numArray[i] = r.getRandomInt(0,20);
        }
        //---------------------------------

        // sorts integers stored in numArray from smallest at 0th index to largest at n'th index
        for (int i=0; i<numArray.length; i++) {
            for (i = 0; i < (numArray.length - 1); i++) {
                if (numArray[i] > numArray[i + 1]) {
                    int tempNum = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = tempNum;
                }
            }
            //------------------------------
            // prints each iteration for debugging purposes
            for (i = 0; i < numArray.length; i++) {
                System.out.print(numArray[i] + " ");
            }
        }
    }
}
