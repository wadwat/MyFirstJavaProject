package com.chandrakant;

import java.util.Scanner;

public class CalculatingPersentageClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you marks.");
        System.out.println(" 1) Enter Your Subject:1 Marks.");
        int a = sc.nextInt();
        System.out.println(" 2)Enter Your Subject:2 Marks.");
        int b = sc.nextInt();
        System.out.println(" 3)Enter Your Subject:3 Marks.");
        int c = sc.nextInt();
        System.out.println(" 4)Enter Your Subject:4 Marks.");
        int d = sc.nextInt();
        System.out.println(" 5)Enter Your Subject:5 Marks.");
        int e = sc.nextInt();
        int sum = (a + b + c + d + e);
        System.out.println("Total marks you gain : " + sum);
        float p = (sum / 500f * 100);
        System.out.println("Persentage : " + p);
        System.out.println("Thank You for using java.");
        System.out.println("Have a Good Day.");
    }

}
