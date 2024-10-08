package ejecutables;

import Autos.Auto;

public class Carros {
    public static void main(String[] args) {
        Auto carro = new Auto( " Ford ", 2018, 3, 5, 6, 250, 0 );

        int acelerar1 = carro.getVactual() + (carro.getActual() + carro.getAcelerar());

        System.out.println("Marca = " + carro.getMarca());
        System.out.println("Modelo = " + carro.getModelo());
        System.out.println("Motor = " + carro.getMotor());
        System.out.println("Numero de puertas = " + carro.getNpuertas());
        System.out.println(" Cantidad de asientos = " + carro.getCasientos());
        System.out.println("Velocidad maxima = " + carro.getVmax());
        System.out.println("Velocidad actual = " + carro.getVactual());

        while ( acelerar1 < carro.getVmax()){
            if(acelerar1 < 0){
                acelerar1 = 0;

                System.out.println("Velocidad actual = " + acelerar1 + " km/h ");
                System.out.println("No se puede desacelerar en negativo");
                break;
            } else {
                System.out.println("Velocidad actual = " + acelerar1 + " km/h");
                acelerar1 = acelerar1 - carro.getDesacelerar();
            }
        }
    }
}
