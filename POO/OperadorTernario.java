import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        
        //String podeDirigir;
        
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a sua idade, vejamos se voce pode dirigir ")
        );

        // Operador Ternario (Equivalente ao "if/else" do python)
        
        // podeDirigir = idade >= 18 ? "Pode Dirigir" : "Nao pode dirigir";
        // JOptionPane.showMessageDialog(null, podeDirigir);
        
        JOptionPane.showMessageDialog(null, idade >= 18 ? "Pode Dirigir" : "Nao pode dirigir");
        
    }
}
