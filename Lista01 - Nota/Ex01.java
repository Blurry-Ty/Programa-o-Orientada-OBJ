import javax.swing.JOptionPane;
import java.lang.Math;

public class Ex01 {
    public static void main(String[] args){
        double x1, y1, x2, y2;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2:"));

        JOptionPane.showMessageDialog(null, Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));


    }
}