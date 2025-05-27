package Models;

import java.util.Scanner;

public class Solicitud {
    private int numero;

    public Solicitud() {
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static void main(String[] args) {
        Scanner NumImpar = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo entero:");
        int numero = Integer.parseInt(NumImpar.nextLine());
        System.out.println("Números impares entre 0 y " + NumImpar + ":");

        int i = 1;
        while (i <= numero) {
            System.out.print(i + " ");
            i += 2; // Saltar al siguiente número impar
        }
    }
}
