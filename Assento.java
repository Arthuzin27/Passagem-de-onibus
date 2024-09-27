
public class Assento {
    public int id;
    public int id_onibus;
    public int numero;
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
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public byte getTinyint() {
        return tinyint;
    }

    public void setTinyint(byte tinyint) {
        this.tinyint = tinyint;
    } 
}
