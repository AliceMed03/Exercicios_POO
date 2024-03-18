//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1);
        pessoa1.nome = "Alice";
        pessoa1.sobrenome = "Medeiros da Silva";
        pessoa1.idade = 21;

        pessoa1.exibirDetalhes();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2);
        pessoa2.nome = "Fernando";
        pessoa2.sobrenome = "De Souza Cossa";
        pessoa2.idade = 28;

        pessoa2.exibirDetalhes();

        PessoaFisica pessoaFisica1 = new PessoaFisica();

        System.out.println(pessoa1);
        pessoaFisica1.nome = "Alice";
        pessoaFisica1.sobrenome = "Medeiros da Silva";
        pessoaFisica1.idade = 21;
        pessoaFisica1.cpf = "107.424.709-46";
        pessoaFisica1.exibirDetalhes();

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        pessoaJuridica1.nome = "Alice";
        pessoaJuridica1.sobrenome = "Medeiros da Silva";
        pessoaJuridica1.idade = 21;
        pessoaJuridica1.cnpj = "10.333.971/0001-07";
        pessoaJuridica1.exibirDetalhes();

    }
}