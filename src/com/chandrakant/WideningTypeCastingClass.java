package com.chandrakant;

public class WideningTypeCastingClass {
    public static void main(String[] args) {

        int i = 5;
        //automatically converts the integer type into long type
        long l = i;
        //automatically converts the long type into float type
        float f = l;

        System.out.println("Before conversion, int value : " +i);
        System.out.println("After conversion, long value : " +l);
        System.out.println("After conversion, float value : " +f);

    }
}
