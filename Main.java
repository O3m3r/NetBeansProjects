package sorter;

import java.util.Random;

/**
 *
 * @author Oemer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
            // lokale Variablen vereinbaren
            Random rg = new Random();
            int[] arr = new int[100];
            
            //Zufallszahlen Array erzeugen
            for(int i=0; i<arr.length; i++) {
                  arr[i]= rg.nextInt(100);
    }
            
            // Array unsortiert ausgeben
            for(int z=0; z<arr.length; z++) {
                if(z%10==0) System.out.println();
                System.out.print(arr [z] +" ");
            }
            // Array sortieren
            bubbelSort (arr);
            System.out.println("\n\nArray sortiert: ");
            // Array sorteiert ausgeben 
                for(int z=0; z<arr.length; z++) {
                if(z%10==0) System.out.println();
                System.out.print(arr [z]+ " ");
    }
    }
    
    public static void bubbelSort(int[] zahlen) {
            boolean vertauscht;      //  Variable nur deklariert
            int n,i;                           // Varaiblen n und i NUR deklariert
            n = zahlen.length;        // Lengeneigenschaft des Arrays abfragen 
            
            do {
                vertauscht = false;      // zeigt an, das NICHT sortiert wurde
                for (i=0; i<n-1; i++) {
                           if(zahlen[i]>zahlen[i+1]) {
                               // Vertauscht-Algorithmus
                              int x;
                              x = zahlen[i];
                              zahlen[i] = zahlen [i+1];
                              vertauscht = true;            // anzeigen das sortiert wurde
                           }
                }
                n = n-1;
            } while ((n>1)&&  vertauscht );
    }      
}
