package ejecutables;

import Cuentas.CuentaDeAhorro;

public class Banco {
    public static void main(String[] args) {
        CuentaDeAhorro ahorro = new CuentaDeAhorro(100000, 0.10F);

        ahorro.setNumero(50000);
        ahorro.setNumret(70000);
        int contador = 0;
        float intereses = ahorro.setTasaAnual(ahorro.getTasaAnual()/12);
        System.out.println("Saldo inicial = " + ahorro.getSaldo());
        System.out.println("Tasa de intereses = " + ahorro.getTasaAnual());

        if (ahorro.getNumero() > 0) {
            System.out.println("Cantidad a consignar = " + ahorro.getNumero());

            ahorro.setSaldo(ahorro.getNumero() + (int) ahorro.getSaldo());
            contador++;
        } else {
            System.out.println("No puedes consignar un valor negativo");

        }
        System.out.println("Cantidad a retirar = " + ahorro.getNumret());
        if (ahorro.getNumret() < ahorro.getSaldo()) {

            ahorro.setSaldo(ahorro.getSaldo() - ahorro.getNumret());
            float interes = ahorro.getSaldo()*intereses;

            System.out.println("Saldo final = " + (interes + ahorro.getSaldo()));
            contador = contador + 4;
        } else {
            System.out.println("No tienes suficiente saldo");

            }
        if (contador > 4){
            ahorro.setComisionMen((contador-4)*1000);
            System.out.println("Comision Mensual = " + ahorro.getComisionMen());
            System.out.println("Numero de transacciones = " + contador);

        }else {
            System.out.println("Comision Mensual = " + ahorro.getComisionMen());
            System.out.println("Numero de transacciones = " + contador);
        }
    }
}
