import javax.swing.JOptionPane;

public class Solucao10b{

   public static void main(String[] args){

   String frase1Original =  JOptionPane.showInputDialog("Inclua a primeira frase");
   String frase2Original =  JOptionPane.showInputDialog("Inclua a segunda frase");
   String frase3Original =  JOptionPane.showInputDialog("Inclua a terceira frase");

   if (frase1Original.length()%2 != 0){
       frase1Original = frase1Original + " " ;
   }
   if (frase2Original.length()%2 != 0){
           frase2Original = frase2Original + " " ;
   }
   if (frase3Original.length()%2 != 0){
           frase3Original = frase3Original + " " ;
   }

  String frase1PrimeiraParte = frase1Original.substring(0, frase1Original.length() / 2);
  String frase1 = frase1Original.substring(frase1Original.length() / 2);
   
  String frase2PrimeiraParte = frase2Original.substring(0, frase2Original.length() / 2);
  String frase02 = frase2Original.substring(frase2Original.length() / 2);
  
  String frase03PrimeiraParte = frase3Original.substring(0, frase3Original.length() / 2);
  String frase03 = frase3Original.substring(frase3Original.length() / 2);
   
JOptionPane.showMessageDialog(null,"As Frases originais: "+frase1Original +", "+frase2Original +", "+frase3Original+", As frases embaralhadas: "+frase2PrimeiraParte+ "" +frase03 +", "+frase02+ ""+frase1PrimeiraParte+", "+frase03PrimeiraParte +""+frase1);   
}

}