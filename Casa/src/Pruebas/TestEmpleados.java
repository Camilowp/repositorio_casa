package Pruebas;

import HerenciaTrabajadores.Analistas;
import HerenciaTrabajadores.Empleados;
import HerenciaTrabajadores.JefeDeProyecto;
import HerenciaTrabajadores.Programadores;
public class TestEmpleados {
	public static void main(String[] args) {

        JefeDeProyecto jefe = new JefeDeProyecto("Carlos", "Gómez", "A123", 50000.00, 4); 
       
        System.out.println("El bono extra de " + jefe.getNombre() + " es: " + jefe.bono(0.1));
    
        Analistas analista = new Analistas("Ana", "Martínez", "B123", 30000.00, 5); 
        
        System.out.println("El bono extra de " + analista.getNombre() + " es: " + analista.bono(0.1));
        
        Programadores programador = new Programadores("Sara", "Jones", "C123", 18000.00, new String[] {"Java", "C++", "Python"});

        System.out.println("El bono extra de " + programador.getNombre() + " es " + programador.bono(0.1));
	}
}
