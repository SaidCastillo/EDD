/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_nodos;

/**
 *
 * @author Said Nuñez
 */
public class EVA2_3_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo = new Nodo();
        nodo.valor = 100;
        nodo.sig.valor = 200;
        nodo.sig.sig = new Nodo();
        nodo.sig.sig.valor = 300;
        System.out.print("(" + nodo.valor + ")");
        System.out.print("(" + nodo.sig.valor + ")");
        System.out.print("(" + nodo.sig.sig.valor + ")");
        Nodo temp = nodo;
        while(temp != null){
            System.out.print("(" + temp.valor +")");
            temp = temp.sig;
            
        }
         
    }
}
    
class Nodo{
    public int valor;
    public Nodo sig;
    
    public Nodo(){
        sig = null;
    }
    
}