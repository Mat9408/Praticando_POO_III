package com.mt9408.ooppractice3.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double tempCelsius) {
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println("A temperatura de " + tempCelsius +"°C corresponde a " + tempFahrenheit + "°F.");
    }

    @Override
    public void fahrenheitParaCelsius(double tempFahrenheit) {
        double tempCelsius = (tempFahrenheit - 32) / 1.8;
        System.out.println("A temperatura de " + tempFahrenheit +"°F corresponde a " + tempCelsius + "°C.");
    }
}
