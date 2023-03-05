/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_numeros_primos;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_18_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini = System.nanoTime();
        System.out.println("101:" + calcularEsPrimoInef(100));
        long fin = System.nanoTime();
        System.out.println("101:" + calcularEsPrimoEf(100));
        System.out.println("101:" + calcularEsPrimoInef(100));
        
    }
                public static boolean calcularEsPrimoInef(int nume){
                     boolean resu = false;
                    for (int i = 2; i < nume; i++) {
                        int resi = nume % i;
                        if(resi == 0){
                            resu = false; //no es primo
                            break;
                
                        }
                        
        public static boolean calcularEsPrimoEf(int nume){
             boolean resu = true;
                    int fin = (int)Math.sqrt(nume);
                        for (int i = 2; i < fin; i++) {
                            int resi = nume % i;
                            if(resi == 0){
                                resu = false; //no es primo
                                 break;
                            }
                        }
            }
}

    
