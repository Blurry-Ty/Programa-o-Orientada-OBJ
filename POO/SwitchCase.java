import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] x) {

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Parabens\n" + "Conceito A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito C");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Conceito D");
                break;
            default:
                JOptionPane.showMessageDialog(null, "R");
        }

        JOptionPane.showMessageDialog(null, "Ate mais!");
    }
}