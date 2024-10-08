package Autos;

public class Auto {
    private String Marca;
    private int Modelo;
    private int Motor;
    private int Npuertas;
    private int Casientos;
    private int  Vmax;
    private int Vactual;

    int Actual = 100;
    int Acelerar = 20;
    int Desacelerar = 50;


    public Auto(String marca, int modelo, int motor, int npuertas, int casientos, int vmax, int vactual) {
        Marca = marca;
        Modelo = modelo;
        Motor = motor;
        Npuertas = npuertas;
        Casientos = casientos;
        Vmax = vmax;
        Vactual = vactual;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public int getMotor() {
        return Motor;
    }

    public void setMotor(int motor) {
        Motor = motor;
    }

    public int getNpuertas() {
        return Npuertas;
    }

    public void setNpuertas(int npuertas) {
        Npuertas = npuertas;
    }

    public int getCasientos() {
        return Casientos;
    }

    public void setCasientos(int casientos) {
        Casientos = casientos;
    }

    public int getVmax() {
        return Vmax;
    }

    public void setVmax(int vmax) {
        Vmax = vmax;
    }

    public int getVactual() {
        return Vactual;
    }

    public void setVactual(int vactual) {
        Vactual = vactual;
    }

    public int getActual() {
        return Actual;
    }

    public void setActual(int actual) {
        Actual = actual;
    }

    public int getAcelerar() {
        return Acelerar;
    }

    public void setAcelerar(int acelerar) {
        Acelerar = acelerar;
    }

    public int getDesacelerar() {
        return Desacelerar;
    }

    public void setDesacelerar(int desacelerar) {
        Desacelerar = desacelerar;
    }
}

