package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            new Main().run();

    }
    void run() {
        runCalculator();
    }
    double getUserInputDouble() {
        Scanner scanner = new Scanner(System.in) ;
        double userInputDouble = scanner.nextDouble();
       return userInputDouble;
    }

     void runCalculator() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("skriv første tal: ");
        double firstInputNumber = getUserInputDouble();
        System.out.print("skriv andet tal: ");
        double secondInputNumber = getUserInputDouble();
        System.out.println("vælg operator ( + , - , * , / )");
        switch (scanner.next()) {
            case "+":
                System.out.println(calculator.add(firstInputNumber, secondInputNumber));
                break;
            case "-":
                System.out.println(calculator.subtract(firstInputNumber, secondInputNumber));
                break;
            case "*":
                System.out.println(calculator.multiply(firstInputNumber, secondInputNumber));
                break;
            case "/":
                System.out.println(calculator.divide(firstInputNumber, secondInputNumber));
                break;
        }


    }
}

