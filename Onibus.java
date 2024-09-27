public class Onibus {
    public int id;
    public String placa;
    public int quantidade_assento;
    public byte tinyint = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidade_assento() {
        return quantidade_assento;
    }

    public void setQuantidade_assento(int quantidade_assento) {
        this.quantidade_assento = quantidade_assento;
    }

    public byte getTinyint() {
        return tinyint;
    }

    public void setTinyint(byte tinyint) {
        this.tinyint = tinyint;
    } 
}
