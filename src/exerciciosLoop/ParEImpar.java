package exerciciosLoop;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, num, quantidadePares = 0, quantidadeImpares = 0, i;
        System.out.println("Insira a quantidade de numeros a sere, lidos");
        n = scan.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            if (num % 2 == 0)
                quantidadePares++;
            else
                quantidadeImpares++;
        }
        /* i=0;
        do{
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            if (num % 2 == 0)
                quantidadePares++;
            else
                quantidadeImpares++;
            i++;
        }while(i<n);
         */
        System.out.println("Quantidade de pares: "+quantidadePares);
        System.out.println("Quantidade de impares: "+quantidadeImpares);
    }
}
