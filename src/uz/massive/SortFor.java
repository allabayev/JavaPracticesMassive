package uz.massive;

public class SortFor {
    public static void main(String[] args) {
        System.out.println("Massiv elementlari");
        int [] masElem={1, 100, -90, -56, 24, -36, -54, 36};
        for (int i=0; i<masElem.length; i++) {
            System.out.print(masElem[i] + ", ");
        }
        System.out.println("\n________________________________________________");
        int sortr;
        System.out.println("\nUsish tartibida taxlash");
        for (int q = 0; q < masElem.length; q++) {
            for (int w=q; w < masElem.length; w++) {
                if (masElem[q] > masElem[w]) {
                    sortr=masElem[q];
                    masElem[q]=masElem[w];
                    masElem[w]=sortr;
                }
            }
        }
        for (int e=0; e< masElem.length; e++) {
            System.out.print(masElem[e]+ ", ");
        }
        System.out.println("\n________________________________________________");
        System.out.println("\nKamayish tartibida taxlash");
        for (int a=0; a<masElem.length; a++) {
            for (int s=0; s< masElem.length; s++) {
                if (masElem[s]<masElem[a]) {
                    sortr=masElem[s];
                    masElem[s]=masElem[a];
                    masElem[a]=sortr;
                }
            }
        }
        for (int d=0; d< masElem.length; d++) {
            System.out.print(masElem[d]+ ", ");
        }
    }
}
