package Ap03;
import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        int A,B,C; 
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        if (A > B && A > C){
            JOptionPane.showMessageDialog(null, "O Maior valor é " + A);
        }
        else if (B > C && B > A){
            JOptionPane.showMessageDialog(null, "O Maior valor é " + B);
        }
        else if (C > A && C > B){
            JOptionPane.showMessageDialog(null, "O Maior valor é " + C);
        }
    }
}
