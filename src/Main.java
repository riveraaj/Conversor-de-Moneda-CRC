import view.ConversorMonedas;
import view.ConversorTemperatura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String [] options = {"Conversor de Monedas", "Conversor de Temperatura"};
        String op = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]).toString();

        switch(op){
            case "Conversor de Monedas" -> new ConversorMonedas();
            case "Conversor de Temperatura" -> new ConversorTemperatura();
            default -> System.out.println("Error");
        }
    }
}