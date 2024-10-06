//Exercice pas réussi pour le moment



package fr.algorithmie;

public class Rotation {
    public static void main(String[] args){

        //Déclaration et récupération des valeurs
        int[] arr = {2, 5, 6, 1};
        System.out.println("Mon array : ");
        int i;
        for (i=0; i<arr.length; i++)
        System.out.println(arr[i]);

        //Rotation tableau
        int arrLastElem = arr[arr.length-1];
        int j;
        for (j = arr.length-1; j>0; j--){
            arr[j] = arr[j-1];
        }
        arr[0] = arrLastElem;

        //Affichage
        int k;
        System.out.println("Mon array après rotation : ");
        for (k=0; k<arr.length; k++)
            System.out.println(arr[k]);

    }
}
