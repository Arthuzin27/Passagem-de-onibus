import java.util.ArrayList;
import java.util.List;

public class ViagemService {
    private List<Viagem> viagens = new ArrayList<>();

    public void inserir(Viagem viagem) {
        viagens.add(viagem);
        System.out.println("Viagem inserida com sucesso!");
    }

    public Viagem buscar(int id) {
        for (Viagem viagem : viagens) {
            if (viagem.getId() == id) {
                return viagem;
            }
        }
        return null; // Não encontrado
    }

    public void alterar(Viagem viagemAlterada) {
        for (int i = 0; i < viagens.size(); i++) {
            if (viagens.get(i).getId() == viagemAlterada.getId()) {
                viagens.set(i, viagemAlterada);
                System.out.println("Viagem alterada com sucesso!");
                return;
            }
        }
        System.out.println("Viagem não encontrada!");
    }

    public void excluir(int id) {
        viagens.removeIf(viagem -> viagem.getId() == id);
        System.out.println("Viagem excluída com sucesso!");
    }
}