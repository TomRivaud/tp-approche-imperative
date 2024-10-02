package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main (String[] args){
        int[] myIntArray = new int[]{8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[myIntArray.length -1]);
        //System.out.println(myIntArray[10]);
        //La ligne précédente résulte sur une erreur car le tableau va de l'index 0 à 7, l'index 10 n'existe pas
    }
}
