/*O Exercicios pede que leia 4 números inteiros, representando milhar, centena, dezena e unidade, usando o
tipo caractere para garantir que não seja digitado mais de um número por vez e depois concatenar esses caracteres armazenando-os em uma String e depois imprimir o resultado.*/

import javax.swing.JOptionPane;

public class Solucao06{

public static void main(String[] args){

 String snumero1 = JOptionPane.showInputDialog("Digite um número representando milhar");
 String snumero2 = JOptionPane.showInputDialog("Digite um número representando centena");
 String snumero3 = JOptionPane.showInputDialog("Digite um número representando dezena");
 String snumero4 = JOptionPane.showInputDialog("Digite um número representando unidade");

 char milhar = snumero1.charAt(0);
 char centena = snumero2.charAt(0);
 char dezena = snumero3.charAt(0);
 char unidade = snumero4.charAt(0);

 String resultado = "" + milhar + centena + dezena + unidade;

 JOptionPane.showMessageDialog(null, "O número vai ser: " + resultado);
}

}
