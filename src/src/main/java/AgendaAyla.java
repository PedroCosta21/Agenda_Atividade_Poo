import java.util.*;

public class AgendaAyla {
    private Map<String, Contato> contatos;

    public AgendaAyla() {
        contatos = new HashMap<>();
    }

    public void salvarDados() {
        GravadorDeDados gravador = new GravadorDeDados();
        gravador.salvarContatos(contatos);
    }

    public void recuperarDados() {
        GravadorDeDados gravador = new GravadorDeDados();
        contatos = gravador.recuperarContatos();
    }

    public boolean cadastraContato(String nome, int dia, int mes){
        if(contatos.containsKey(nome)){
            return false;
        }else{
            Contato newContato = new Contato(nome,dia, mes);
            contatos.put(newContato.getNome(), newContato);
            return true;
        }
    }

    public Collection<Contato> pesquisaAniversariantes(int dia, int mes){
        Collection<Contato> aniversariantes = new ArrayList<>();

        for(Contato contato : contatos.values()){
            if(contato.getDiaAniversario() == dia && contato.getMesAniversario() == mes){
                aniversariantes.add(contato);
            }
        }
        return aniversariantes;
    }

    public boolean removerContato(String nome){
        if(contatos.containsKey(nome)){
            contatos.remove(nome);
            return true;
        }
        return false;
    }
    public Contato pesquisaContato(String nome) throws ContatoInexistenteException {
        if(contatos.containsKey(nome)) {
            return contatos.get(nome);
        }
        throw new ContatoInexistenteException("Contato não encontrado");
    }
}
