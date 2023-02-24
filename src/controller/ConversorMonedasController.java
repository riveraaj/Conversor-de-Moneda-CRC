package controller;

import service.FixerAPI;
import view.ConversorMonedas;

import javax.swing.*;

public class ConversorMonedasController {

    public void conversionMoneda(String toConvert, String original) {
        FixerAPI oFixer = new FixerAPI();
        String result;
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:"));

        if(amount > 0){
            result = oFixer.getRequest(toConvert, original, amount);
            JOptionPane.showMessageDialog(null, "Tienes $" + result + " " + toConvert);
        }else {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            conversionMoneda(original, toConvert);
        }

        int option = JOptionPane.showConfirmDialog(null, "Desea continuar?");
        switch (option){
            case 0 -> {
                ConversorMonedas oConversor = new ConversorMonedas();
                oConversor.main();
            }
            default -> JOptionPane.showMessageDialog(null, "Programa Finalizado");
        }
    }
}
