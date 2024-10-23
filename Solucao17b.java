/*A proposta é  criar um algoritmo que vai calcular e imprimir a área de um triângulo*/
import javax.swing.*;

public class Solucao17b {
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo"));
        double area = base * altura;

        JOptionPane.showMessageDialog(null, " A área do triangulo é: " + area);
    }
}
