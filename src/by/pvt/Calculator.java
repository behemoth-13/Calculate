package by.pvt;

import java.util.Scanner;

/**
 * Created by AD13 on 11.01.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result = divide(a, b);
        System.out.println(result);

        double plus = plus(5, 6);
        System.out.println(plus);

        System.out.println();

        double multy = multy(5, 6);
        System.out.println(multy);


    }

    static double divide (double a, double b){
        return a/b;
    }
    static double multy (double a, double b) {
        return a * b;
    }
    static double plus(double a, double b) {
        return a+b;
    }
}
