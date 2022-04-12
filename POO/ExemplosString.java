import javax.swing.JOptionPane;

public class ExemplosString {
    public static void main(String[] args) {

        // Tipos Primitivos
        // byte, short, int, long, char, float, double
        // Classes da especificação: Math, String, Integer, Character...
        // Classes emapacotadora (wrapper)

        /*
            byte: Byte
            short: Shot
            double: Double
            int: Integer
            long: Long
            char: Character
            float: Float
        */ 

        // Variavel primitiva: int a;
        // Variavel de referencia: String s;

        String s = JOptionPane.showInputDialog("Digite uma string:");
        int comprimento = s.length();
        JOptionPane.showMessageDialog(null ,String.format( "%s tem %d caracteres", s, comprimento));

    }
}