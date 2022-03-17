import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite uma senha valida: ");
        char test = senha.charAt(0);
        String numberOnly = senha.replaceAll("[^0-9]", "");
        int teste = Integer.valueOf(numberOnly);


        if ((senha.length() == 4) && (test == 'a' || test == 'A') && teste % 2 != 0){
            JOptionPane.showMessageDialog(null, "Sua senha e valida");
        } 
        else{
            JOptionPane.showMessageDialog(null, "Sua senha e invalida");
        }
    }
}
