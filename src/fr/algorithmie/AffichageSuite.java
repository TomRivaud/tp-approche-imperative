package fr.algorithmie;

public class AffichageSuite {
    public static void main (String[] args){

        //FOR - Affichage de 1 à 10 inclus
        System.out.println("FOR - Affichage de 1 à 10 inclus");
        int oneToTen;
        for (oneToTen=1; oneToTen<=10; oneToTen++){
            System.out.println(oneToTen);
        }

        //FOR - Affichage des nombres pairs entre 0 et 10 inclus
        System.out.println("FOR - Affichage des nombres pairs de 1 à 10 inclus");
        for (oneToTen=0; oneToTen<=10; oneToTen++){
            if (oneToTen % 2 ==0){
                System.out.println(oneToTen);
            }
        }

        //FOR - Affichage des nombres impairs entre 0 et 10 inclus
        System.out.println("FOR - Affichage des nombres impairs de 0 à 9 inclus");
        for (oneToTen=0; oneToTen<=10; oneToTen++){
            if (oneToTen % 2 !=0){
                System.out.println(oneToTen);
            }
        }

        //WHILE - Affichage de 1 à 10 inclus
        System.out.println("WHILE - Affichage de 1 à 10 inclus");
        oneToTen = 1;
        while (oneToTen <= 10){
            System.out.println(oneToTen);
            oneToTen++;
        }

        //WHILE - Affichage des nombres pairs entre 0 et 10 inclus
        System.out.println("WHILE - Affichage des nombres pairs entre 0 et 10 inclus");
        oneToTen = 0;
        while (oneToTen <= 10){
            if(oneToTen % 2 == 0){
                System.out.println(oneToTen);
            }
            oneToTen++;
        }

        //WHILE - Affichage des nombres impairs entre 1 et 9 inclus
        System.out.println("WHILE - Affichage des nombres impairs entre 1 et 9 inclus");
        oneToTen = 0;
        while (oneToTen < 10){
            if(oneToTen % 2 != 0){
                System.out.println(oneToTen);
            }
            oneToTen++;
        }
    }


}
