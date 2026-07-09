package backendProject;

import java.io.IOException;
import java.util.List;

/**
 * Representa o Tipo Abstrato de Dado (TAD) de uma agenda de contatos.
 *
 * Esta interface define as principais operações disponíveis
 * para manipulação da agenda, sem especificar como elas serão
 * implementadas.
 *
 * @author Pedro Henrique
 */
public interface Agenda {

    /**
     * Cadastra um novo contato na agenda.
     *
     * @param nome Nome do contato.
     * @param diaAniversario Dia do aniversário.
     * @param mesAniversario Mês do aniversário.
     */
    void cadastraContato(String nome, int diaAniversario, int mesAniversario);

    /**
     * Remove um contato da agenda.
     *
     * @param nome Nome do contato.
     * @return true se o contato foi removido.
     * @throws ContatoInexistenteException caso o contato não exista.
     */
    boolean removeContato(String nome) throws ContatoInexistenteException;

    /**
     * Pesquisa todos os contatos que fazem aniversário
     * em uma determinada data.
     *
     * @param dia Dia do aniversário.
     * @param mes Mês do aniversário.
     * @return Lista de contatos encontrados.
     */
    List<Contato> pesquisaAniversariantes(int dia, int mes);

    /**
     * Salva todos os contatos em arquivo.
     *
     * @throws IOException caso ocorra erro de gravação.
     */
    void salvarDados() throws IOException;

    /**
     * Recupera os contatos gravados anteriormente.
     *
     * @throws IOException caso ocorra erro na leitura.
     */
    void recuperarDados() throws IOException;
}