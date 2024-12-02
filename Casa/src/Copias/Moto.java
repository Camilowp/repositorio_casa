package Copias;

public class Moto extends Vehiculo2 {
    private boolean tieneABS; // Atributo específico de Moto

    // Constructor parametrizado
    public Moto(String marca, String modelo, String matricula, String combustible, boolean tieneABS) {
        super(marca, modelo, matricula, combustible); // Llamamos al constructor de la clase base
        this.tieneABS = tieneABS; // Inicializamos el atributo específico de Moto
        System.out.println("***Constructor de Moto ejecutado***");
    }

    // Sobrescribimos el método toString para incluir información de tieneABS
    @Override
    public String toString() {
        return super.toString() + ", ABS: " + (tieneABS ? "Sí" : "No");
    }

    public static void main(String[] args) {
        // Crear una instancia de Moto
        Moto m = new Moto("Yamaha", "MT-07", "1234XYZ", "Gasolina", true);

        System.out.println(m.pitar());
        System.out.println(m); // Imprimimos el contenido del toString
    }
}
