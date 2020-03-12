package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
	    int numberA = 33;
	    int numberB = 71;
	    if(numberA > numberB) {
	        System.out.println(numberA + " is greater than or equal to " + numberB);
        }
        else if(numberA == numberB) {
            System.out.println(numberB + " is equal to " + numberA);
        }
        else {
            System.out.println(numberB + " is greater than or equal to " + numberA);
        }
    }
}
