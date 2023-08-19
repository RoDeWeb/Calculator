import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner consola = new Scanner(System.in);

        // Bucle que se ejecutará infinitamente hasta que se rompa manualmente
        while (true) {
            System.out.println("**** Calculator Application ****");
            // Mostrar el menú principal de la calculadora
            showMenu();
            try {
                // Leer la opción de operación ingresada por el usuario
                var operation = Integer.parseInt(consola.nextLine());

                if (operation >= 1 && operation <= 4) {
                    //Ejecución de operación deseada
                    showOperation(operation, consola);

                } else if (operation == 5) {
                    // Si la opción es 5, mostrar mensaje y romper el bucle
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    // Si la opción no es válida, mostrar mensaje de error
                    System.out.println("Opcion erronea: " + operation);
                }

                // Agregar un salto de línea para mayor claridad entre iteraciones
                System.out.println();
            } catch (Exception e) {
                // Capturar y mostrar cualquier excepción ocurrida durante el proceso
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        } // Fin del bucle while
    } // Fin del método main

    private static void showMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.println("Operación a realizar?");
    }
    private static void showOperation(int operation, Scanner consola){
        // Si la operación es válida (entre 1 y 4), solicitar operandos
        System.out.println("Proporciona primer valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        Double resultado;

        // Realizar la operación correspondiente según la opción elegida
        switch (operation) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado división: " + resultado);
            }
            default -> {
                System.out.println("Opción erronea: " + operation);
            }
        }
    }
} // Fin de la clase CalculatorApp
