package com.mt9408.ooppractice3.livraria;

public class Livro extends ProdutoFisico implements Calculavel{

    @Override
    public void calculaPrecoFinal(double preco) {
        double valorPromocao = preco * 0.50;
        double precoFinal = preco - valorPromocao;
        System.out.println("O preço final é de: " + precoFinal);
    }
}
