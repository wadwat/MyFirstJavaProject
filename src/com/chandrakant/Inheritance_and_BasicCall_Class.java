package com.chandrakant;

public class Inheritance_and_BasicCall_Class {
    public static void main(String[] args) {
        Teacher TeacherRef = new Teacher();
        TeacherRef.Test1();
        TeacherRef.Test2(35);
        int value = TeacherRef.Test3();
        System.out.println("Value = " + value);

        Student StudentRef = new Student();
        StudentRef.Solution1();
        StudentRef.Solution2(62);
        int number = StudentRef.Test3();
        System.out.println("Teacher Value = " + number);
        System.out.println();

        System.out.println("Thank You for using java.");
        System.out.println("Have a Good Day.");
    }
}
class Teacher {
    public void Test1() {
        System.out.println("//// Teacher Class");
    }
    public void Test2(int a) {
        System.out.println("   Value = " + a);
    }
    public int Test3() {
        return 58;
    }
}
class Student extends Teacher {
    public void Solution1() {
        System.out.println();
        System.out.println("//// Student Class");
    }
    public void Solution2(int b) {
        System.out.println("   Value = " + b);
    }
}
