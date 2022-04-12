package Ap03;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        int A;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        String[] Semana = {null, "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
        
        if (0 < A && A < 8 ){
        JOptionPane.showMessageDialog(null, Semana[A]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor escolha um numero de 1 a 7");
        }

        // switch (A) {
        //     case 1:
        //         JOptionPane.showMessageDialog(null, "Domingo");
        //         break;
        //     case 2:
        //         JOptionPane.showMessageDialog(null, "Segunda");
        //         break;
        //     case 3:
        //         JOptionPane.showMessageDialog(null, "Terca");
        //         break;
        //     case 4:
        //         JOptionPane.showMessageDialog(null, "Quarta");
        //         break;
        //     case 5:
        //         JOptionPane.showMessageDialog(null, "Quinta");
        //         break;
        //     case 6:
        //         JOptionPane.showMessageDialog(null, "Sexta");
        //         break;
        //     case 7:
        //         JOptionPane.showMessageDialog(null, "Sabado");
        //     default:
        //         JOptionPane.showMessageDialog(null, "Valor invalido");
        // }
    }
}
