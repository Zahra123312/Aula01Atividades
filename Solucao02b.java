/* A proposta é criar um algoritmo para calcular a área de um retângulo, com base nas medidas de
sua base e de sua altura*/

import javax.swing.JOptionPane;

public class Solucao02b{
   public static void main(String args[]){
   
     String anosVividos = JOptionPane.showInputDialog("Quantos anos você tem?");
     
     int diasVividos = Integer.parseInt(anosVividos);
     
     diasVividos = diasVividos*365;
     
     JOptionPane.showMessageDialog(null,"Você viveu aproximadamente"+diasVividos);

   }

}
