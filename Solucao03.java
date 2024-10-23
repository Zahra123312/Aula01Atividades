/*A Proposta é criar um algoritmo que leia 3 números que representem uma data,
respectivamente dia, mês e ano e depois imprima a data usando esse formato
dia/mês/ano*/
import javax.swing.JOptionPane;

public class Solucao03{
public static void main(String args[]){

String dia = JOptionPane.showInputDialog("Digite um dia");

String mes = JOptionPane.showInputDialog("Digite um mes");

String ano = JOptionPane.showInputDialog("Digite um ano");

 JOptionPane.showMessageDialog(null,"A data digitada é: "+dia+"/"+mes+"/"+ano);

  }

}
