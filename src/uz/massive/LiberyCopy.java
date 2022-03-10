package uz.massive;

import java.util.Arrays;

public class LiberyCopy {
    public static void main(String[] args) {
        int [] google = {10, 3, 6, 7 ,8 ,9};
        google[2]=25;
        int [] sonlar = Arrays.copyOf(google, google.length);
        for (int t=0; t< sonlar.length; t++) {
            System.out.print(" "+sonlar[t]+" ");
        }
    }
}