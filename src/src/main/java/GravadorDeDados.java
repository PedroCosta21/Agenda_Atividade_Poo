import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    public static final String ARQUIVO_CONTATOS =
            "contatos.dat";

    public void salvarContatos(Map<String, Contato> contatos)
            throws IOException {

        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream(ARQUIVO_CONTATOS)
                );

        out.writeObject(contatos);

        out.close();
    }

    @SuppressWarnings("unchecked")
    public HashMap<String, Contato> recuperarContatos()
            throws IOException {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream(ARQUIVO_CONTATOS)
                    );

            HashMap<String, Contato> contatos =
                    (HashMap<String, Contato>) in.readObject();

            in.close();

            return contatos;

        } catch (ClassNotFoundException e) {

            throw new IOException(
                    "Erro ao recuperar contatos",
                    e
            );
        }
    }
}