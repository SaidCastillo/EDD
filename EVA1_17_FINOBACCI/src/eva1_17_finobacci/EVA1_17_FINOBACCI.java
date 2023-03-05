/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_finobacci;

/**
 *
 * @author Said Nuñez
 */
public class EVA1_17_FINOBACCI {
    
    class Main {
    public static void main(String[] args) {

        int n = 9, firstTerm = 0, secondTerm = 1;
        System.out.println("Valor " + n + " Pos:");

        for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
} 