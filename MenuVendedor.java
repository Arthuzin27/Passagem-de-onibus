import java.util.Scanner;

public class MenuVendedor {
    private VendedorService vendedorService = new VendedorService();

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Vendedor");
            System.out.println("1. Inserir Vendedor");
            System.out.println("2. Buscar Vendedor");
            System.out.println("3. Alterar Vendedor");
            System.out.println("4. Excluir Vendedor");
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