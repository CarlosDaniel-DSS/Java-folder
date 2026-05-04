public class questao3 {

    //método m1 quando os valores de x e y são inteiros
    static int m1(int x, int y) {
        return x + y;
    }

    //método m1 quando os valores de x e y são double
    static double m1(double x, double y) {
        return  x * y;
    }

    public static void main(String[] args) {

        /* define que a variável "a" vai receber o 
        método m1 de dois valores inteiros */
        int a = m1(20, 3);

        /* define que a variável "b" vai receber o 
        método m1 de dois valores double */
        double b = m1(3.56, 1.01);

        // saída de dados
        System.out.println("int: " + a);
        System.out.println("double: " + b);
    }
}

/* No geral, esse código exemplifica uma sobrecarga de métodos, 
mas com parâmetros diferentes. */