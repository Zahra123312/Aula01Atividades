/*A proposta da atividade é inicir com um número e imprimir o logaritmo desse número na base 10*/
import javax.swing.JOptionPane;
public class Solucao8b{
 public static void main(String args[]){

   String numero1 =  JOptionPane.showInputDialog("Inclua um numero");
     
   double numeroBase10 = Math.log(Double.parseDouble(numero1));
   
   JOptionPane.showMessageDialog(null,"numero "+numero1+" na base 10 é "+numeroBase10);   
   }

}
