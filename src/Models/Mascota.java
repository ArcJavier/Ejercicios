package Models;

import java.util.Scanner;

public class Mascota {
    private String nombre;

    public Mascota() {
    }
    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Scanner mascota = new Scanner(System.in);
        String[][] mascotas = new String[4][4];

        System.out.println("Ingrese los nombres de las 16 mascotas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Mascota [" + i + "][" + j + "]: ");
                mascotas[i][j] = mascota.nextLine();
            }
        }
        // Mostrar las mascotas en posiciones impares
        System.out.println("\nMascotas en filas y columnas con índices impares:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Mostrar solo si ambos índices son impares (1 y 3)
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print(mascotas[i][j] + "\t");
                } else {
                    System.out.print("-\t"); // Mostrar guión para posiciones no impares
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        // Versión alternativa mostrando solo las posiciones impares (sin guiones)
        System.out.println("\nSolo las mascotas en posiciones impares:");
        for (int i = 1; i < 4; i += 2) {
            for (int j = 1; j < 4; j += 2) {
                System.out.print(mascotas[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
