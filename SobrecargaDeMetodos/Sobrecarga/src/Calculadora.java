public class Calculadora {

    // tipo de retorno
    // nome
    // lista de parâmetros
    // corpo

    public int somar(int a, int b){
        int res = a+b;
        return res;
        // O return encerra o metodo
        //return a + b;
    }
    public float somar(float a, float b){
        float res = a+b;
        return res;
    }
    public double somar(String a, String b){
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
    

    public int multiplicar(int a, int b){
        int mult = a*b;
        return mult;
    }


}
