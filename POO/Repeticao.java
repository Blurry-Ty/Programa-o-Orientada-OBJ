import javax.swing.JOptionPane;

public class Repeticao {
    public static void main(String[] args) {
        String[] list = {"ola", "oaa", "aa"};
        for (int i = 0; i <= list.length ; i += 1){
            JOptionPane.showMessageDialog(null, list[i]);
        }
    }
}
