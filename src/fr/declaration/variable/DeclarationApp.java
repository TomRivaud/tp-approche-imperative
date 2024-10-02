package fr.declaration.variable;

public class DeclarationApp {

    public static void main (String[] args){
        byte myByte = 0;
        short myShort = 1011;
        int myInt = 32;
        long myLong = 1546L;
        float myFloat = 2.4f;
        double myDouble = 254.64D;
        char myChar = 'B';
        boolean myBoolean = true;
        String myString = "Coucou le monde";
        String randomString = "Voici le résultat d'un calcul : \n1+5=6";

        System.out.println("Mon double " + myDouble + " et mon string " + myString);

        System.out.println(randomString);
    }
}
