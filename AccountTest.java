package contas_bancarias;

import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {

        // Pedir nome da conta 1
        String nome1 = JOptionPane.showInputDialog(
            "Digite o nome da Conta 1:"
        );

        // Definindo as contas e seus saldos iniciaisl
        Account account1 = new Account(nome1, 50.00);
        Account account2 = new Account("Ivan Vitor", -5.00);

        // Mensagem de boas-vindas ao usuário
        JOptionPane.showMessageDialog(
            null, "Bem-vindo ao sistema bancário, " + account1.getName() + "!"
        );

        // Mostrar saldo inicial das contas
        String saldoInicial = String.format(
            "Saldos iniciais:%n%s balance: R$ %.2f%n%s balance: R$ %.2f",
            account1.getName(), account1.getBalance(),
            account2.getName(), account2.getBalance()
        );

        JOptionPane.showMessageDialog(null, saldoInicial);

        // Depósito na conta 1
        String deposito1 = JOptionPane.showInputDialog(
            "Digite o valor para depósito na Conta 1:"
        );

        double valor1 = Double.parseDouble(deposito1);
        account1.deposit(valor1);

        // Mostrar saldo após depósito da conta 1
        String saldoConta1 = String.format(
            "Após depósito na Conta 1:%n%s balance: R$ %.2f%n%s balance: R$ %.2f",
            account1.getName(), account1.getBalance(),
            account2.getName(), account2.getBalance()
        );

        JOptionPane.showMessageDialog(null, saldoConta1);

        // Depósito na conta 2
        String deposito2 = JOptionPane.showInputDialog(
            "Digite o valor para depósito na Conta 2:"
        );

        double valor2 = Double.parseDouble(deposito2);
        account2.deposit(valor2);

        // Mostrar saldo após depósito na conta 2
        String saldoFinal = String.format(
            "Após depósito na Conta 2:%n%s balance: R$ %.2f%n%s balance: R$ %.2f",
            account1.getName(), account1.getBalance(),
            account2.getName(), account2.getBalance()
        );

        JOptionPane.showMessageDialog(null, saldoFinal);
    }
}