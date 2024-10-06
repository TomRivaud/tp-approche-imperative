package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args){

        //Scanner
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        //Nombres qui suivent (10)
        int i = 0;
        int nbToFollow = 10;
        while (i < nbToFollow){
            System.out.println(nb+1);
            nb++;
            i++;
        }

    }

}
