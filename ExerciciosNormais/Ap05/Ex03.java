package Ap05;

import javax.swing.JOptionPane;


public class Ex03 {
    public static void main(String[] args) {
        int z = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para calcular o fatorial: "));
        int a = 1;
        for (int i = 1; i <= z; i ++){
            a = a * i;
        }
        System.out.println(a);
        
    }
}
