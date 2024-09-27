import java.util.ArrayList;
import java.util.List;

public class OnibusService {
    private List<Onibus> onibusList = new ArrayList<>();

    public void inserir(Onibus onibus) {
        onibusList.add(onibus);
        System.out.println("Ônibus inserido com sucesso!");
    }

    public Onibus buscar(int id) {
        for (Onibus onibus : onibusList) {
            if (onibus.getId() == id) {
                return onibus;
            }
        }
        return null; 
    }

    public void alterar(Onibus onibusAlterado) {
        for (int i = 0; i < onibusList.size(); i++) {
            if (onibusList.get(i).getId() == onibusAlterado.getId()) {
                onibusList.set(i, onibusAlterado);
                System.out.println("Ônibus alterado com sucesso!");
                return;
            }
        }
        System.out.println("Ônibus não encontrado!");
    }

    public void excluir(int id) {
        onibusList.removeIf(onibus -> onibus.getId() == id);
        System.out.println("Ônibus excluído com sucesso!");
    }
}