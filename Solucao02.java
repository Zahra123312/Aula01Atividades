/*A Proposta do exercicio é criar um algoritmo que leia um número inteiro, o armazene em uma variável do
tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor do número*/
import javax.swing.JOptionPane; 

public class Solucao02{

public static void main(String args[]){

int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

 JOptionPane.showMessageDialog(null," O valor do número digitado é: "+numero1);

}

}