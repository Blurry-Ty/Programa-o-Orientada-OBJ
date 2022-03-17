import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite duas palavras");
        int divisao = s.indexOf(" ");
        String primeiroNome;
        String segundoNome;
        primeiroNome = s.substring(0, divisao);
        segundoNome = s.substring(divisao);
        int primeiroNomecomp = primeiroNome.length();
        int segundoNomecomp = segundoNome.length() - 1;

        JOptionPane.showMessageDialog(null, String.format("A primeira palavra %s tem %d \n A segunda palavra %s tem %d", primeiroNome, primeiroNomecomp, segundoNome, segundoNomecomp));
    }
}
