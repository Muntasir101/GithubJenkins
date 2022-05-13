package com.Basic;

public class SimpleCalculator {
    public static void main(String[] args) {
        sum(10,20,4);
        sub(20,10,5);
        multiply(10,2,5);
    }
    public static void sum(int a, int b, int c){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void sub(int a, int b, int c){
        int sub = a-b-c;
        System.out.println(sub);
    }
    public static void multiply(int a, int b,int c){
        int multi = a*b*c;
        System.out.println(multi);
    }

}
