package fr.boucles;

public class ExerciceBoucleBase {
    public static void main (String[] args){

        //Nombres de 1 à 10
        System.out.println("\n Voici les nombres de 1 à 10 :");
        int indexNombres;
        for (indexNombres=1; indexNombres<11; indexNombres++){
            System.out.println(indexNombres);
        }

        //20 fois mon nom et prénom
        System.out.println("\n Voici mon nom et prénom 20 fois :");
        String nom = "Rivaud";
        String prenom = "Tom";
        int indexNomPrenom;
        for (indexNomPrenom=1; indexNomPrenom<21; indexNomPrenom++){
            System.out.println(indexNomPrenom + ". " + nom + " " + prenom);
        }

        //Nombres pairs de 2 à 100
        System.out.println("\n Voici les nombres pairs de 2 à 100 :");
        int indexPairs;
        for (indexPairs=2; indexPairs<101; indexPairs+=2){
            System.out.println(indexPairs);
        }

        //Nombres impairs de 1 à 99
        System.out.println("\n Voici les nombres impairs de 1 à 99 :");
        int indexImpairs;
        for (indexImpairs=1; indexImpairs<100; indexImpairs+=2){
            System.out.println(indexImpairs);
        }

    }
}
