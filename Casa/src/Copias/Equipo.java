package Copias;

import java.time.LocalDate;
import java.time.Period;

// EENUM PARA LAS POSICIONES DE CADA JUGADOR 
enum Posicion {
    BASE,
    ESCOLTA,
    ALERO,
    ALA_PIVOT,
    PIVOT;
}

class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate cumpleanios;
    private Posicion posicion;
    private int partidosJugados;
    private int dosPuntos, intentoDosPuntos;
    private int tresPuntos, intentoTresPuntos;
    private int tiroLibre, intentoTiroLibre;

    public Jugador(String nombre, String apellido, LocalDate cumpleanios, Posicion posicion, int partidosJugados,
            int dosPuntos, int intentoDosPuntos, int tresPuntos, int intentoTresPuntos,
            int tiroLibre, int intentoTiroLibre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleanios = cumpleanios;
        this.posicion = posicion;
        this.partidosJugados = partidosJugados;
        this.dosPuntos = dosPuntos;
        this.intentoDosPuntos = intentoDosPuntos;
        this.tresPuntos = tresPuntos;
        this.intentoTresPuntos = intentoTresPuntos;
        this.tiroLibre = tiroLibre;
        this.intentoTiroLibre = intentoTiroLibre;
    }

    public int obtenerPuntosTotales() {
        return dosPuntos + (3 * tresPuntos) + tiroLibre;
    }

    public int calcularEdad() {
        return Period.between(cumpleanios, LocalDate.now()).getYears();
    }

    public double calcularPorcentaje(int convertidos, int intentados) {
        return intentados > 0 ? (double) convertidos / intentados * 100 : 0;
    }

    public void mostrarEstadisticasJugador() {
        System.out.println("* " + nombre + " " + apellido + " *");
        System.out.println("Edad: " + calcularEdad());
        System.out.println("Posición: " + posicion);
        System.out.println("Estadísticas");
        System.out.println("- Partidos Jugados: " + partidosJugados);
        System.out.println("- Puntos Totales: " + obtenerPuntosTotales());
        System.out.println("- Media puntos por partido: " + String.format("%,.2f", (double) obtenerPuntosTotales() / partidosJugados));
        System.out.println("- % tiros de 2 puntos: " + String.format("%,.2f", calcularPorcentaje(dosPuntos, intentoDosPuntos)) + "%");
        System.out.println("- % tiros de 3 puntos: " + String.format("%,.2f", calcularPorcentaje(tresPuntos, intentoTresPuntos)) + "%");
        System.out.println("- % tiros libres: " + String.format("%,.2f", calcularPorcentaje(tiroLibre, intentoTiroLibre)) + "%");
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getDosPuntos() {
        return dosPuntos;
    }

    public int getIntentoDosPuntos() {
        return intentoDosPuntos;
    }

    public int getTresPuntos() {
        return tresPuntos;
    }

    public int getIntentoTresPuntos() {
        return intentoTresPuntos;
    }

    public int getTiroLibre() {
        return tiroLibre;
    }

    public int getIntentoTiroLibre() {
        return intentoTiroLibre;
    }
}

public class Equipo {

    public static void main(String[] args) {
        // CREAMOS CADA UNO DE LOS JUGADORES PARA METERLOS EN EL ARRAY
        Jugador jugador1 = new Jugador("Pedro", "Porro", LocalDate.of(1990, 5, 15), Posicion.BASE, 30, 150, 250, 50, 120, 60, 80);
        Jugador jugador2 = new Jugador("Lebron", "James", LocalDate.of(1995, 8, 20), Posicion.ESCOLTA, 28, 180, 300, 70, 150, 90, 110);
        Jugador jugador3 = new Jugador("Cafucas", "Vasquez", LocalDate.of(2000, 3, 10), Posicion.PIVOT, 32, 200, 320, 90, 140, 100, 130);

        // GUARDAMOS LA INFO DE LOS JUGADORES EN UN ARRAY 
        Jugador[] jugadores = { jugador1, jugador2, jugador3 };

        // EN TODA ESTA PARTE DEL CÓDIGO CALCULAMOS LAS STATS DE EL EQUIPO
        int puntosTotales = 0, partidosTotales = 0;
        int tiros2TotalesConvertidos = 0, tiros2TotalesIntentados = 0;
        int tiros3TotalesConvertidos = 0, tiros3TotalesIntentados = 0;
        int tirosLibresTotalesConvertidos = 0, tirosLibresTotalesIntentados = 0;

        for (Jugador jugador : jugadores) {
            puntosTotales += jugador.obtenerPuntosTotales();
            partidosTotales += jugador.getPartidosJugados();
            tiros2TotalesConvertidos += jugador.getDosPuntos();
            tiros2TotalesIntentados += jugador.getIntentoDosPuntos();
            tiros3TotalesConvertidos += jugador.getTresPuntos();
            tiros3TotalesIntentados += jugador.getIntentoTresPuntos();
            tirosLibresTotalesConvertidos += jugador.getTiroLibre();
            tirosLibresTotalesIntentados += jugador.getIntentoTiroLibre();
        }

        //{--> MOSTRAMOS LAS STATS DEL EQUIPO COMPLETO
        System.out.println("*** Camilo Team ***");
        System.out.println("> Estadísticas del equipo <");
        System.out.println("- Total puntos: " + puntosTotales);
        System.out.println("- Promedio de puntos por partido: " + String.format("%,.2f", (double) puntosTotales / partidosTotales));
        System.out.println("- % tiros de 2 puntos: " + String.format("%,.2f", calcularPorcentaje(tiros2TotalesConvertidos, tiros2TotalesIntentados)) + "%");
        System.out.println("- % tiros de 3 puntos: " + String.format("%,.2f", calcularPorcentaje(tiros3TotalesConvertidos, tiros3TotalesIntentados)) + "%");
        System.out.println("- % tiros libres: " + String.format("%,.2f", calcularPorcentaje(tirosLibresTotalesConvertidos, tirosLibresTotalesIntentados)) + "%");

      
        System.out.println("\n> Jugadores <");    //{
        for (Jugador jugador : jugadores) {       //{--> MOSTRAR STATS DE CADA JUGADOR
            jugador.mostrarEstadisticasJugador(); //{
            System.out.println("");				  //{
        }
    }

    private static double calcularPorcentaje(int convertidos, int intentados) {
        return intentados > 0 ? (double) convertidos / intentados * 100 : 0;
    }
}
