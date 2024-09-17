package src.calculator2refactor;


import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator2 {


        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            double num1=0;
            double num2=0;
            char operator;
            double result;
            boolean running  = true;
            while (running){
                System.out.println("Velkommen til regnemaskinen");
                System.out.println(" + for addition ");
                System.out.println(" - for subtraktion");
                System.out.println(" * for multiplikation");
                System.out.println(" / for division");
                System.out.println(" q for quit");
                operator=input.next().charAt(0);

                if (operator=='q')
                    running=false;

                num1=inputDouble("write first number : ");




                num2=inputDouble("write second number : ");

                switch (operator){
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '*':
                        result=num1*num2;
                        break;
                    case '/':
                        result=num1/num2;
                        break;
                    default:
                        System.out.print("ugyldig oprator (regne tegn)");
                        input.nextLine();
                        continue;
                }
                System.out.print("Resultat = " + result);


            }
        }
        static double inputDouble(String promt) {
            Scanner input=new Scanner(System.in);
            boolean validInput = false;
            double userInputNumber=0;

            do {
                try {   //checks for valid input, if not valid, will catch exeption and try again untill input is valid.
                    System.out.print(promt);
                    userInputNumber = input.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("wrong input, try again");
                }
            } while (!validInput);
            return userInputNumber;
        }
    }


