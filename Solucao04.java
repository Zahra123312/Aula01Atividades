/*  A Proposta do exercicios é solicitar ao usuário que digite seu peso no formato real e depois imprimir “O peso
informado foi “ + peso + “ kg.”*/
import javax.swing.JOptionPane;

public class Solucao04{
public static void main(String args[]){

double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));

 JOptionPane.showMessageDialog(null,"O peso informado foi "+peso+" kg");

}

}