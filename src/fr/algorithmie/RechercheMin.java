package fr.algorithmie;

public class RechercheMin {
    public static void main (String[] args){

        //Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Plus petit éléments du tableau
        int i;
        int lowestNb = array[0];
        for (i=0; i<array.length; i++){
            if (array[i] < lowestNb){
                lowestNb = array[i];
            }
        }
        System.out.println("The lowest number in array is : " + lowestNb);
    }
}
