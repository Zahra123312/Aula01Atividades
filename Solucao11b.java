/*A proposta da atividade é iniciar com uma data em uma variável do tipo inteiro no formato ddmmaa e
imprimir dia, mês e ano separadamente*/
import javax.swing.JOptionPane;

public class Solucao11b{

   public static void main(String args[]){

   int data = Integer.parseInt(JOptionPane.showInputDialog("Inclua uma data nesse fomato ddmmaa"));
   String dataFormatada =""+ data;
   String dia = dataFormatada.substring(0,2); 
   String mes = dataFormatada.substring(2,4);   
   String ano = dataFormatada.substring(4,6);   
  
   JOptionPane.showMessageDialog(null," dia "+dia+" mes "+mes+" ano "+ano);
}
}
