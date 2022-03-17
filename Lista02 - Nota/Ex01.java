import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int divisao = nome.indexOf(" ");
        String primeiroNome;
        String segundoNome;
        primeiroNome = nome.substring(0, divisao);
        segundoNome = nome.substring(divisao);

        String formatada = String.format("Ola, %s. Seu sobrenome e %s!", primeiroNome, segundoNome);

        JOptionPane.showMessageDialog(null, formatada);

    }
}
