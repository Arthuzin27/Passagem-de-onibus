import java.util.ArrayList;
import java.util.List;

public class PassagemService {
    private List<Passagem> passagens = new ArrayList<>();

    public void inserir(Passagem passagem) {
        passagens.add(passagem);
        System.out.println("Passagem inserida com sucesso!");
    }

    public Passagem buscar(int id) {
        for (Passagem passagem : passagens) {
            if (passagem.getId() == id) {
                return passagem;
            }
        }
        return null; 

    public void alterar(Passagem passagemAlterada) {
        for (int i = 0; i < passagens.size(); i++) {
            if (passagens.get(i).getId() == passagemAlterada.getId()) {
                passagens.set(i, passagemAlterada);
                System.out.println("Passagem alterada com sucesso!");
                return;
            }
        }
        System.out.println("Passagem não encontrada!");
    }

    public void excluir(int id) {
        passagens.removeIf(passagem -> passagem.getId() == id);
        System.out.println("Passagem excluída com sucesso!");
    }
}