package Models;

import java.util.Scanner;

public class Examen {

    private int Correcto;
    private  int Incorrecto;
    private int vacio;
    private int Resultado;
    private double Porcentaje;

    public Examen() {

    }

    public int getCorrecto() {
        return Correcto;
    }

    public void setCorrecto(int correcto) {
        Correcto = correcto;
    }

    public int getIncorrecto() {
        return Incorrecto;
    }

    public void setIncorrecto(int incorrecto) {
        Incorrecto = incorrecto;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int resultado) {
        Resultado = resultado;
    }

    public int getVacio() {
        return vacio;
    }

    public void setVacio(int vacio) {
        this.vacio = vacio;
    }
    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        Porcentaje = porcentaje;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        System.out.println("Escriba la cantidad de respuestas correctas:");
        int Correcto = Integer.parseInt(entrada.nextLine());

        System.out.println("Escriba la cantidad de respuestas Incorrectas:");
        int Incorrecto = Integer.parseInt(entrada.nextLine());

        System.out.println("Escriba la cantidad de respuestas Vacias:");
        int Vacio = Integer.parseInt(entrada.nextLine());

        int Resultado = (Correcto * 5) + (Incorrecto * -2) + (Vacio * 0);
        double Porcentaje = (Resultado / 50.0) * 100;

        System.out.println("Porcentaje obtenido: " + Porcentaje + "%");

    }

}

