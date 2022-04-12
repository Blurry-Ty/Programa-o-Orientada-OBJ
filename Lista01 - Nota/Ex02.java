import javax.swing.JOptionPane;
public class Ex02{
    public static void main (String... args){

        //declaração de variáveis
        double raio;
        double AreaCirculo;
        double pi;

        //double é uma classe empacotadora (wrapper) referente ao primitivo double
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo"));
        pi = 3.14;
        AreaCirculo = pi*raio*raio;
        JOptionPane.showMessageDialog(null,"A area do circulo " + AreaCirculo);
}
}
