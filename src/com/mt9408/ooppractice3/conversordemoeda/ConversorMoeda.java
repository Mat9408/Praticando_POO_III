package com.mt9408.ooppractice3.conversordemoeda;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o valor de cotação atual: ");
        double valorCotacao = scanner.nextDouble();
        System.out.println("O valor em real na cotação atual é de: R$" + valorDolar * valorCotacao + ".");
    }

}
