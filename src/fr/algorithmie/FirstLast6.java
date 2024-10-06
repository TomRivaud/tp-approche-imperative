package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args){

        //Déclaration du tableau
        int[] array1 = {6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;

        //Calcul du boolean
        boolean myBool = false;
        int i, searchedNumber = 6;
        if(array1.length > 0){
            for (i=0; i<array1.length; i++){
                if(array1[0] == 6 || array1[array1.length-1] == 6){
                    myBool = true;
                }
                else myBool = false;
            }
        }
        else myBool = false;
        //System.out.println(myBool);
    }
}
