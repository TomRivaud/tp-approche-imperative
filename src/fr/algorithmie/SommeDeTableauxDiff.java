package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args){

        //Déclaration des tableaux
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        //Trouver le tableau le plus long
        int biggestArrayLength;
        if (array1.length >= array2.length){
            biggestArrayLength = array1.length;
        }
        else {
            biggestArrayLength = array2.length;
        }

        //Somme des tableaux
        int[] sommeArray = new int[biggestArrayLength];
        int i;
        for (i=0; i<biggestArrayLength; i++){
            if (i > array2.length-1){
                sommeArray[i] = array1[i];
            }
            else {
                sommeArray[i] = array1[i] + array2[i];
            }
            System.out.println("Somme des tableaux : " + sommeArray[i]);
        }

    }

}
