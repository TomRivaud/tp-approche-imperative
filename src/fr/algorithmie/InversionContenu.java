package fr.algorithmie;

public class InversionContenu {
    public static void main (String[] args){

        //Déclaration du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //Création de la copie de array
        int iArray;
        int iArrayCopy = array.length-1;
        System.out.println("Copie de array dans arrayCopy - ordre inversé");
        int[] arrayCopy = new int[array.length];
        for (iArray=0; iArray< array.length; iArray++){
            arrayCopy[iArrayCopy] = array[iArrayCopy];
            System.out.println("array value : " + array[iArray] + " | arrayCopy value : " + arrayCopy[iArrayCopy]);
            iArrayCopy--;
        }
    }
}
