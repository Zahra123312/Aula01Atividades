/*A Proposta do exercicio é iniciar com um número e a base em que se deseja calcular o logaritmo do
número, calcular tal logaritmo e imprimir esse resultado proposto*/
import javax.swing.JOptionPane;

public class Solucao9b{

   public static void main(String args[]){

   String numero =  JOptionPane.showInputDialog("Inclua um numero");
   String base =  JOptionPane.showInputDialog("Inclua a base");
   
   double log = Double.parseDouble(numero) / Double.parseDouble(base);

   JOptionPane.showMessageDialog(null," O log vai ser "+log);   
}

}
