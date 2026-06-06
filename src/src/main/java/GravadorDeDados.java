import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    private static final String ARQUIVO_CONTATOS = "contatos.dat";

    // salva os contatos no arquivo
    public void salvarContatos(Map<String, Contato> contatos) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_CONTATOS));
            out.writeObject(contatos);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // recupera os contatos do arquivo
    public HashMap<String, Contato> recuperarContatos() {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS));
            HashMap<String, Contato> contatos = (HashMap<String, Contato>) in.readObject();
            in.close();
            return contatos;
        } catch (IOException e) {
            // se o arquivo não existir ainda
            return new HashMap<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}