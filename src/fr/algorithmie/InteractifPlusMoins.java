package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args){

        System.out.println("Entrez un nombre entre 1 et 100 : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        int nbToFind = 58;
        int nCoups = 0;

        while (nb != nbToFind){
            if(nb < nbToFind){
                System.out.println("C'est plus grand : ");
            }
            else {
                System.out.println("C'est plus petit : ");
            }
            nb = scanner.nextInt();
            nCoups++;
        }
        if(nb == nbToFind){
            nCoups++;
            System.out.println("Bravo, vous avez trouvé en " + nCoups + " coups");
        }
    }
}
