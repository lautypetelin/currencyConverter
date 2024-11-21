package com.lautaropetelin.currencyconverter.test;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.lautaropetelin.currencyconverter.service.ProveedorAPI;
import com.lautaropetelin.currencyconverter.gui.CurrencyConverterForm;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {

        // Test con Consola
        
//        Scanner scanner = new Scanner(System.in);
//        boolean running = true;
//
//        do {
//            try {
//                int option = showMenu(scanner);
//
//                String from = "", to = "";
//                switch (option) {
//                    case 1:
//                        from = "USD";
//                        to = "ARS";
//                        break;
//                    case 2:
//                        from = "ARS";
//                        to = "USD";
//                        break;
//                    case 3:
//                        from = "USD";
//                        to = "BRL";
//                        break;
//                    case 4:
//                        from = "BRL";
//                        to = "USD";
//                        break;
//                    case 5:
//                        from = "USD";
//                        to = "COP";
//                        break;
//                    case 6:
//                        from = "COP";
//                        to = "USD";
//                        break;
//                    case 7:
//                        running = false;
//                        System.out.println("\n****************************************\n"
//                                + "Gracias por utilizar nuestro conversor.\n");
//                        break;
//                    default:
//                        System.out.println("La opción ingresada no es válida.\n");
//                        continue;
//                }
//
//                if (option != 7) {
//                    double value = getValue(scanner);
//                    double conversionRate = RequestAPI.getConversionRate(from, to);
//                    double finalValue = value * conversionRate;
//                    System.out.println(value + " [" + from + "] equivale a " + finalValue + " [" + to + "]\n");
//                }
//
//            } catch (InputMismatchException e) {
//                System.out.println("El valor a ingresar debe ser numérico y entero. Intenta de nuevo.\n");
//                scanner.next(); // Limpieza de buffer
//            }
//
//        } while (running);
//
//        scanner.close();

        // Test con Interfaz Gráfica de Usuario
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "El Look And Feel no ha sido instalado o no es compatible con la versión de java que estás utilizando.", "Error con Look And Feel", JOptionPane.ERROR_MESSAGE);
        }
        
        CurrencyConverterForm currencyConverterForm = new CurrencyConverterForm();
        currencyConverterForm.setTitle("Convertidor de Monedas by Lautaro Petelin");
        currencyConverterForm.setVisible(true);
        currencyConverterForm.setLocationRelativeTo(null);
    }

//    private static int showMenu(Scanner scanner) {
//        System.out.print("****************************************\n"
//                + "Bienvenido/a al Conversor de Moneda\n\n"
//                + "1) Dolar → Peso argentino\n"
//                + "2) Peso argentino → Dolar\n"
//                + "3) Dolar → Real brasileño\n"
//                + "4) Real brasileño → Dolar\n"
//                + "5) Dolar → Peso colombiano\n"
//                + "6) Peso colombiano → Dolar\n"
//                + "7) Salir\n\n"
//                + "Elija una opción válida: ");
//
//        return scanner.nextInt();
//    }

//    private static double getValue(Scanner scanner) throws InputMismatchException {
//        System.out.print("Ingresa el valor que deseas convertir: ");
//        return scanner.nextDouble();
//    }
}
