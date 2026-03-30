import java.util.Scanner;

public class verificar_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero == 0) {
            System.out.println("Zero.");
        } else {
            System.out.println("O número é negativo.");
        }

        scanner.close();
    }
}
    


