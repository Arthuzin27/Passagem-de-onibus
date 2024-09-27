import java.util.Scanner;

public class MenuViagem {
    private ViagemService viagemService = new ViagemService();

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Viagem");
            System.out.println("1. Inserir Viagem");
            System.out.println("2. Buscar Viagem");
            System.out.println("3. Alterar Viagem");
            System.out.println("4. Excluir Viagem");
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