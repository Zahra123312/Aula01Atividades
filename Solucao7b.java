/* A Proposta do exercicio é iniciar com um angulo em graus e depois imprimir: o seno, cosseno, tangente, secante cossecante, cotangente */

import javax.swing.JOptionPane;

public class Solucao7b{
  public static void main(String args[]){

  String angulo =  JOptionPane.showInputDialog("Inclua um angulo em graus");
  double seno = Math.sin(Double.parseDouble(angulo));
  double cosseno = Math.cos(Double.parseDouble(angulo));
  double tangente = Math.tan(Double.parseDouble(angulo));
  double secante = 1.0 /Math.cos(Double.parseDouble(angulo));
  double cossecante = 1.0 / Math.sin(Double.parseDouble(angulo));
  double cotangente = 1.0 / Math.tan(Double.parseDouble(angulo));

  JOptionPane.showMessageDialog(null,"o  seno, cosseno, tangente, secante,cossecante e cotangente do angulo "+angulo+" É respectivamente: seno: "+seno+" cosseno: "+cosseno+" tangente: "+tangente+" secante: "+secante+" cossecante: "+cossecante+" cotangente: "+cotangente);   
}

}