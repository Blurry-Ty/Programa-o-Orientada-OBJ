package Ap03;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        int A,B,C; 
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        int res;
        res = (B*B) - 4 * A * C;
        if (res == 0) {
            JOptionPane.showMessageDialog(null, "Possui uma Raiz");

        } 
        else if (res >= 1){
            JOptionPane.showMessageDialog(null, "Possui duas Raiz");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nao possui Raiz");
        }
    }
}
