package Ap03;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        int num = Integer.parseInt( JOptionPane.showInputDialog("Digite um numero inteiro: "));
        if (num >= 1){
            JOptionPane.showMessageDialog(null, "Positivo");
        }
        else if (num <= -1){
            JOptionPane.showMessageDialog(null, "Negativo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Neutro");
        }
    }
}
