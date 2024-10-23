/*A poposta é criar um algoritmo para calcular a área de um círculo com base no seu raio
(Área = PI * raio * raio, onde PI = 3.14159), usando variáveis reais*/
import javax.swing.*;

public class Solucao14b {

   public static void main(String[] args){
           double raio = Double.parseDouble(JOptionPane.showInputDialog("Inclua o raio do círculo"));

           double pi = 3.14159;

           double area = pi * raio * raio;

           JOptionPane.showMessageDialog(null, "A área do círculo vai ser  " + area);
}
}