package Cuentas;

public class Cuenta {
    private float saldo;
    private int numero;
    private int numret;
    private float tasaAnual;
    private float comisionMen;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumret() {
        return numret;
    }

    public void setNumret(int numret) {
        this.numret = numret;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public float setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
        return tasaAnual;
    }

    public float getComisionMen() {
        return comisionMen;
    }

    public void setComisionMen(float comisionMen) {
        this.comisionMen = comisionMen;
    }
}
