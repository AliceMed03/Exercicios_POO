package Produto;

public class Produto {
    String nome;
    Double preco;
    Integer quantidade;

    //método para cacular o valor total em estoque
    public void calcularValorTotalEstoque(){
        Double valorTotal = preco * quantidade;
        System.out.println("Valor total em estoque: R$" + valorTotal);
    }


}
