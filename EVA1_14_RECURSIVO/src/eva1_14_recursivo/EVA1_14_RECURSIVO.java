/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_recursivo;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_14_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     *
     */
    public void recursivo(){
        System.out.println("Hola stackoverflow!!!");
       /* recursivo();
       for (int i = 10; i > 1; i--) {
            System.out.print(1 + " - ");} */
       falsoFor(10);
        System.out.println("");
            falsoForUp(1, 10);
    }
        /*public static void recursivo(){
        System.out.println("Hola Stackoverflow!!!"); 
            recursivo();//recursividad: el metodo se llama a si mismo 
     }*/
        public static void falsoFor(int valor){
        System.out.print(valor + "-");
        if(valor > 1)
            falsoFor(valor -1);
     } 
       public static void falsoForUp(int ini, int fin){
         System.out.print(ini + "-");
            if(ini < valor);
                falsoForUp(ini + ,valor);
     }
}