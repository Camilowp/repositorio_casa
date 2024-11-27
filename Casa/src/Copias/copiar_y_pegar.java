package Copias;

public class copiar_y_pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// CAMILO
		3. Informe riesgo rotura stock de productos. 
		Puntos: 5 
		Implementar el código necesario para controlar el stock de los productos que se 
		guardan en un almacén. 
		Cada producto estará identificado por un código único y tendrá, además, un 
		nombre para describirlo y el precio. 
		Por otra parte, el stock indicará el número de unidades disponibles en el almacén. 
		Existirá también, por cada producto, una cantidad recomendada de unidades a 
		mantener en stock. 
		2 
		El stock, en relación con la cantidad de unidades recomendadas, podrá estar en 
		alguna de estas situaciones de riesgo respecto a su rotura: - 
		"Riesgo alto", si es inferior a un 30% - - 
		"Riesgo moderado", si está entre un 30% y un 60% 
		"Sin riesgo", si es mayor al 60%  
		En el almacén habrá un máximo de 100 productos. Se podrá saber, en cualquier 
		momento, el número de productos existentes. 
		El programa ofrecerá la posibilidad de mostrar un informe de situación del stock de 
		todos los productos y el riesgo de rotura que existe: - 
		Se mostrará un listado con todos los productos, indicando id, nombre, 
		stock actual y porcentaje de stock respecto al stock recomendado. - 
		Aparecerán clasificados en orden de mayor a menor riego de rotura. Es 
		decir, en primer lugar, los productos que tienen mayor riesgo, luego los de 
		riesgo moderado y, por último, productos sin riesgo de rotura de stock. 
		Ejemplo de informe: 
		INFORME RIESGO DE STOCK DE PRODUCTOS 
		==================================== 
		>>> Riesgo ALTO 
		> P002 - Samsung Galaxy S24 
		Stock actual: 20 
		% respecto a stock recomendado: 25,00% 
		> P005 - Samsung Galaxy S23 
		Stock actual: 13 
		% respecto a stock recomendado: 13,00% 
		>>> Riesgo MODERADO 
		> P001 - Portátil HP 15A-NB0004NS 
		Stock actual: 50 
		% respecto a stock recomendado: 50,00% 
		>>> SIN riesgo 
		> P003 - Tablet Lenovo Tab M11 
		Stock actual: 30 
		% respecto a stock recomendado: 60,00% 
		> P004 - Auriculares JBL Tune Beam 
		Stock actual: 100 
		% respecto a stock recomendado: 66,67% 
		> P006 - Samsung Galaxy A11 
		Stock actual: 120 
		% respecto a stock recomendado: 120,00%

// import java.util.Scanner;


        		

//pasame ese ejercicio ese que está ahí arriba
        		
<<<<<<< HEAD
        		/*Invertir un array. 
        		Puntos: 3 
        		Desarrollar dos funciones que reciban, ambas, un array de Strings como 
        		argumento. 
        		Las funciones tendrán el mismo objetivo: procesar el array recibido para darle la 
        		vuelta, es decir, una vez procesado, sus elementos quedarán ordenados en orden 
        		inverso al recibido. - - 
        		La primera función utilizará otro array, como elemento auxiliar, para 
        		ordenar, en orden inverso, los elementos del array recibido. 
        		La segunda función realizará los cambios necesarios sobre el mismo array 
        		recibido como argumento. 
        		Ejemplo: - - 
        		Array original: ["uno", "dos", "tres", "cuatro", "cinco"]. 
        		Array después de ser procesado: ["cinco", "cuatro", "tres", "dos", "uno"] */
        		
        		
        		//resulta
        		import java.util.Arrays;

        public class Main {

            // Función que utiliza un array auxiliar para invertir el array recibido
            public static String[] invertirConArrayAuxiliar(String[] array) {
                String[] invertido = new String[array.length];
                for (int i = 0; i < array.length; i++) {
                    invertido[i] = array[array.length - 1 - i];
                }
                return invertido;
            }

            // Función que invierte el array directamente, sin usar un array auxiliar
            public static void invertirEnElMismoArray(String[] array) {
                int inicio = 0;
                int fin = array.length - 1;
                while (inicio < fin) {
                    // Intercambiar elementos
                    String temp = array[inicio];
                    array[inicio] = array[fin];
                    array[fin] = temp;

                    inicio++;
                    fin--;
                }
            }

            public static void main(String[] args) {
                // Ejemplo de uso
                String[] arrayOriginal = {"uno", "dos", "tres", "cuatro", "cinco"};
                
                System.out.println("Array original: " + Arrays.toString(arrayOriginal));

                // Usando la función con un array auxiliar
                String[] arrayInvertido = invertirConArrayAuxiliar(arrayOriginal);
                System.out.println("Invertido con array auxiliar: " + Arrays.toString(arrayInvertido));

                // Usando la función que invierte en el mismo array
                invertirEnElMismoArray(arrayOriginal);
                System.out.println("Invertido en el mismo array: " + Arrays.toString(arrayOriginal));
            }
        }

=======
        	
>>>>>>> branch 'main' of https://github.com/Camilowp/repositorio_casa.git

	
	// TE PASO EL DE ARRIBA QUE ME DIJISTE 
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	class Producto {
	    private String id;
	    private String nombre;
	    private double precio;
	    private int stockActual;
	    private int stockRecomendado;

	    public Producto(String id, String nombre, double precio, int stockActual, int stockRecomendado) {
	        this.id = id;
	        this.nombre = nombre;
	        this.precio = precio;
	        this.stockActual = stockActual;
	        this.stockRecomendado = stockRecomendado;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getStockActual() {
	        return stockActual;
	    }

	    public double getPorcentajeStock() {
	        return ((double) stockActual / stockRecomendado) * 100;
	    }

	    public String getRiesgo() {
	        double porcentaje = getPorcentajeStock();
	        if (porcentaje < 30) {
	            return "ALTO";
	        } else if (porcentaje <= 60) {
	            return "MODERADO";
	        } else {
	            return "SIN";
	        }
	    }

	    @Override
	    public String toString() {
	        return "> " + id + " - " + nombre +
	               "\nStock actual: " + stockActual +
	               "\n% respecto a stock recomendado: " + String.format("%.2f", getPorcentajeStock()) + "%\n";
	    }
	}

	public class Almacen {
	    private List<Producto> productos;

	    public Almacen() {
	        productos = new ArrayList<>();
	    }

	    public void agregarProducto(Producto producto) {
	        if (productos.size() < 100) {
	            productos.add(producto);
	        } else {
	            System.out.println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
	        }
	    }

	    public void generarInforme() {
	        System.out.println("INFORME RIESGO DE STOCK DE PRODUCTOS");
	        System.out.println("====================================");

	        // Ordenar productos por nivel de riesgo
	        productos.sort(Comparator.comparing(Producto::getRiesgo).thenComparing(Producto::getPorcentajeStock));

	        // Clasificar y mostrar productos por nivel de riesgo
	        mostrarProductosPorRiesgo("ALTO");
	        mostrarProductosPorRiesgo("MODERADO");
	        mostrarProductosPorRiesgo("SIN");
	    }

	    private void mostrarProductosPorRiesgo(String nivelRiesgo) {
	        System.out.println(">>> Riesgo " + nivelRiesgo);
	        productos.stream()
	                 .filter(producto -> producto.getRiesgo().equals(nivelRiesgo))
	                 .forEach(System.out::println);
	    }

	    public static void main(String[] args) {
	        Almacen almacen = new Almacen();

	        // Agregar productos
	        almacen.agregarProducto(new Producto("P002", "Samsung Galaxy S24", 1199.99, 20, 80));
	        almacen.agregarProducto(new Producto("P005", "Samsung Galaxy S23", 999.99, 13, 100));
	        almacen.agregarProducto(new Producto("P001", "Portátil HP 15A-NB0004NS", 599.99, 50, 100));
	        almacen.agregarProducto(new Producto("P003", "Tablet Lenovo Tab M11", 199.99, 30, 50));
	        almacen.agregarProducto(new Producto("P004", "Auriculares JBL Tune Beam", 89.99, 100, 150));
	        almacen.agregarProducto(new Producto("P006", "Samsung Galaxy A11", 399.99, 120, 100));

	        // Generar informe
	        almacen.generarInforme();
	    }
	}

	