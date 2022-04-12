import javax.swing.JOptionPane;

public class IfSimples{
    public static void main (String... args) {

        double nota_do_aluno;
        nota_do_aluno = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        if (nota_do_aluno >=70){
            JOptionPane.showMessageDialog(null, "Parabens voce foi aprovado com a nota de " + nota_do_aluno + " pontos");
        }
        else{
            JOptionPane.showMessageDialog(null, "Infelizmente voce foi reprovado com " + nota_do_aluno + " pontos");
        }
    }
}