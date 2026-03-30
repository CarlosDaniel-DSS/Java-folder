import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        int sum = 0;

        while (numero >= 0) {
            sum += numero;
            numero--;
        }

        System.out.println(sum);
        input.close();
    }
}
