import javax.swing.JOptionPane;

public class OperadorTernario2 {
    public static void main(String[] args) {
        int nota = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a nota: ")
        );
        String conceito;
        conceito = nota == 10 ? "A" : nota == 9 ? "A" : nota == 8 ? "B" : "R";
        JOptionPane.showMessageDialog(null, conceito);
    }
}
