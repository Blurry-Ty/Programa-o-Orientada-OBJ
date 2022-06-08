public class App {
    public static void main(String[] args) {
        Impressora impre = new Impressora();
        float f1 = 5.7f, f2 = 3.5f, f3 = 7.9f;
        String s1 = "pedro", s2 = "Folkmann", s3 = "Fernando", s4 = "Morto", s5 = "Alvinho";
        int i1 = 5, i2 = 10;
        impre.exibir(f1);
        impre.exibir(f2,f3);
        impre.exibir(f1, s5);
        impre.exibir(s3, f2);
        impre.exibir(s1,s2,s4);
        impre.exibir(i1, i2, s3);
        

    }
}
