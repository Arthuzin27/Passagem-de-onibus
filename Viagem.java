public class Viagem {
    public int id;
    public int id_onibus;
    public String cidade_origem;
    public String data_saida;
    public String horario_saida;
    public String cidade_destino;
    public String data_chegada;
    public String horario_previsto_chegada;
    public byte tinyint = 1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_onibus() {
        return id_onibus;
    }

    public void setId_onibus(int id_onibus) {
        this.id_onibus = id_onibus;
    }

    public String getCidade_origem() {
        return cidade_origem;
    }

    public void setCidade_origem(String cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public String getHorario_saida() {
        return horario_saida;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }

    public String getCidade_destino() {
        return cidade_destino;
    }

    public void setCidade_destino(String cidade_destino) {
        this.cidade_destino = cidade_destino;
    }

    public String getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(String data_chegada) {
        this.data_chegada = data_chegada;
    }

    public String getHorario_previsto_chegada() {
        return horario_previsto_chegada;
    }

    public void setHorario_previsto_chegada(String horario_previsto_chegada) {
        this.horario_previsto_chegada = horario_previsto_chegada;
    }

    public byte getTinyint() {
        return tinyint;
    }

    public void setTinyint(byte tinyint) {
        this.tinyint = tinyint;
    } 
}
