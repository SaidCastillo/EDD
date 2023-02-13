/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_valor_referencia;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_5_PASO_VALOR_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 10;
        System.out.println("Valor = " + valor);
        IncrePorValor(valor);
        System.out.println("Valor = " + valor);
        ////
        System.out.println("AHORA CON OBJETOS");
        MiValor objValor = new MiValor();
        System.out.println("Obj Valor = "+ objValor.otroValor);
        increPorRefe(objValor);
        System.out.println("Obj valor = " + objValor.otroValor);
    }
    public static void IncrePorValor(int ValorIncre){
        ValorIncre++;
    }
    public static void IncrePorRefe(MiValor miVal){
      miVal.otroValor++;
    }

    private static void increPorRefe(MiValor objValor) {
    }
}


class MiValor{
 int otroValor = 10;
 
}