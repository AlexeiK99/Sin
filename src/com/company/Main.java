package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sin(2, 6));
    }

    public static int factorial(int in) {
        if (in == 1) {
            return (1);
        }
        return in * factorial(in - 1);
    }

    public static double st(double in, int step) {
        if (step == 1) {
            return in;
        }
        return st(in, step - 1) * in;
    }

    public static double sin(double x, int step) {
        if(step==1) {
            return x;
        }
        int temp = step * 2 - 1;
        double element = st(x,temp)/factorial(temp);
        if (step % 2==0){
           return sin(x,step-1) - element;
        }
        return sin(x,step-1) + element;
    }
}
