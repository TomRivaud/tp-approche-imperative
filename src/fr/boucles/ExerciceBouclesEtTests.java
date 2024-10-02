package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main (String[] args){

        //Array demandé
        int[] array =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int indexArray;

        //Éléments du tableau
        System.out.println("Éléments du tableau");
        for(indexArray=0; indexArray<array.length; indexArray++){
            System.out.println(array[indexArray]);
        }

        //Éléments du tableau ordre inversé
        System.out.println("\n Éléments du tableau ordre inversé");
        for(indexArray=array.length-1; indexArray>-1; indexArray--){
            System.out.println(array[indexArray]);
        }

        //Affichage des entiers >3
        System.out.println("\n Éléments du tableau >3");
        for(indexArray=0; indexArray<array.length; indexArray++){
            if(array[indexArray] > 3){
                System.out.println(array[indexArray]);
            }
        }

        //Affichage des entiers pairs
        System.out.println("\n Entiers pairs");
        for(indexArray=0; indexArray<array.length; indexArray++){
            if(array[indexArray] % 2 == 0){
                System.out.println(array[indexArray]);
            }
        }

        //Affichage des valeurs des index pairs
        System.out.println("\n Valeurs des index pairs");
        for(indexArray=0; indexArray<array.length; indexArray++){
            if(indexArray % 2 == 0){
                System.out.println(array[indexArray]);
            }
        }

        //Affichage des entiers impairs
        System.out.println("\n Entiers impairs");
        for(indexArray=0; indexArray<array.length; indexArray++){
            if(array[indexArray] % 2 != 0){
                System.out.println(array[indexArray]);
            }
        }
    }
}
