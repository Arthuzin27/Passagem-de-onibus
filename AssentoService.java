import java.util.ArrayList;
import java.util.List;


public class AssentoService {
    private List<Assento> assentos = new ArrayList<>();

    public void inserir(Assento assento) {
        assentos.add(assento);
        System.out.println("Assento inserido com sucesso!");
    }

    public Assento buscar(int id) {
        for (Assento assento : assentos) {
            if (assento.getId() == id) {
                return assento;
            }
        }
        return null;
    }

    public void alterar(Assento assentoAlterado) {
        for (int i = 0; i < assentos.size(); i++) {
            if (assentos.get(i).getId() == assentoAlterado.getId()) {
                assentos.set(i, assentoAlterado);
                System.out.println("Assento alterado com sucesso!");
                return;
            }
        }
        System.out.println("Assento não encontrado!");
    }

    public void excluir(int id) {
        assentos.removeIf(assento -> assento.getId() == id);
        System.out.println("Assento excluído com sucesso!");
    }
}