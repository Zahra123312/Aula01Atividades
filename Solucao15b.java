/* A proposta é ler 2 números inteiros e imprimir dividendo, divisor, quociente e o resto*/

import javax.swing.*;

public class Solucao15b {

   public static void main(String[] args){
           int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero para divisão"));
           int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero para divisão"));

            int divisao = numero01/numero02;

           JOptionPane.showMessageDialog(null, "O dividendo vai ser  " + numero01 + " O divisor vai ser " + numero02 + " O quociente é " + divisao + " O resto vai ser " + (numero01%numero02));
}
}