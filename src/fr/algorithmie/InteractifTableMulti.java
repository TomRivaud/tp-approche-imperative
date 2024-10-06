package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMulti {
    public static void main(String[] args) {

        System.out.println("Entrez un nombre compris entre 1 et 10 vous recevrez sa table : ");
        Scanner scanner = new Scanner(System.in);
        int nbToMulti = scanner.nextInt();

        //Tableau de multiplication
        int[] arrayMulti = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Boucle si != au résultat demandé
        while (nbToMulti < 1 || nbToMulti > 10){
            System.out.println("Entrez un nombre compris entre 1 et 10 vous recevrez sa table : ");
            nbToMulti = scanner.nextInt();
        }

        //Résultat demandé entré
        int i = 0;
        if(nbToMulti > 1 && nbToMulti < 10){
            while (i < 10){
                System.out.println(nbToMulti + " * " + arrayMulti[i] + " = " + nbToMulti*arrayMulti[i]);
                i++;
            }
        }


    }
}
