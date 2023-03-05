/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_tiempo;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_21_TIEMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[1000];
        // O(N) = 
        long ini = System.nanoTime();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
                    }
        long fin = System.nanoTime();
        System.out.println("Tiempo: " + (fin -ini));
    

        // O(N)2 = 
        ini = System.nanoTime();
          for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < 10; j++) {
                arreglo[i] = (int)(Math.random() * 100);
            }

}
           fin = System.nanoTime();
            System.out.println("Tiempo: " + (fin -ini));
}
}


