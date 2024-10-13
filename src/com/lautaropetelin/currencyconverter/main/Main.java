package com.lautaropetelin.currencyconverter.main;

import com.lautaropetelin.currencyconverter.requestApi.ConsultaAPI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        do {
            try{
                int option = showMenu(scanner);

                String from = "", to = "";
                switch (option) {
                    case 1:
                        from = "USD";
                        to = "ARS";
                        break;
                    case 2:
                        from = "ARS";
                        to = "USD";
                        break;
                    case 3:
                        from = "USD";
                        to = "BRL";
                        break;
                    case 4:
                        from = "BRL";
                        to = "USD";
                        break;
                    case 5:
                        from = "USD";
                        to = "COP";
                        break;
                    case 6:
                        from = "COP";
                        to = "USD";
                        break;
                    case 7:
                        running = false;
                        System.out.println("\n****************************************\n" +
                                "Gracias por utilizar nuestro conversor.\n");
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida.\n");
                        continue;
                }

                if(option != 7){
                    double value = getValue(scanner);
                    double conversionRate = ConsultaAPI.getConversionRate(from, to);
                    double finalValue = value * conversionRate;
                    System.out.println(value + " [" + from +"] equivale a " + finalValue + " [" + to + "]\n");
                }

            }catch (InputMismatchException e){
                System.out.println("El valor a ingresar debe ser numérico y entero. Intenta de nuevo.\n");
                scanner.next(); // Limpieza de buffer
            }

        }while (running);

        scanner.close();
    }

    private static int showMenu(Scanner scanner){
        System.out.print("****************************************\n" +
                "Bienvenido/a al Conversor de Moneda\n\n" +
                "1) Dolar → Peso argentino\n" +
                "2) Peso argentino → Dolar\n" +
                "3) Dolar → Real brasileño\n" +
                "4) Real brasileño → Dolar\n" +
                "5) Dolar → Peso colombiano\n" +
                "6) Peso colombiano → Dolar\n" +
                "7) Salir\n\n" +
                "Elija una opción válida: ");

        return scanner.nextInt();
    }

    private static double getValue(Scanner scanner) throws InputMismatchException {
        System.out.print("Ingresa el valor que deseas convertir: ");
        return scanner.nextDouble();
    }
}