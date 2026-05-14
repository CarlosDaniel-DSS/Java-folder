import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        int soma = (nota1 + nota2) / 2;

        System.out.println(soma);

        sc.close();

    }
}
