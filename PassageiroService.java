import java.util.ArrayList;
import java.util.List;

public class PassageiroService {
    private List<Passageiro> passageiros = new ArrayList<>();

    public void inserir(Passageiro passageiro) {
        passageiros.add(passageiro);
        System.out.println("Passageiro inserido com sucesso!");
    }

    public Passageiro buscar(int id) {
        for (Passageiro passageiro : passageiros) {
            if (passageiro.getId() == id) {
                return passageiro;
            }
        }
        return null; 
    }

    public void alterar(Passageiro passageiroAlterado) {
        for (int i = 0; i < passageiros.size(); i++) {
            if (passageiros.get(i).getId() == passageiroAlterado.getId()) {
                passageiros.set(i, passageiroAlterado);
                System.out.println("Passageiro alterado com sucesso!");
                return;
            }
        }
        System.out.println("Passageiro não encontrado!");
    }

    public void excluir(int id) {
        passageiros.removeIf(passageiro -> passageiro.getId() == id);
        System.out.println("Passageiro excluído com sucesso!");
    }
}