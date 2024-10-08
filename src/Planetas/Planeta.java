package Planetas;

public class Planeta {
    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distancia;
    private boolean vista;
    private String observar;
    private double densidad;

    int Terrestre = 20000;
    int Gaseoso = 50000;
    int Enano = 2400;

    double UA =  2.1 * 149597870;

    public Planeta(String nombre, int satelites, double masa, double volumen, int distancia, String observar) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.distancia = distancia;
        this.observar = observar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public int getTerrestre() {
        return Terrestre;
    }

    public void setTerrestre(int terrestre) {
        Terrestre = terrestre;
    }

    public int getGaseoso() {
        return Gaseoso;
    }

    public void setGaseoso(int gaseoso) {
        Gaseoso = gaseoso;
    }

    public int getEnano() {
        return Enano;
    }

    public void setEnano(int enano) {
        Enano = enano;
    }

    public String getObservar() {
        return observar;
    }

    public void setObservar(String observar) {
        this.observar = observar;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getUA() {
        return UA;
    }

    public void setUA(double UA) {
        this.UA = UA;
    }
}

