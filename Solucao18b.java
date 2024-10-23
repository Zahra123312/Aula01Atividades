/* A proposta é criar um algoritmo que  vai calcular e imprimir a área de um losango*/
import javax.swing.*;

public class Solucao18b {
    public static void main(String[] args) {

        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal maior do losango"));
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite a diagonal menor do losango"));

        double area = diagonalMaior * diagonalMenor / 2 ;

        JOptionPane.showMessageDialog(null, " A área do losangulo vai ser " + area);
    }
}
