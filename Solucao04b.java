/*A Proposta da atividade é criar um algoritmo que leia três Strings por meio do JOptionPane e escreva a somado comprimento dessas Strings*/
import javax.swing.JOptionPane;

public class Solucao04b{
   public static void main(String args[]){
     String palavra1 = JOptionPane.showInputDialog("Escreva uma palavra");
     
     String palavra2 = JOptionPane.showInputDialog("Escreva outra palavra");
          
     String palavra3 = JOptionPane.showInputDialog("Escreva mas outra palavra");
      
      int somaPalavras = palavra1.length() + palavra2.length() +palavra3.length();
     
     JOptionPane.showMessageDialog(null," A soma dasssas palavras é "+somaPalavras);
   }

}