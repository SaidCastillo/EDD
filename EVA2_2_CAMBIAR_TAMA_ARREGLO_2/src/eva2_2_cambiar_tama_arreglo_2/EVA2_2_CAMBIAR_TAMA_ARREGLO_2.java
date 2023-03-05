/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_cambiar_tama_arreglo_2;


/**
 *
 * @author Said Nuñez
 */
public class EVA2_2_CAMBIAR_TAMA_ARREGLO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int[] arreglo = new int[1];
            //este for simula los clientes;
            //cada ciclo es un ciente nuevo
            //cada ciclo incrementa el tamaño del arreglo en 1
            for(int i = 1; i < 100;i++){
                int[] copia = cambiarTama(arreglo, i);
                //guardar el cliente 
                copia[i - 1] = (int)(Math.random() * 100);
                arreglo = copia;
            }
        
    }
    public static int[] cambiarTama(int[]arreglo, int tama){
            int[] copia = new int[tama];
              for (int i = 0; i < copia.length; i++) {
                  if(i < arreglo.length)
                    copia[i] = arreglo[i];
        }
        return copia;
        }
       }
   
