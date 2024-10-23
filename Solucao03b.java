/*A Proposta da Atividade é criar um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde a base e expoente são números reais*/
import javax.swing.JOptionPane;

public class Solucao03b{
 public static void main(String args[]){
  
     String snumero1 = JOptionPane.showInputDialog("Digite um número");
     
     double numeroElevado = Math.pow(Double.parseDouble(snumero1),2.5);
          
     JOptionPane.showMessageDialog(null,"O numero elevado ao quadrado é "+numeroElevado);
   }

}