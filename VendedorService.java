import java.util.ArrayList;
import java.util.List;

public class VendedorService {
    private List<Vendedor> vendedores = new ArrayList<>();

    public void inserir(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor inserido com sucesso!");
    }

    public Vendedor buscar(int id) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getId() == id) {
                return vendedor;
            }
        }
        return null; // Não encontrado
    }

    public void alterar(Vendedor vendedorAlterado) {
        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i).getId() == vendedorAlterado.getId()) {
                vendedores.set(i, vendedorAlterado);
                System.out.println("Vendedor alterado com sucesso!");
                return;
            }
        }
        System.out.println("Vendedor não encontrado!");
    }

    public void excluir(int id) {
        vendedores.removeIf(vendedor -> vendedor.getId() == id);
        System.out.println("Vendedor excluído com sucesso!");
    }
}