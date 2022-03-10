package Ap03;

import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        
        // Defininindo o Input dos anos
        int A;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        
        // O simbolo && significa "and" e o || signifinca "or"
        // Ou seja se A for divisivel por 4, mas nao por 100 ele eh bissexto ou se A for divisel por 400 ele eh bissexto
        if((A % 4 == 0 && A % 100 != 0) || A % 400 == 0){
            JOptionPane.showMessageDialog(null, "O ano é bissexto");
        }
        else{
            JOptionPane.showMessageDialog(null, "O ano nao é bissexto");
        }

    }
}
