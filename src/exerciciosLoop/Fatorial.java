package exerciciosLoop;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, fatorial = 1, i;
        System.out.println("Insira o numero para fatorar: ");
        n = scan.nextInt();
        for (i=n;i>=1;i--)
        {
            fatorial=fatorial*i;
        }
        System.out.println("Valor de "+n+" fatorado: "+fatorial);
    }
}
