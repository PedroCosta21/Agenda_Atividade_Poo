import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTeste {

    AgendaAyla teste = new AgendaAyla();

    @Test
    public void testaCadastroContato() {

        boolean cadastrou =
                teste.cadastraContato("Pedro Costa", 9, 6);

        assertTrue(cadastrou);
    }

    @Test
    public void testaPesquisaAniversariante() {

        teste.cadastraContato("Pedro Costa", 9, 6);

        Collection<Contato> contatos =
                teste.pesquisaAniversariantes(9, 6);

        assertEquals(1, contatos.size());
    }

    @Test
    public void testaRemoveContato()
            throws ContatoInexistenteException {

        teste.cadastraContato("Pedro Costa", 9, 6);

        boolean removeu =
                teste.removeContato("Pedro Costa");

        assertTrue(removeu);
    }
}