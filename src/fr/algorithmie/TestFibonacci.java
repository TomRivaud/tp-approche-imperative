package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {

        System.out.println("Choisir un rang N : ");
        Scanner scanner = new Scanner(System.in);
        int rangN = scanner.nextInt();

        //Calcul et affichage
        int numFib1 = 0, num2Fib2 = 1;

        for (int i = 0; i < rangN; i++) {
            System.out.print(numFib1 + " ");

            int numFib3 = num2Fib2 + numFib1;
            numFib1 = num2Fib2;
            num2Fib2 = numFib3;

        }
    }
}
