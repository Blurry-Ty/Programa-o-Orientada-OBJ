import javax.swing.JOptionPane;


public class Ex03 {
    public static void main(String[] args) {
        double A, B, C;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        JOptionPane.showMessageDialog(null,( (A * 2) + (B * 3) + (C * 5) )/ 30);


    }
}