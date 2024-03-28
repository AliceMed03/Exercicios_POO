package Avaliacao.Funcionario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        funcionario.nome = leia.next();
        System.out.println("Digite o departamento do funcionário:");
        funcionario.departamento = leia.next();
        System.out.println("Digite o salário atual do funcionário:");
        funcionario.salario = leia.nextDouble();
        System.out.println("Digite a porcentagem do aumento:");
        Double porcentagem = leia.nextDouble();

        funcionario.aumentarSalario(porcentagem);
    }
}
