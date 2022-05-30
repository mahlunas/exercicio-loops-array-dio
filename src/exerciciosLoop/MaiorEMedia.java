package exerciciosLoop;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count;
        /*do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;
        } while(count < 5);*/

        for (count=0;count<5;count++)
        {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();
            soma=soma+numero;
            if(numero>maior)
                maior=numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
