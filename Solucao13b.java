/* A Proposta do exercicio é ciar um algoritmo que leia três números reais (a, b ,c), calcular e escrever o
resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5*/
import javax.swing.JOptionPane;
public class Solucao13b{
   public static void main(String args[]){

     double  a  = Double.parseDouble( JOptionPane.showInputDialog("Inclua uma numero"));
     double  b  = Double.parseDouble( JOptionPane.showInputDialog("Inclua uma numero"));
     double  c  = Double.parseDouble( JOptionPane.showInputDialog("Inclua uma numero"));
     
     double expressao =  2 * ( ( a - c ) / 8 ) - b * 5;
      
  
   JOptionPane.showMessageDialog(null," O resualtado vai ser "+expressao);
}
}
