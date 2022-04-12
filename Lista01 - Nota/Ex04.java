import javax.swing.JOptionPane;
public class Ex04{
        public static void main (String... args){
    
            //declaração de variáveis    
            double A;
            double B;
            double Soma;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        Soma = A + B;
        JOptionPane.showMessageDialog(null,"Soma = " + Soma);
}
}

