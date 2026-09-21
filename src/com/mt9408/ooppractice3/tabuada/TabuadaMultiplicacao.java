package com.mt9408.ooppractice3.tabuada;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int multiplicador) {
        for (int numero = 1; numero <=10; numero++) {
            int resultado = numero * multiplicador;
            System.out.println(multiplicador + "*" + numero + "=" + resultado);
        }
    }
}
