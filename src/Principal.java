import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Alugar carro");
            System.out.println("4 - Devolver carro");
            System.out.println("5 - Listar carros disponíveis");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();
                    locadora.cadastrarCarro(new Carro(modelo, ano, cor));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    locadora.cadastrarCliente(new Cliente(nome, cpf, idade));
                    break;

                case 3:
                    System.out.print("Modelo do carro: ");
                    String modeloAlugar = sc.nextLine();
                    locadora.alugarCarro(modeloAlugar);
                    break;

                case 4:
                    System.out.print("Modelo do carro: ");
                    String modeloDevolver = sc.nextLine();
                    locadora.devolverCarro(modeloDevolver);
                    break;
                case 5:
                    locadora.listarCarrosDisponiveis();
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        sc.close();
    }
}

