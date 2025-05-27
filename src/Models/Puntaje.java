package Models;

import java.util.Scanner;

public class Puntaje {
    private int punto;

    public Puntaje() {
    }

    public Puntaje(int punto) {
        this.punto = punto;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public static void main(String[] args) {
        Scanner rango = new Scanner(System.in);

        System.out.println("Ingrese su cantidad de puntos:");
        int numero = Integer.parseInt(rango.nextLine());

        if (numero < 1000){
            System.out.println("Tu rango como cliente en Bronce");
        }
        else if (numero >= 1000 && numero < 3000 ) {
            System.out.println("Tu rango como cliente es Plata");
        }
        else if (numero >= 3000){
            System.out.println("Tu rango como cliente es Oro");
        }
    }
}
