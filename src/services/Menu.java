package services;

import java.util.Scanner;

public class Menu {

    public int showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. Cadastrar um novo pet");
        System.out.println("2. Listar pets por algum critério (idade, nome, raça)");
        System.out.println("3. Deletar um pet cadastrado");
        System.out.println("4. Listar todos os pets cadastrados");
        System.out.println("5. Alterar os dados do pet cadastrados");
        System.out.println("6. Sair");

        int choice = validOptions(input);
        return choice;
    }

    public static int validOptions(Scanner input) {
        while(true) {
            if (input.hasNextInt()) {
                int num = input.nextInt();
                input.nextLine();
                if (num >= 1 && num <= 6) {
                    return num;
                } else {
                    System.out.println("Opção inválida! Escolha um número de 1 a 6");
                }
            } else {
                System.out.println("Opção inválida! Digite apenas números");
                input.nextLine();
            }
        }
    }
}
