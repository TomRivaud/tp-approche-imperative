package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main (String[] args){
        String[] myStringArray = new String[]{"La Rochelle", "Puilboreau", "Nice","Montpellier", "Bordeaux"};

        System.out.println(myStringArray[0] + ", " + myStringArray[1] + ", " + myStringArray[2] + ", " + myStringArray[3] + ", " + myStringArray[4]);
        System.out.println(myStringArray.length);

        myStringArray[3] = "Reims";
        System.out.println(myStringArray[0] + ", " + myStringArray[1] + ", " + myStringArray[2] + ", " + myStringArray[3] + ", " + myStringArray[4]);
    }
}
