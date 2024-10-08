package ejecutables;

import Animales.*;

public class Especies {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Leon();
        animals[1] = new Lobo();
        animals[2] = new Gato();
        animals[3] = new Perro();

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Nombre:" + animals[i].getNombre());
            System.out.println("Sonido:" + animals[i].getSonido());
            System.out.println("Alimentos:" + animals[i].getAlimento());
            System.out.println("Habitad:" + animals[i].getHabitad());
            System.out.println("");
        }
    }
}
