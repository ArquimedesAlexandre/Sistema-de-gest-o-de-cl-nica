/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clinica;
import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("     CLÍNICA ESCOLAR");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Marcar Consulta");
            System.out.println("3 - Ver Consultas");
            System.out.println("4 - Lista de Médicos");
            System.out.println("5 - Pagamentos");
            System.out.println("6 - Estoque de Remédios");
            System.out.println("7 - Relatórios");
            System.out.println("0 - Sair");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nPaciente cadastrado!");
                    break;

                case 2:
                    System.out.println("\nConsulta marcada!");
                    break;

                case 3:
                    System.out.println("\nMostrando consultas...");
                    break;

                case 4:
                    System.out.println("\nLista de médicos...");
                    break;

                case 5:
                    System.out.println("\nÁrea de pagamentos...");
                    break;

                case 6:
                    System.out.println("\nControle de remédios...");
                    break;

                case 7:
                    System.out.println("\nGerando relatórios...");
                    break;

                case 0:
                    System.out.println("\nSistema encerrado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
