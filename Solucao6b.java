/* O exercicios pede para iniciar com um número inteiro de 3 casas decimais e depois imprimir o algarismo da casa
das dezenas*/
import javax.swing.JOptionPane;

public class Solucao6b{
   public static void main(String args[]){

   String numeroDecimal =  JOptionPane.showInputDialog(" Incluir inteiro de 3 casas decimais");
     
   String numeroCorte = numeroDecimal.substring(numeroDecimal.length() - 3 ); 
   
   JOptionPane.showMessageDialog(null," O numero que foi cortado é "+numeroCorte);
   
   }

}
