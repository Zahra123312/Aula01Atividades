  /*
  Proposta do exercicio é criar um algoritmo para calcular o número de dias aproximado que você viveu,
  com base em sua idade;
  */
import javax.swing.JOptionPane;
public class Solucao01b{
     public static void main(String args[]){
     
     String speso = JOptionPane.showInputDialog("Digite o seu peso em quilogramas");
     String saltura = JOptionPane.showInputDialog("Digite a sua altura em metros");
     
     double peso =Double.parseDouble(speso); 
     
     double altura = Double.parseDouble(saltura); 
     
     double imc = peso / (altura*altura);
     
     JOptionPane.showMessageDialog(null,"imc ="+imc);
        
     }
     
  }