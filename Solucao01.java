/*A Proposta do exercicio é criar um algoritmo que leia três palavras, separadamente e as apresente
na ordem contrária em que foram digitadas, separadas por espaço*/
import javax.swing.JOptionPane;

public class Solucao01{
public static void main(String args[]){

String palavra1 = JOptionPane.showInputDialog("digite uma palavra");

String palavra2 = JOptionPane.showInputDialog("digite outra palavra");

String palavra3 = JOptionPane.showInputDialog("digite outra palavra");

 JOptionPane.showMessageDialog(null," a ordem contária é: "+palavra3+" "+palavra2+" "+palavra1);


}

}
