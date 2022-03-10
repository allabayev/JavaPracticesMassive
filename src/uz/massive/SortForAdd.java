package uz.massive;

import java.util.Scanner;

public class SortForAdd {
    public static void main(String[] args) {
        System.out.println("Massiv elementlarini kirit");
        Scanner in = new Scanner(System.in);
        int [] myMassive= new int[7];
        int sortr, t, f, l, i, j, k;
        for (f=0; f<myMassive.length; f++) {
            myMassive[f]=in.nextInt();
        }
        System.out.println("Massiv elementlari");
        for (t=0; t<myMassive.length; t++) {
            System.out.print(myMassive[t]+ ", ");
        }
        for (i=0; i<myMassive.length; i++) {
            for (j=i; j< myMassive.length; j++) {
                if (myMassive[j]<myMassive[i]) {
                    sortr=myMassive[j];
                    myMassive[j]=myMassive[i];
                    myMassive[i]=sortr;
                }
            }
        }
        System.out.println("\nMassiv elementlari usish tartibida");
        for (l=0; l<myMassive.length; l++) {
            System.out.print(myMassive[l]+ ", ");
        }
        for (i=0; i< myMassive.length; i++) {
            for (j=i; j< myMassive.length; j++) {
                if (myMassive[j]> myMassive[i]) {
                    sortr=myMassive[j];
                    myMassive[j]=myMassive[i];
                    myMassive[i]=sortr;
                }
            }
        }
        System.out.println("\nMassiv elementlari kamayish tartibida");
        for (k=0; k<myMassive.length; k++) {
            System.out.print(myMassive[k]+", ");
        }
    }
}