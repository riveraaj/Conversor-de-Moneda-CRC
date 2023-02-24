package view;

import controller.ConversorTemperaturaController;

import javax.swing.*;

public class ConversorTemperatura {

    public ConversorTemperatura(){main();}

    public void main(){
        ConversorTemperaturaController oConversorTemperatura = new ConversorTemperaturaController();

        String [] options = {"Celsius a Fahrenheit", "Celsius a Kelvin",
                "Fahrenheit a Celsius", "Fahrenheit a Kelvin",
                "Kelvin a Celsius", "Kelvin a Fahrenheit"};

        String op = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]).toString();

        switch(op){
            case "Celsius a Fahrenheit" -> oConversorTemperatura.main("Celsius", "Fahrenheit");
            case "Celsius a Kelvin" -> oConversorTemperatura.main("Celsius", "Kelvin");
            case "Fahrenheit a Celsius" -> oConversorTemperatura.main("Fahrenheit", "Celsius");
            case "Fahrenheit a Kelvin" -> oConversorTemperatura.main("Fahrenheit", "Kelvin");
            case "Kelvin a Fahrenheit" -> oConversorTemperatura.main("Kelvin", "Fahrenheit");
            case "Kelvin a Celsius" -> oConversorTemperatura.main("Kelvin", "Celsius");
            default -> System.out.println("Error");
        }
    }
}
