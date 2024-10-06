package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args){

        //Scanner
        System.out.println("Entrez un nombre compris entre 1 et 10 : ");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt();

        //Boucle si != au résultat demandé
        while (nb < 1 || nb > 10){
            System.out.println("Entrez un nombre compris entre 1 et 10 : ");
            nb = scanner.nextInt();
        }

        //Résultat demandé entré
        if(nb > 1 && nb < 10){
            System.out.println(nb);
        }
    }
}
