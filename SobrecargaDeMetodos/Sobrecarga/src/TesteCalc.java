import java.util.Scanner;

public class TesteCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var c = scan.nextLine();
        var d = scan.nextLine();
        Calculadora calc = new Calculadora() ;
        System.out.println(calc.somar(c, d));
        scan.close();
    }
}
