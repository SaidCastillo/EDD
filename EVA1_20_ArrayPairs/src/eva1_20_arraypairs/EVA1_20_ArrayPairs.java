/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_arraypairs;

import java.util.Arrays;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_20_ArrayPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int[] arreglo = new int[20];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int)(Math.random() * 100);
            
        }
            for (int i : arreglo) {
                System.out.print("[" + i +"]");
        }
        //    
        String[] arreCade = new String[20];
        for (String string : arreCade) {
        }
        
       orderedPair(arreglo);
    }
        public static void orderedPair(int[]ArrayOfItems){
            for (int fristItem : ArrayOfItems) {
                for (int secondItem : ArrayOfItems) {
                     int[] arreglo = new int[]{fristItem, secondItem};
                    System.out.println(Arrays.toString(arreglo));
            }
                
    }
        }
    
}
