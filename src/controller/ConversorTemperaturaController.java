package controller;

import view.ConversorTemperatura;

import javax.swing.*;

public class ConversorTemperaturaController {

    public void main(String first, String secound){
        double number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los grados de temperatura:"));

        if(number > 0){
            if(first.equals("Celsius") && secound.equals("Fahrenheit")) celsiusToFahrenheit(number);
            else if(first.equals("Celsius") && secound.equals("Kelvin")) celsiusToKelvin(number);
            else if(first.equals("Fahrenheit") && secound.equals("Celsius")) fahrenheitToCelsius(number);
            else if(first.equals("Fahrenheit") && secound.equals("Kelvin")) fahrenheitToKelvin(number);
            else if(first.equals("Kelvin") && secound.equals("Celsius")) kelvinToCelsius();
            else if(first.equals("Kelvin") && secound.equals("Fahrenheit")) kelvinToFahrenheit();
            else System.out.println("Error");
            int option = JOptionPane.showConfirmDialog(null, "Desea continuar?");
            switch (option){
                case 0 -> {
                    ConversorTemperatura oConversor = new ConversorTemperatura();
                    oConversor.main();
                }
                default -> JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }else{
            main(first, secound);
        }
    }

    private void celsiusToFahrenheit(double number){
        JOptionPane.showMessageDialog(null, number * 1.8 + 32 + " Grado Fahrenheit");
    }

    private void celsiusToKelvin(double number){
        JOptionPane.showMessageDialog(null, number + 273.15 + " Grado Kelvin");
    }

    private void fahrenheitToCelsius(double number){
        JOptionPane.showMessageDialog(null, (number - 32) * 5 / 9 + " Grado Celsius");
    }

    private void fahrenheitToKelvin(double number){
        JOptionPane.showMessageDialog(null, (number - 32) * 5 / 9 + 273.15 + " Grado Kelvin");
    }

    private void kelvinToCelsius(){
        JOptionPane.showMessageDialog(null, 0 - 273.15 + " Grado Celsius");
    }

    private void kelvinToFahrenheit(){
        JOptionPane.showMessageDialog(null, (0 - 273.15) * 9 / 5 + 32 + " Grado Fahrenheit");
    }

}
