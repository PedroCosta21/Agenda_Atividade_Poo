import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.Collection;

public class AgendaAylaTeste {

    AgendaAyla teste = new AgendaAyla();

    @Test
    public void testaCadastroContato() {
        boolean cadastrou = teste.cadastraContato("Pedro Costa", 9, 6);
        assertTrue(cadastrou);
    }

    @Test
    public void testaPesquisaAniversariante() {
        teste.cadastraContato("Pedro Costa", 9, 6);
        Collection<Contato> contatoExiste = teste.pesquisaAniversariantes(9, 6);
        assertEquals(1, contatoExiste.size());
    }

    @Test
    public void testaRemoverContato() {
        teste.cadastraContato("Pedro Costa", 9, 6);
        boolean removeu = teste.removerContato("Pedro Costa");
        assertTrue(removeu);
    }
}