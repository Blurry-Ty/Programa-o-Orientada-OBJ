import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite a string: ");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        char o = s.charAt(a);
        char p = s.charAt(b);
        s = s.substring(s.indexOf(o));
        s = s.substring(0, s.indexOf(p)+1);

        JOptionPane.showMessageDialog(null, String.format("Teste %s ", s));

    }
}
