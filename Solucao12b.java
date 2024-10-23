/*
12) Entre com uma data em uma variável do tipo String no formato dd/mm/aa e
imprimir dia, mês e ano separados.
*/
import javax.swing.JOptionPane;

public class Solucao12b{

   public static void main(String[] args){

   String data = JOptionPane.showInputDialog("Inclua uma data nesse fomato de dd/mm/aa");
   String dataFormato =""+ data;
   String dia = dataFormato.substring(0,2); 
   String mes = dataFormato.substring(3,5);   
   String ano = dataFormato.substring(6,8);   

   JOptionPane.showMessageDialog(null," dia "+dia+" mes "+mes+" ano "+ano);
}
}
