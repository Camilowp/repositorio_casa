package HerenciaCuentasBancarias;

import java.time.LocalDate;

public abstract class Cuentas {
    protected String titular;
    protected double saldo;
    protected int numeroCuenta;
    protected LocalDate fechaApertura;

    public Cuentas(String titular, double saldo, int numeroCuenta, LocalDate fechaApertura) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser mayor a cero.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        System.out.println(" Saldo insuficiente.");
        return false;
    }

    public abstract void detalles();
}
