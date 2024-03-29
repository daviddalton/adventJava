package com.company;

import java.lang.reflect.Array;
import java.util.Random;

import static com.company.dayTwo.gravityAssist;
import static com.company.dayThree.calculateManhattan;

public class Main {

    public static void main(String[] args) {

        boolean calcFuel = false; // must be true if the second program wants to be run
        boolean calcOpCode = false;
        boolean runManhattan = true;

        if (calcFuel) {
            double totalFuel = 0;

            double[] moduleArray = new double[]{138828, 82053, 75644, 86659, 85337, 63842, 88120, 144319, 58294, 82233, 81964, 108059, 117326, 65553, 105367, 122086, 70431, 89418, 108818, 61254, 97351, 75645, 88868, 140241, 112242, 119866, 86519, 81313, 60462, 89313, 134057, 96984, 57528, 112293, 94987, 71785, 104896, 108760, 68391, 95901, 112259, 51337, 75020, 99526, 132617, 63797, 121541, 111211, 70179, 51681, 60569, 56247, 55871, 61344, 56965, 76208, 137230, 99499, 109960, 81224, 93064, 137496, 111009, 99572, 135425, 121418, 79337, 110813, 87081, 110898, 71344, 99419, 139493, 52847, 112560, 144685, 79700, 139438, 127821, 133377, 82892, 107311, 118376, 96197, 66839, 63551, 145689, 94461, 93739, 106350, 67884, 124828, 141116, 78967, 143686, 137159, 85746, 115543, 73157, 132343};

            for (double mass : moduleArray) {
                while (mass > 0) {
                    mass = Math.floor(mass / 3) - 2;
                    if (mass > 0) {
                        totalFuel = totalFuel + mass;
                    }

                }
            }

            if (calcOpCode) {
                System.out.println("Total Fuel Required: " + totalFuel);
                Random r = new Random();
                final int goalCode = 19690720;
                int[] opcode = new int[]{1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 1, 10, 19, 2, 6, 19, 23, 1, 23, 5, 27, 1, 27, 13, 31, 2, 6, 31, 35, 1, 5, 35, 39, 1, 39, 10, 43, 2, 6, 43, 47, 1, 47, 5, 51, 1, 51, 9, 55, 2, 55, 6, 59, 1, 59, 10, 63, 2, 63, 9, 67, 1, 67, 5, 71, 1, 71, 5, 75, 2, 75, 6, 79, 1, 5, 79, 83, 1, 10, 83, 87, 2, 13, 87, 91, 1, 10, 91, 95, 2, 13, 95, 99, 1, 99, 9, 103, 1, 5, 103, 107, 1, 107, 10, 111, 1, 111, 5, 115, 1, 115, 6, 119, 1, 119, 10, 123, 1, 123, 10, 127, 2, 127, 13, 131, 1, 13, 131, 135, 1, 135, 10, 139, 2, 139, 6, 143, 1, 143, 9, 147, 2, 147, 6, 151, 1, 5, 151, 155, 1, 9, 155, 159, 2, 159, 6, 163, 1, 163, 2, 167, 1, 10, 167, 0, 99, 2, 14, 0, 0};
                int[] opcodeCopy = opcode.clone();
                while (opcodeCopy[0] != goalCode) {
                    opcodeCopy = opcode.clone();
                    int noun = opcodeCopy[1] = r.nextInt(100);
                    int verb = opcodeCopy[2] = r.nextInt(100);
                    gravityAssist(opcodeCopy);
                    System.out.println("0 position: " + opcodeCopy[0] + " noun: " + noun + " verb: " + verb);
                    System.out.println(100 * noun + verb);
                }
            }
        }




        if (runManhattan) {
            Array[] line = new Array[5];
            Array[] line2 = new Array[5];
            System.out.println(calculateManhattan(line, line2));
        }



    }
}
