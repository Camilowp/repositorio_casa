package Copias;

public class copiar_y_pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("busca esto");
/*Crea un programa en Java que implemente una calculadora básica utilizando funciones. El programa debe incluir las siguientes operaciones:

Suma
Resta
Multiplicación
División
Potencia
Raíz cuadrada*/

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("\n--- Calculadora Básica ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(obtenerNumero("Ingrese el primer número: "), obtenerNumero("Ingrese el segundo número: ")));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(obtenerNumero("Ingrese el primer número: "), obtenerNumero("Ingrese el segundo número: ")));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(obtenerNumero("Ingrese el primer número: "), obtenerNumero("Ingrese el segundo número: ")));
                    break;
                case 4:
                    double divisor = obtenerNumero("Ingrese el divisor: ");
                    if (divisor != 0) {
                        System.out.println("Resultado: " + dividir(obtenerNumero("Ingrese el dividendo: "), divisor));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Resultado: " + potencia(obtenerNumero("Ingrese la base: "), (int) obtenerNumero("Ingrese el exponente: ")));
                    break;
                case 6:
                    double numero = obtenerNumero("Ingrese el número: ");
                    if (numero >= 0) {
                        System.out.println("Resultado: " + raizCuadrada(numero));
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    // Métodos para las operaciones
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    // Método auxiliar para leer un número
    public static double obtenerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
}

	}

}

