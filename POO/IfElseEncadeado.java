import javax.swing.JOptionPane;

public class IfElseEncadeado{
    public static void main(String[] args) {
        double notaDoAluno;
        notaDoAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
        if (notaDoAluno >= 90){
            JOptionPane.showMessageDialog(null, "Parabens");
        }
        else if (notaDoAluno >= 80){
            JOptionPane.showMessageDialog(null, "ConceitoB");
        }
    }
}