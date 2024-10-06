package fr.algorithmie;

public class SommeDeTableaux {
    public static void main (String[] args){

        //Déclaration des tableaux
        int[] firstArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] secondArray = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        //Somme des éléments du tableau
        int i;
        int[] sommeArray = new int [firstArray.length];
        for (i=0; i<firstArray.length; i++){
            sommeArray[i] = firstArray[i] + secondArray[i];
            System.out.println(sommeArray[i]);
        }
    }
}
