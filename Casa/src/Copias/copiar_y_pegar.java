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

<<<<<<< HEAD
		 // quitar el arraylist y cambiarlo por uno normal en todo el ejercicio 
		
		import java.util.Arrays;

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
		    private Producto[] productos;
		    private int contador;

		    public Almacen(int capacidad) {
		        productos = new Producto[capacidad];
		        contador = 0;
		    }

		    public void agregarProducto(Producto producto) {
		        if (contador < productos.length) {
		            productos[contador++] = producto;
		        } else {
		            System.out.println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
		        }
		    }

		    public void generarInforme() {
		        System.out.println("INFORME RIESGO DE STOCK DE PRODUCTOS");
		        System.out.println("====================================");

		        // Crear una copia del array para ordenar
		        Producto[] productosOrdenados = Arrays.copyOf(productos, contador);

		        // Ordenar productos por nivel de riesgo y porcentaje de stock
		        Arrays.sort(productosOrdenados, (p1, p2) -> {
		            int riesgoComparacion = p1.getRiesgo().compareTo(p2.getRiesgo());
		            if (riesgoComparacion == 0) {
		                return Double.compare(p1.getPorcentajeStock(), p2.getPorcentajeStock());
		            }
		            return riesgoComparacion;
		        });

		        // Clasificar y mostrar productos por nivel de riesgo
		        mostrarProductosPorRiesgo(productosOrdenados, "ALTO");
		        mostrarProductosPorRiesgo(productosOrdenados, "MODERADO");
		        mostrarProductosPorRiesgo(productosOrdenados, "SIN");
		    }

		    private void mostrarProductosPorRiesgo(Producto[] productosOrdenados, String nivelRiesgo) {
		        System.out.println(">>> Riesgo " + nivelRiesgo);
		        for (Producto producto : productosOrdenados) {
		            if (producto.getRiesgo().equals(nivelRiesgo)) {
		                System.out.println(producto);
		            }
		        }
		    }

		    public static void main(String[] args) {
		        Almacen almacen = new Almacen(100);

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
=======
		 // quitar el arraylist y cambiarlo por uno normal en todo el ejercicio rapidooo
>>>>>>> branch 'main' of https://github.com/Camilowp/repositorio_casa.git
	
	
	
	import java.util.Arrays;

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
	    private Producto[] productos;
	    private int contador;

	    public Almacen(int capacidad) {
	        productos = new Producto[capacidad];
	        contador = 0;
	    }

	    public void agregarProducto(Producto producto) {
	        if (contador < productos.length) {
	            productos[contador++] = producto;
	        } else {
	            System.out.println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
	        }
	    }

	    public void generarInforme() {
	        System.out.println("INFORME RIESGO DE STOCK DE PRODUCTOS");
	        System.out.println("====================================");

	        // Crear una copia del array hasta el número actual de productos
	        Producto[] productosOrdenados = Arrays.copyOf(productos, contador);

	        // Ordenar productos por nivel de riesgo y porcentaje de stock
	        Arrays.sort(productosOrdenados, (p1, p2) -> {
	            int riesgoComparacion = p1.getRiesgo().compareTo(p2.getRiesgo());
	            if (riesgoComparacion == 0) {
	                return Double.compare(p1.getPorcentajeStock(), p2.getPorcentajeStock());
	            }
	            return riesgoComparacion;
	        });

	        // Clasificar y mostrar productos por nivel de riesgo
	        mostrarProductosPorRiesgo(productosOrdenados, "ALTO");
	        mostrarProductosPorRiesgo(productosOrdenados, "MODERADO");
	        mostrarProductosPorRiesgo(productosOrdenados, "SIN");
	    }

	    private void mostrarProductosPorRiesgo(Producto[] productosOrdenados, String nivelRiesgo) {
	        System.out.println(">>> Riesgo " + nivelRiesgo);
	        for (Producto producto : productosOrdenados) {
	            if (producto.getRiesgo().equals(nivelRiesgo)) {
	                System.out.println(producto);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Almacen almacen = new Almacen(100);

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
	´
	

