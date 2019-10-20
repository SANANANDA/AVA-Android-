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
            for (int a = 0; a < (numArray.length - 1); a++) {
                if (numArray[a] > numArray[a + 1]) {
                    int tempNum = numArray[a];
                    numArray[a] = numArray[a + 1];
                    numArray[a + 1] = tempNum;
                }
            }
            //------------------------------
            // prints each iteration for debugging purposes
            for (int b = 0; b < numArray.length; b++) {
                System.out.print(numArray[b] + " ");
            }
            System.out.println();
        }
    }
}
