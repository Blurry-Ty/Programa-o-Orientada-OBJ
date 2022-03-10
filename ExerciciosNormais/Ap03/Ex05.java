package Ap03;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        
        //Cria lista com os meses e suas durações
        String[] Meses = {null,"Janeiro", "Fevereiro" , "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};
        String[] Dias = {null, "31", "28", "31", "30", "31","30", "31","30", "31","30", "31" };
        //PS: O null no inicio é por que as listas  começam no zero e não no 1
        
        
        //Define o input
        int A;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes desejado: "));
        
        // Mostra o mes e sua duracao pega o numero que pessoa escolheu e mostra o item da lista correspondente a esse numero
        JOptionPane.showMessageDialog(null, "O mes escolhido foi " + Meses[A] + "\nEle possui " + Dias[A] + " dias");

    }
}
