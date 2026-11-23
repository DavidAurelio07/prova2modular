package pm_prova_m;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String placa,modelo;
        int anoFabricacao;
        double valorDiaria;
        double quilometragem;
        StatusVeiculo status;
        
        Veiculo v1 = new Veiculo(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status,quantMaxPassageiro);

    }


    private static void exibirMenu() {
        System.out.println("\n===== Veiculos Menu =====");
        System.out.println("1 - Associar Veiculo  a um Aluguel");
        System.out.println("2 - Exibir todos os veículos cadastrados");
        System.out.println("3 - Exibir exibir alugueis cadastrados ");
        System.out.println("4 - Exibir Veiculos  ativos");
        System.out.println("4 - Avaliar objetos avaliaveis");
        System.out.println("4 - Realiza inspeção");
        System.out.println("5 - Remover Veiculos em manutenção");
        System.out.println("0 - Sair");
    }

    

}
