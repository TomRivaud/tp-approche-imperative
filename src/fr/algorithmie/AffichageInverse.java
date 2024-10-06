package fr.algorithmie;

public class AffichageInverse {
    public static void main (String[] args){

        //Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Éléments du tableau grâce à une boucle
        System.out.println("Éléments du tableau");
        int i;
        for(i=0; i<= array.length-1; i++){
            System.out.println(array[i]);
        }

        //Éléments du tableau ordre invers
        System.out.println("Éléments du tableau dans l'ordre inverse");
        for(i=array.length-1; i>= 0; i--){
            System.out.println(array[i]);
        }

        //Création de la copie de array
        System.out.println("Copie de array dans arrayCopy");
        int[] arrayCopy = new int[array.length];
        for (i=0; i< array.length-1; i++){
            arrayCopy[i] = array[i];
            //System.out.println("Testing arrayCopy " + arrayCopy[i]);
        }

    }
}
