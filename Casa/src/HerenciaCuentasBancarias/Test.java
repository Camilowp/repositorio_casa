package HerenciaCuentasBancarias;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        Cuentas[] cuentas = new Cuentas[4];

        cuentas[0] = new CuentaAhorro("Nacho Andretti", 1000, 12345, LocalDate.now(), 0.01, 3);
        cuentas[1] = new CuentaCorriente("Camilo Wilches", 500, 67890, LocalDate.now(), 200, true);
        cuentas[2] = new CuentaAhorro("Carlos Perez", 2000, 11223, LocalDate.now(), 0.02, 2);
        cuentas[3] = new CuentaCorriente("Jhony Bravo", 800, 44556, LocalDate.now(), 300, false);


        for (Cuentas cuenta : cuentas) {// Recorreremos el array para realizar operaciones
        	System.out.println("--- "
        			+ "Estado actual de la cuenta ---");
        	System.out.println(" ");
        	cuenta.detalles();
            cuenta.ingresar(300);
            cuenta.retirar(150); 
            System.out.println(" ");
            System.out.println("--- Después de las operaciones ---");
            System.out.println(" ");

            
            cuenta.detalles();
            System.out.println();
        }
    }
}



