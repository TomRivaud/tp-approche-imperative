package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args){

        //Déclaration du tableau
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        //Nombre de similarité
        int nbOfSimiliraties = 0;
        int i1;
        int i2;
        for (i1=0; i1<array1.length; i1++){
            for (i2=0; i2<array2.length;i2++){
                if(array1[i1] == array2[i2]){
                    nbOfSimiliraties++;
                }
            }
        }
        System.out.println("Nombre de similarité entre les 2 tableaux : " + nbOfSimiliraties);
    }
}
