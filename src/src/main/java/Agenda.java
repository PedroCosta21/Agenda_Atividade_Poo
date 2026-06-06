import java.io.IOException;
import java.util.Collection;

public interface Agenda {

    boolean cadastraContato(String nome, int dia, int mes);

    Collection<Contato> pesquisaAniversariantes(int dia, int mes);

    boolean removeContato(String nome) throws ContatoInexistenteException;

    void salvarDados() throws IOException;

    void recuperarDados() throws IOException;
}