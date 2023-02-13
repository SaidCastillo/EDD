/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_matrices;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_10_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // filas x columnas
        int[][] matrizDatos = new int[3][4];
        //LLENAR CON  NÚMEROS ALEATORIOS
        //primer ciclo es la primer dimensión (Filas)
           
        for (int i = 0; i < matrizDatos.length; i++){
            for (int j = 0; j <matrizDatos[1].length; j++)
            matrizDatos[i][j] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < matrizDatos.length; i++){
            for (int j = 0; j <matrizDatos[1].length; j++)
                 System.out.print("[" + matrizDatos[i][j] + "]");
            System.out.println("");
        }
        
    }        
    
}

