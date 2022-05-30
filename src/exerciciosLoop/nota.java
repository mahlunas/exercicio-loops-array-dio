package exerciciosLoop;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma nota de 0 a 10");
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota válida!");
        System.out.println("Nota: "+nota);
    }

}