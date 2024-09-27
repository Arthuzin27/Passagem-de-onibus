import java.util.Scanner;

public class MenuPassageiro {
    private PassageiroService passageiroService = new PassageiroService();

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Passageiro");
            System.out.println("1. Inserir Passageiro");
            System.out.println("2. Buscar Passageiro");
            System.out.println("3. Alterar Passageiro");
            System.out.println("4. Excluir Passageiro");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}