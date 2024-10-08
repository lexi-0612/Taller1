package ejecutables;

import Planetas.Planeta;
import Planetas.TipoDePlaneta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Planeta planeta = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 150000000,"true");

        planeta.setDensidad(planeta.getMasa()/ planeta.getVolumen());
        planeta.setDiametro((int) Math.pow( 3* planeta.getVolumen()/( 4*Math.PI), 1.0/3)*2);

        System.out.println("Nombre del planeta = " + planeta.getNombre());
        System.out.println("Cantidad de satelites = " + planeta.getSatelites() );
        System.out.println("Masa del planeta = " + planeta.getMasa());
        System.out.println("Volumen del planeta = " + planeta.getVolumen());

        System.out.println("Diametro del planeta = " + planeta.getDiametro());
        System.out.println("Distancia al sol = " + planeta.getDistancia());

        if (planeta.getDiametro() <= planeta.getTerrestre() && planeta.getDiametro() >= planeta.getEnano()){
            System.out.println("Tipo de planeta = " + TipoDePlaneta.Terrestre);
        } else {
            if (planeta.getDiametro() <= planeta.getEnano()){
                System.out.println("Tipo de planeta = " + TipoDePlaneta.Enano);
            } else {
                System.out.println("Tipo de planeta = " + TipoDePlaneta.Gaseoso);
            }
        }
        System.out.println( "Es observable = " + planeta.getObservar());
        System.out.println("Densidad del planeta = " + planeta.getDensidad());
        planeta.setVista(planeta.getDistancia()>= planeta.getUA());
        System.out.println("Es planeta exterior = " + planeta.isVista() );
    }
}