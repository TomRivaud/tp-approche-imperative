package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args){

        System.out.println("Jouons au jeu des 21 bâtons de Fort Boyard");

        Scanner scanner = new Scanner(System.in);
        int nbChosen = 0;
        int nbBaton = 21;
        boolean playerTurn = false;

        while (nbBaton > 0){
            while(nbChosen != 1 && nbChosen != 2 && nbChosen != 3){
                System.out.println("Choisissez entre 1 et 3 bâtons à tirer : ");
                nbChosen = scanner.nextInt();
            }
            if(nbChosen == 1 && nbChosen == 2 && nbChosen == 3){
                System.out.println("Il reste " + nbBaton + " bâtons");
                playerTurn = true;
                nbBaton -= nbChosen;
                if(playerTurn = true && nbBaton > 0){
                    playerTurn = false;
                    Random rn = new Random();
                    int max = 3;
                    int min = 1;
                    int answer = rn.nextInt(max - min) + min;
                    System.out.println("Il reste " + nbBaton + " bâtons");
                }
            }
        }
        if (nbBaton <= 0 && playerTurn == true){
            System.out.println("Vous avez perdu !");
        }
        else if (nbBaton <= 0 && playerTurn == false){
            System.out.println("Vous avez gagné !");
        }

    }
}
