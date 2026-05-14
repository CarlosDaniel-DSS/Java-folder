package contas_bancarias;

public class Account {

    // Variáveis de instância
    private String name;
    private double balance;

    // Construtor
    public Account(String name, double balance) {
        this.name = name;

        // Agora aceita qualquer valor inicial
        this.balance = balance;
    }

    // Método de depósito
    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    // Retorna saldo
    public double getBalance() {
        return balance;
    }

    // Define nome
    public void setName(String name) {
        this.name = name;
    }

    // Retorna nome
    public String getName() {
        return name;
    }
}
