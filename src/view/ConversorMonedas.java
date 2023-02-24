package view;

import controller.ConversorMonedasController;

import javax.swing.*;

public class ConversorMonedas {

    public ConversorMonedas(){
        main();
    }

    public void main(){

        ConversorMonedasController oConversorController = new ConversorMonedasController();

        String [] options = {"De Colón costarricense a Dolar estadounidense", "De Colón costarricense a Euro",
                "De Colón costarricense a Libras esterlinas", "De Colón costarricense a Yen Japonés",
                "De Colón costarricense a Won sul-coreano", "De Dolar estadounidense a Colón costarricense",
                "De Euro a Colón costarricense", "De Libras esterlinas a Colón costarricense",
                "De Yen Japonés a Colón costarricense", "De Won sul-coreano a Colón costarricense"};

        String op = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]).toString();

        switch(op){
            case "De Colón costarricense a Dolar estadounidense" -> oConversorController.conversionMoneda("USD", "CRC");
            case "De Colón costarricense a Euro" -> oConversorController.conversionMoneda("EUR", "CRC");
            case "De Colón costarricense a Libras esterlinas" -> oConversorController.conversionMoneda("GBP", "CRC");
            case "De Colón costarricense a Yen Japonés" -> oConversorController.conversionMoneda("JPY", "CRC");
            case "De Colón costarricense a Won sul-coreano" -> oConversorController.conversionMoneda("KRW", "CRC");
            case "De Dolar estadounidense a Colón costarricense" -> oConversorController.conversionMoneda("CRC", "USD");
            case "De Euro a Colón costarricense" -> oConversorController.conversionMoneda("CRC", "EUR");
            case "De Libras esterlinas a Colón costarricense" -> oConversorController.conversionMoneda("CRC", "GBP");
            case "De Yen Japonés a Colón costarricense" -> oConversorController.conversionMoneda("CRC", "JPY");
            case "De Won sul-coreano a Colón costarricense" -> oConversorController.conversionMoneda("CRC", "KRW");
            default -> System.out.println("Error");
        }
    }
}
