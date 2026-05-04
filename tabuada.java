import java.util.Scanner;

// Questão 2 da prova prática:
public class tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (n*i));
        }

        input.close();
    }
}
