package fr.boucles;

public class ExerciceTableauEntier {
    public static void main (String[] args){

        //Tableau d’entiers contenant tous les entiers de 1 à 10
        int[] oneToTen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Premier élément du tableau
        System.out.println("Premier élément du tableau : " + oneToTen[0]);

        //Longueur du tableau
        System.out.println("length du tableau : " + oneToTen.length);

        //Dernier élément du tableau
        System.out.println("Dernier élément du tableau via length : " +  oneToTen[oneToTen.length-1]);

        //Modification de l'index 4 du tableau par 8
        oneToTen[4] = 8;
    }
}
