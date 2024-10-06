package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args){

        //Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Entiers > 3 dans array
        System.out.println("Entiers > 3 dans array");
        int i;
        for (i=0; i<array.length; i++){
            if(array[i] > 3){
                System.out.println(array[i]);
            }
        }

        //Entiers pairs dans array
        System.out.println("Entiers pairs dans array");
        for (i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }

        //Entiers avec index pairs dans array
        System.out.println("Entiers avec index pairs dans array");
        for (i=0; i<array.length; i++){
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        //Entiers impairs dans array
        System.out.println("Entiers impairs dans array");
        for (i=0; i<array.length; i++){
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
