/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_arreglos2;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_9_Arreglos2 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE ENTEROS 
        
        // ARREGLOS DE ENTEROS
        
        int arregloDatos[] = new int[50000000];
        long ini = System.nanoTime();
        long fin = System.nanoTime();
        System.out.println("Tiempo: " + (fin - ini));
        // método para llenar de valores aleatorio
        //método para imprimirlo
        imprimirArreglo(arregloDatos);
    }
    public static void llenarArreglo(int[] arreglo){
                for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        
   }
    }
   public static void imprimirArreglo(int[] arreglo){
       for (int i = 0; i < arreglo.length; i++) {
           System.out.print("[" + arreglo[i] + "]");
        }
       System.out.println("");
   }
}