package Ap03;

import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        int A;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        if((A % 4 == 0 && A % 100 != 0) || A % 400 == 0){
            JOptionPane.showMessageDialog(null, "O ano é bissexto");
        }
        else{
            JOptionPane.showMessageDialog(null, "O ano nao é bissexto");
        }

    }
}
