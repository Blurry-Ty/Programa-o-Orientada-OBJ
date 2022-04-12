public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    public void comer() {
        fome += 1;
        energia += 1;
    }

    public void dormir() {
        sono--;
        energia++;
    }

    public void cacar() {
        energia -= 2;
        fome += 1;
        sono += 1;
    }

    public void status() {
        System.out.println("Nome: " + nome);
        System.out.println("Energia: " + energia);
        System.out.println("Fome: " + fome);
        System.out.println("Sono: " + sono);
    }

    public void iniciar() {
        nome = "Pedro";
        energia = 10;
        fome = 10;
        sono = 10;
    }
}