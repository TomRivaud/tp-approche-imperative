package fr.algorithmie;

public class RechercheMax {
    public static void main (String[] args){

        //Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Plus grand éléments du tableau
        int i;
        int biggestNb = array[0];
        for (i=0; i<array.length; i++){
            if (array[i] > biggestNb){
                biggestNb = array[i];
            }
        }
        System.out.println("The biggest number in array is : " + biggestNb);
    }
}
