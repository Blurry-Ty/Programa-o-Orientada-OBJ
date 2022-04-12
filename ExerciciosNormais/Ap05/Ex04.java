package Ap05;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para verificar se eh primo: "));
        
        if (ehPrimo(z)){
            JOptionPane.showMessageDialog(null, "eh primo");
        }
        else{
            JOptionPane.showMessageDialog(null, "n primo");
        }
    }
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
