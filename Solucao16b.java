/*
16) Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada;
*/
import javax.swing.*;
public class Solucao16b {

   public static void main(String[] args){

      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digitar um numero para o calculo"));
      double raizQuadrada = Math.sqrt(numero);
      double elevadoQuadrado = Math.pow(numero, 2);

           JOptionPane.showMessageDialog(null, "A raiz quadrada vai ser " + raizQuadrada + " O numero elevado ao quadrado vai ser" + elevadoQuadrado);
}
}
