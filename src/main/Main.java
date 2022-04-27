package main;

public class Main {

    public static void main(String[] args) {

        int [] niz1 = {1, 2, 3};
        int [] niz2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.format("");
        for (int i = 1; i <= niz1.length; i++){
        }
        System.out.println();
        System.out.println("   ");
        for (int i = 1; i <= niz1.length; i++){
            System.out.format("%4d |", i);
            for (int j = 1; j <= niz2.length; j++) {
                System.out.format("%4d", j * i);
            }
            System.out.println();
        }







    }

}
