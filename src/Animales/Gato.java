package Animales;

public class Gato extends Felinos{
    @Override
    public String getNombre() {
        return "gordo";
    }

    @Override
    public String getSonido() {
        return "miau";
    }

    @Override
    public String getAlimento() {
        return "carne";
    }

    @Override
    public String getHabitad() {
        return "casa";
    }
}
