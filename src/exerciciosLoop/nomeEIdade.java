package exerciciosLoop;

import java.util.Scanner;

public class nomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while (true)
        {
            System.out.println("Insira o nome: ");
            nome = scan.next();

            if (nome.equals("0"))
            {
                break;
            }
            System.out.println("Insira a idade: ");
            idade = scan.nextInt();

            System.out.println("Nome do aluno: "+nome+" Idade do aluno: "+idade);
        }
    }
}
