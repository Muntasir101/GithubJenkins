package com.Basic;

public class SimpleCalculator {
    public static void main(String[] args) {
        sum(10,20);
        sub(20,10);
        multiply(10,2);
    }
    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void sub(int a, int b){
        int sub = a-b;
        System.out.println(sub);
    }
    public static void multiply(int a, int b){
        int multi = a*b;
        System.out.println(multi);
    }

}
