package com.company;

import java.lang.reflect.Array;

public class dayThree {

    public static double calculateManhattan(Array[] lineOne, Array[] lineTwo) {
        double distance = 0;

        /*
        We want to return the distance of the crossing points and how far away they are from central port.
        The central port is at position 0,0. The manhattan distance is going to be the sum of the x and y value.
        First we need to setup the array that we will step through moving our point. (drawing our line)
        we will look at the first character to get the direct and then look at the rest of the text to figure out how far.
        how do we tell if the lines have overlapped. 
        */

        if (lineOne.toString().isBlank()) {
            System.out.println("The array is empty.");
            distance = 1;
        } else {
            distance = 2;
        }
        return distance;
    }
}
