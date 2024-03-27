package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome do titular:");
        contaBancaria.titular = leia.next();

        System.out.println("Informe o valor do depósito:");
        double valor = leia.nextDouble();
        contaBancaria.depositar(valor);

        System.out.println("Informe o valor de saque:");
        valor = leia.nextDouble();
        contaBancaria.saque(valor);
    }
}
