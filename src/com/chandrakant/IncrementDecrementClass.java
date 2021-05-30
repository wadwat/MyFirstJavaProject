package com.chandrakant;

public class IncrementDecrementClass {
    public static void main(String[] args) {
        int marks = 0;
        System.out.println(++marks);
        System.out.println(marks++);
        System.out.println(marks);
        System.out.println((++marks) + (marks++) + (++marks));
        System.out.println(marks);
        System.out.println(++marks + marks-- * ++marks + ++marks);
        System.out.println(marks);
        System.out.println("Thank you for using java.");
        System.out.println("Have a good day.");
    }
}
