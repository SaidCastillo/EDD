/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_copia_obj;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_7_COPIA_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.nombre = "Said Nunez";
        System.out.println(perso1.nombre);
        Persona copia;
        /*int x = 100;
        int copiaX;
        copiaX = x;
       
        copia = perso1;
        System.out.println(perso1);
        System.out.println(copia);
        copia.nombre = "Juanito Perez";
        System.out.println("perso1.nombre");*/
        
        copia = new Persona();
        copia.nombre = perso1.nombre;
        copia.nombre = "Juanito Perez";
        System.out.println(copia.nombre);
        System.out.println(perso1.nombre);
    }
    
}
class Persona{
    String nombre;
}