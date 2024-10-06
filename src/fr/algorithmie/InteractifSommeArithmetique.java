package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args){

        //Scanner
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        //Calcul
        int i = 1;
        int result = 0;
        while (i <= nb){
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
