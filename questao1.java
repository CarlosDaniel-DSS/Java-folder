
// Questão 1 (corrijindo o código para printar "23.0")
public class questao1 {
    // parte inicial (errada)  
    public static void main(String[] args) {

        double x = 10.5, y =12.8;
        double z = run(x, y);
        System.out.println(z);
    }
    // código solucionador
    static double run(double x, double y) {
        return (int) (x + y);
    }
        
}



