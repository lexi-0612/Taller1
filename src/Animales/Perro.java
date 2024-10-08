package Animales;

public class Perro extends Caninos{
    @Override
    public String getNombre() {
        return "pancho";
    }

    @Override
    public String getSonido() {
        return "guau";
    }

    @Override
    public String getAlimento() {
        return "croquetas";
    }

    @Override
    public String getHabitad() {
        return "casa";
    }
}
