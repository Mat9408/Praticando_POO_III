package com.mt9408.ooppractice3.calculadorageometrica;

import java.util.Scanner;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("A área é de: " + altura * largura + "m².");
    }

    @Override
    public void calcularPerimetro(double base1, double base2, double altura1, double altura2) {
        double calculo = base1 + base2 + altura1 + altura2;
        System.out.println("O perímetro é de: " + calculo + "m².");
    }


}
