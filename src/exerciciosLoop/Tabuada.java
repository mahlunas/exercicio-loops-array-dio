package exerciciosLoop;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i;
        System.out.println("Insira o numero que deseja ver a tabuada");
        n = scan.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
