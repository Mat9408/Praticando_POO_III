package com.mt9408.ooppractice3.livraria;

public class ProdutoFisico implements Calculavel{

    @Override
    public void calculaPrecoFinal(double preco) {
        double imposto = preco * 0.40;
        double precoFinal = preco + imposto;
        System.out.println("O preço final foi de: " + precoFinal);
    }
}
