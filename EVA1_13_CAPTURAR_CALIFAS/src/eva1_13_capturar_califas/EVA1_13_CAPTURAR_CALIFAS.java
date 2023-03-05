/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_capturar_califas;

import java.util.Scanner;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_13_CAPTURAR_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreCalifas[][][];
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos grupos existen?");
        int grupos = input.nextInt();
        arreCalifas = new int[grupos][][];
        System.out.println(arreCalifas);
        //--------------------------------
        for (int i = 0; i < arreCalifas.length; i++) {
        //por cada grupo cuantos alumno hay
        System.out.println("Cuantos alumnos tiene el grupo?" + i);
        int noAlumnos = input.nextInt();
        arreCalifas[i] = new int[noAlumnos][];
        //alumnos
        for (int j = 0; j < arreCalifas[i].length; j++) {
        System.out.println("Cuantos materias tiene el alumno?" + j);
        int noMaterias = input.nextInt();
           arreCalifas[i][j] = new int[noMaterias];
            for (int k = 0; k < arreCalifas[1][3].length; k++) {
                System.out.println(k + "Calificación de la materia?");
            int califa = input.nextInt();
            arreCalifas[i][j][k] = califa;
            }
            }
        for (int i = 0; i < arreCalifas.length; i++) {
                System.out.println("GRUPO"+ i);
                
        for (int j = 0; j < arreCalifas[i].length; j++) {
                 System.out.print("ESTUDIANTES" + j + ": ");
                 
        for (int k = 0; k < arreCalifas[i][j].length; k++) {
                    System.out.print("[" + arreCalifas [1][j][k] + ")");
                
                       }
                 System.out.println();
            }
        }
    } 
}
    }