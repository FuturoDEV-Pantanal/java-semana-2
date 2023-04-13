import Oficina.Carro;
import Oficina.Mecanico;
import Oficina.OficinaMecanica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instanciando objeto do tipo OficinaMecanica
        OficinaMecanica oficina = new OficinaMecanica("Café");

        //inicializar o Scanner para receber inputs.
        Scanner dados = new Scanner(System.in);

        // Modulo de registro dos Mecanicos.
        //interação inicial com usuário
        System.out.println("Olá, insira os dados do mecânico.");
        System.out.println("Nome: ");
        //coleta do dado "nome"                 //coleta o dado e limpa o buffer.
        Mecanico mecanico1 = new Mecanico(dados.nextLine());
        //registro do mecanico no sistema da oficina
        oficina.registrarMecanico(mecanico1);
        System.out.println("Olá, insira os dados do mecânico.");
        System.out.println("Nome: ");
        Mecanico mecanico2 = new Mecanico(dados.nextLine());
        oficina.registrarMecanico(mecanico2);


        //registro dos carros e atribuição dos mecânicos.
        boolean continuar = true; //flag do while loop.
        while (continuar) {
            System.out.println("Digite o modelo do carro. Ou [sair] ");
            String modelo = dados.nextLine();
            if (modelo.equalsIgnoreCase("sair")) {
                continuar = false;
                break;
            }
            System.out.println("Digite a placa do carro.");
            String placa = dados.nextLine();
            //instanciamento do objeto do tipo Carro
            Carro carro = new Carro(modelo, placa);

            //registro do carro na oficina
            oficina.registrarCarro(carro);

            //atribuição do mecânico responsável pela manutenção do carro
            System.out.println("Informe o mecânico responsável");
            System.out.println("-------------------------------");
            System.out.println("1. " + mecanico1.getNome());
            System.out.println("2. " + mecanico2.getNome());
            System.out.println("-------------------------------");
            int opcao = dados.nextInt();
            dados.nextLine();
            System.out.println();

            //atribuindo o mecanico ao carro.
            switch (opcao) {
                case 1:
                    oficina.atribuirMecanico(carro, mecanico1);
                    break;
                case 2:
                    oficina.atribuirMecanico(carro, mecanico2);
                default:
                    System.out.println("Opção inválida.");
            }
        }
        //dashboard de exibição da informação sobre carros e mecânicos resposáveis
        System.out.println("-------------------------------");
        System.out.println("\t | Carros em manutenção |");
        System.out.println("-------------------------------");
        for (Carro cr : oficina.getCarros())
            System.out.println("Modelo: " + cr.getModelo() +
                    "|" + "Placa: " + cr.getPlaca() +
                    "|" + "Mecanico: " + cr.getMecanico().getNome());


        }

    }
