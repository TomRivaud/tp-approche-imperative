package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants. ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        int[] array = new int[1];

        while (option != 1 && option != 2) {
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants. ");
            option = scanner.nextInt();
        }

        if (option == 1){
            System.out.println("Entrez le nombre à ajouter au tableau : ");
            int nbToAdd = scanner.nextInt();
            int[] newArray = new int[array.length+1];
            int iNewArray;
            for (iNewArray = 0; iNewArray < array.length; iNewArray++){
                newArray[iNewArray] = array[iNewArray];
            }
            newArray[newArray.length-1] = nbToAdd;

            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants. ");
            option = scanner.nextInt();
        }



        if (option == 2){
            int iShowArray;
            //for (iShowArray=0; iShowArray<newArray.length)
        }

        //https://codegym.cc/groups/posts/add-new-element-to-array

    }
}
