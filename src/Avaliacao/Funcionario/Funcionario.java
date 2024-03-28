package Avaliacao.Funcionario;

public class Funcionario {
    String nome;
    String departamento;
    Double salario;

    public void aumentarSalario(Double porcentagem){
        Double calculoNovoSalario = porcentagem / 100;
        Double calculoNovoSalario2 = salario * calculoNovoSalario;
        Double calculoNovoSalario3 = salario + calculoNovoSalario2;

        System.out.println("O novo salário é de :R$" + calculoNovoSalario3);
    }
}
