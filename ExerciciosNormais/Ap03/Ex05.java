package Ap03;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        
        String[] Meses = {null,"Janeiro", "Fevereiro" , "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};
        String[] Dias = {null, "31", "28", "31", "30", "31","30", "31","30", "31","30", "31" };
        int A;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes desejado: "));

        JOptionPane.showMessageDialog(null, "O mes escolhido foi " + Meses[A] + "\nEle possui " + Dias[A] + " dias");

    }
}
