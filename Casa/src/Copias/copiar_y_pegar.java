package Copias;
//listo ratiiiiiiiii
//que
//yaaaaaaaaaaaaa
//hola sofa, me daba error
1. Sistema de gestión de préstamo en una biblioteca 
Puntos:  10 
Desarrolla un sistema de gestión de préstamo de las publicaciones que se 
encuentran disponibles en una biblioteca pública. 
Existirán diferentes tipos de publicaciones, incluyendo libros, revistas y periódicos. 
Cada tipo de publicación tiene características únicas y reglas específicas tanto 
para determinar el plazo de préstamo como para calcular las sanciones en caso de 
devolución fuera de plazo. 
El sistema que se implemente deberá tener en cuenta las siguientes condiciones: 
• Los datos de una publicación incluyen título, autor, código y año de 
publicación. Además, cada publicación puede contener información 
adicional: 
o Libro: número de páginas y género. 
o Revista: número de edición y periodicidad. 
o Periódico: sección y fecha de publicación. 
• El sistema permitirá mostrar información con el detalle de cada 
publicación. 
• Se podrán prestar las publicaciones, calculando, automáticamente, la 
fecha de devolución según su tipo. Esta fecha de devolución se visualizará 
por consola en el momento del préstamo, junto con los datos de la 
publicación. 
• Si, en el momento de la devolución de una publicación, se comprueba que 
se ha superado el plazo de préstamo, se calculará la sanción 
correspondiente, mostrando por consola el número de días excedido y la 
sanción asociada. 
• Tanto el plazo de préstamo como el cálculo de la sanción dependerán 
del tipo de publicación: 
o Plazos de préstamo: 
▪ Libro: 14 días 
▪ Revista: 7 días 
▪ Periódico: 3 días 
o Sanciones (penalización por cada día de retraso en la devolución): 
▪ Libro: 0.50 €/día 
▪ Revista: 0.30 €/día 
▪ Periódico: 0.20 €/día 
1 
Las publicaciones se encontrarán incluidas/contenidas en bibliotecas. Se 
podrán crear tantas bibliotecas como sea necesario. Cada biblioteca contendrá un 
máximo de 100 publicaciones. 
La biblioteca permitirá añadir nuevas publicaciones y dará la opción de gestionar 
los préstamos y sus correspondientes devoluciones. 
Notas 
• Formato esperado de salida de fechas e importes (sanciones): 
o Importes: con puntos de separación de miles y 2 decimales. 
o Fechas: dd/mm/aaaa. 
• Es recomendable que las fechas sean tratadas como LocalDate. 
Una publicación estará disponible para préstamo si su fecha prevista de 
devolución es igual a LocalDate.MAX (máxima fecha posible de LocalDate). 
• Utilizar la función isAfter() de LocalDate para determinar si una fecha es 
posterior a otra. 
Ejemplo: fecha1.isAfter(fecha2) 
Donde fecha1 y fecha2 son objetos de tipo LocalDate y la función isAfter() 
comprueba si fecha1 es posterior a fecha2. 
• Para calcular el número de días transcurridos entre dos fechas, utilizar la 
clase ChronoUnit de la siguiente forma: 
Ejemplo: ChronoUnit.DAYS.between(fecha1, fecha2) 
Donde fecha1 y fecha2 son las fechas que se desea comparar y están en 
formato LocalDate. 
• Las fechas de tipo LocalDate se pueden mostrar con el formato esperado 
(dd/mm/aaaa) utilizando la clase DateTimeFormatter. 
Ejemplo, para una variable denominada fecha de tipo LocalDate: 
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-yyyy"); 
dtf.format(fecha);
// respuesta 

//quita el el metodo abstract 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

abstract class Publicacion {
    protected String titulo;
    protected String autor;
    protected String codigo;
    protected int anioPublicacion;
    protected LocalDate fechaDevolucion;

    public Publicacion(String titulo, String autor, String codigo, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.fechaDevolucion = LocalDate.MAX;
    }

    public abstract int getDiasPrestamo();
    public abstract double getSancionDiaria();

    public boolean estaDisponible() {
        return fechaDevolucion.equals(LocalDate.MAX);
    }

    public void prestar() {
        fechaDevolucion = LocalDate.now().plusDays(getDiasPrestamo());
    }

    public double devolver() {
        if (LocalDate.now().isAfter(fechaDevolucion)) {
            long diasRetraso = ChronoUnit.DAYS.between(fechaDevolucion, LocalDate.now());
            double sancion = diasRetraso * getSancionDiaria();
            fechaDevolucion = LocalDate.MAX;
            return sancion;
        }
        fechaDevolucion = LocalDate.MAX;
        return 0;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Título: %s, Autor: %s, Código: %s, Año: %d, Fecha devolución: %s",
                titulo, autor, codigo, anioPublicacion, 
                fechaDevolucion.equals(LocalDate.MAX) ? "Disponible" : dtf.format(fechaDevolucion));
    }
}

class Libro extends Publicacion {
    private int numPaginas;
    private String genero;

    public Libro(String titulo, String autor, String codigo, int anioPublicacion, int numPaginas, String genero) {
        super(titulo, autor, codigo, anioPublicacion);
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    @Override
    public int getDiasPrestamo() {
        return 14;
    }

    @Override
    public double getSancionDiaria() {
        return 0.50;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Páginas: %d, Género: %s", numPaginas, genero);
    }
}

class Revista extends Publicacion {
    private int numEdicion;
    private String periodicidad;

    public Revista(String titulo, String autor, String codigo, int anioPublicacion, int numEdicion, String periodicidad) {
        super(titulo, autor, codigo, anioPublicacion);
        this.numEdicion = numEdicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public int getDiasPrestamo() {
        return 7;
    }

    @Override
    public double getSancionDiaria() {
        return 0.30;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Edición: %d, Periodicidad: %s", numEdicion, periodicidad);
    }
}

class Periodico extends Publicacion {
    private String seccion;
    private LocalDate fechaPublicacion;

    public Periodico(String titulo, String autor, String codigo, int anioPublicacion, String seccion, LocalDate fechaPublicacion) {
        super(titulo, autor, codigo, anioPublicacion);
        this.seccion = seccion;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public int getDiasPrestamo() {
        return 3;
    }

    @Override
    public double getSancionDiaria() {
        return 0.20;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() + String.format(", Sección: %s, Fecha publicación: %s", seccion, dtf.format(fechaPublicacion));
    }
}

class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private static final int MAX_PUBLICACIONES = 100;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        if (publicaciones.size() < MAX_PUBLICACIONES) {
            publicaciones.add(publicacion);
            System.out.println("Publicación agregada con éxito.");
        } else {
            System.out.println("La biblioteca ha alcanzado su capacidad máxima.");
        }
    }

    public void prestarPublicacion(String codigo) {
        for (Publicacion pub : publicaciones) {
            if (pub.codigo.equals(codigo) && pub.estaDisponible()) {
                pub.prestar();
                System.out.println("Préstamo realizado. Detalles: " + pub);
                return;
            }
        }
        System.out.println("Publicación no disponible o no encontrada.");
    }

    public void devolverPublicacion(String codigo) {
        for (Publicacion pub : publicaciones) {
            if (pub.codigo.equals(codigo) && !pub.estaDisponible()) {
                double sancion = pub.devolver();
                System.out.println("Devolución realizada. Detalles: " + pub);
                if (sancion > 0) {
                    System.out.printf("Sanción por retraso: %.2f €\n", sancion);
                }
                return;
            }
        }
        System.out.println("Publicación no encontrada o ya devuelta.");
    }

    public void mostrarPublicaciones() {
        for (Publicacion pub : publicaciones) {
            System.out.println(pub);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar publicaciones
        biblioteca.agregarPublicacion(new Libro("El Quijote", "Miguel de Cervantes", "L001", 1605, 863, "Novela"));
        biblioteca.agregarPublicacion(new Revista("National Geographic", "Various", "R001", 2023, 256, "Mensual"));
        biblioteca.agregarPublicacion(new Periodico("El País", "Redacción", "P001", 2023, "General", LocalDate.now()));

        // Mostrar publicaciones
        System.out.println("Publicaciones en la biblioteca:");
        biblioteca.mostrarPublicaciones();

        // Realizar préstamo
        System.out.println("\nRealizando préstamo:");
        biblioteca.prestarPublicacion("L001");

        // Intentar prestar una publicación ya prestada
        System.out.println("\nIntentando prestar una publicación ya prestada:");
        biblioteca.prestarPublicacion("L001");

        // Devolver publicación
        System.out.println("\nDevolviendo publicación:");
        biblioteca.devolverPublicacion("L001");

        // Mostrar publicaciones actualizadas
        System.out.println("\nPublicaciones actualizadas:");
        biblioteca.mostrarPublicaciones();
    }
}