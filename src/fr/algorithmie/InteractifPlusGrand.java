package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args){

        System.out.println("Entrez un nombre : ");
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        int iWhile = 0;
        while (iWhile < 10){
            System.out.println("Entrez un autre nombre : ");
            int nb = scanner.nextInt();
            array[iWhile] = nb;
            iWhile++;
        }

        int iFor;
        int result = array[0];
        for(iFor=0; iFor<array.length; iFor++)
        {
            System.out.println(array[iFor]);
            if(result < array[iFor]){
                result = array[iFor];
            }
        }
        System.out.println(result);
    }
}
