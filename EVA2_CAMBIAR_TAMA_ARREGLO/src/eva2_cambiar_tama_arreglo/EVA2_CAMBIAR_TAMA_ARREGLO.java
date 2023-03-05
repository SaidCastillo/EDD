/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_cambiar_tama_arreglo;

/**
 *
 * @author Said Nuñez
 */
public class EVA2_CAMBIAR_TAMA_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //REGLA DE CLASE:
        //no se puede usar las utilerias del lenguaje, a menos que exusa  autorizacion previa
        //todo se tiene que hacer de manera propia
        int[] arreglo = new int[3];
        
        arreglo[0] = 100;
        arreglo[1] = 300;
        arreglo[2] = 300;
        //EXAMINAR EL ARREGLO A TAMAÑO 10 SIN PERDER LOS DATOS
       int[] copia = cambiarTama(arreglo, 10);
       for(int valor: copia){
           System.out.print("["+ valor + "]");

       }
    }
    public static int[] cambiarTama(int[]arreglo, int tama){
            int[] copia = new int[tama];
                for (int i = 0; i < copia.length; i++) {
                    if(i >= arreglo.length) {
                } else {
                        copia[i] = arreglo[i];
                }
        }
        return copia;
        }
}