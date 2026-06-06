import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaAyla implements Agenda {

    private Map<String, Contato> contatos;

    public AgendaAyla() {
        this.contatos = new HashMap<>();
    }

    @Override
    public void salvarDados() throws IOException {
        GravadorDeDados gravador = new GravadorDeDados();
        gravador.salvarContatos(contatos);
    }

    @Override
    public void recuperarDados() throws IOException {
        GravadorDeDados gravador = new GravadorDeDados();
        this.contatos = gravador.recuperarContatos();
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {

        if (contatos.containsKey(nome)) {
            return false;
        }

        Contato novoContato = new Contato(nome, dia, mes);
        contatos.put(nome, novoContato);

        return true;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {

        Collection<Contato> aniversariantes = new ArrayList<>();

        for (Contato c : contatos.values()) {

            if (c.getDiaAniversario() == dia &&
                    c.getMesAniversario() == mes) {

                aniversariantes.add(c);
            }
        }

        return aniversariantes;
    }

    @Override
    public boolean removeContato(String nome)
            throws ContatoInexistenteException {

        if (!contatos.containsKey(nome)) {
            throw new ContatoInexistenteException(
                    "Contato não encontrado"
            );
        }

        contatos.remove(nome);
        return true;
    }

    // método extra (não está na interface)
    public Contato pesquisaContato(String nome)
            throws ContatoInexistenteException {

        Contato contato = contatos.get(nome);

        if (contato == null) {
            throw new ContatoInexistenteException(
                    "Contato não encontrado"
            );
        }

        return contato;
    }
}