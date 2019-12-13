package com.company;

public class dayTwo {

    public static int[] gravityAssist(int[] opcodeArray) {
        try {

                for (int opcodeLoc = 0; opcodeLoc < opcodeArray.length; opcodeLoc = opcodeLoc + 4) {
                    int opcodeLoc2 = opcodeLoc + 1;
                    int opcodeLoc3 = opcodeLoc + 2;
                    int opcodeLoc4 = opcodeLoc + 3;

                    int opcodeValue = opcodeArray[opcodeLoc];
                    if (opcodeValue == 1) {
                        int input1 = opcodeArray[opcodeLoc2];
                        int input2 = opcodeArray[opcodeLoc3];
                        int output = opcodeArray[opcodeLoc4];
                        opcodeArray[output] = opcodeArray[input1] + opcodeArray[input2];
                    }else if (opcodeValue == 2) {
                        int input1 = opcodeArray[opcodeLoc2];
                        int input2 = opcodeArray[opcodeLoc3];
                        int output = opcodeArray[opcodeLoc4];
                        opcodeArray[output] = opcodeArray[input1] * opcodeArray[input2];
                    } else if (opcodeValue == 99) {
                        continue;
                    }else {
                        continue;
                    }
                }
        } catch (Exception e) {
            System.out.println("Failed exception on gravityAssist: " + e);
        }

        return opcodeArray;

    }
}
