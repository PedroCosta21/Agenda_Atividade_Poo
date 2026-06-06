import java.io.Serializable;
import java.util.Objects;

public class Contato implements Serializable {

    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, int mesAniversario) {
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    @Override
    public String toString() {
        return nome + " - " +
                diaAniversario + "/" +
                mesAniversario;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Contato)) return false;

        Contato contato = (Contato) o;

        return diaAniversario == contato.diaAniversario
                && mesAniversario == contato.mesAniversario
                && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, diaAniversario, mesAniversario);
    }
}