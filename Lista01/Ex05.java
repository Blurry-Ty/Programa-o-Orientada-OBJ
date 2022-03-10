import javax.swing.JOptionPane;
import java.lang.Math;

public class Ex05 {
    public static void main(String[] args) {
        int A;
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int res,restoA, resb, restoB, resc, restoC, resd, restoD, rese, restoE, resf, restoF, resg, restoG, resh;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        
        res = A/200 ;
        restoA = A%200;
        resb = A%200 / 100;
        restoB = restoA % 100;
        resc = restoB / 50 ;
        restoC = restoB % 50;
        resd = restoC / 20;
        restoD = restoC % 20;
        rese = restoD /10;
        restoE = restoD % 10;
        resf = restoE /5;
        restoF = restoE % 5;
        resg = restoF /2;
        restoG = restoF % 2;
        resh = restoG /1 ;
        
         
        
        JOptionPane.showMessageDialog(null, res + " notas de 200 \n" + resb + " notas de 100 \n" + resc + " notas de 50 \n" + resd + " notas de 20 \n" + rese + " notas de 10 \n" + resf + " notas de 5 \n" + resg + " notas de 2 \n" + resh + " notas de 1 \n");

    }
}