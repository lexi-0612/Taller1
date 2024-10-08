package Cuentas;

public class CuentaCorriente extends Cuenta{
    float sobregiro;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
}
