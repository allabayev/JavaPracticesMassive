package uz.massive;

import java.util.Arrays;

public class LiberySort {
    public static void main(String[] args) {
        int[] sonlar = {23, 46, -9, -64, 89, 99, -5};
        Arrays.sort(sonlar);
        for (int i = 0; i < sonlar.length; i++) {
            System.out.printf(" %d  \n", sonlar[i]);
        }
    }
}