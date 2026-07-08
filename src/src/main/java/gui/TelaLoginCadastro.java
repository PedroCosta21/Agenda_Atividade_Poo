package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class TelaLoginCadastro {
    public static void main(String[] args) {

        JFrame frame1 = new JFrame("Login/Cadastro");
        frame1.setSize(800, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setLayout(new BorderLayout());

        // Painéis
        JPanel pCentro = new JPanel();
        JPanel pNorte = new JPanel();
        JPanel pSul = new JPanel();
        JPanel pLeste = new JPanel();
        JPanel pOeste = new JPanel();

        // CENTRO dividido
        pCentro.setLayout(new GridLayout(1, 2));

        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        p1.setBackground(new Color(2, 4, 18));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Espaço topo
        gbc.gridy = 0;
        gbc.weighty = 3; // maior espaço
        p1.add(Box.createVerticalGlue(), gbc);

        // Título
        gbc.gridy = 1;
        gbc.weighty = 1;
        JLabel titulo = new JLabel("Bem vindo!");
        titulo.setFont(new Font("DM Sans", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(titulo, gbc);

        // Texto
        gbc.gridy = 2;
        gbc.weighty = 1;
        JLabel texto = new JLabel("<html><center>Para se conectar conosco<br>faça login</center></html>");
        texto.setFont(new Font("DM Sans", Font.BOLD, 15));
        texto.setForeground(Color.WHITE);
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(texto, gbc);

        // Espaço
        gbc.gridy = 2;
        gbc.weighty = 1;
        p1.add(Box.createVerticalGlue(), gbc);

        // Botão
        gbc.gridy = 3;
        gbc.weighty = 1;
        JButton botao = new JButton("ENTRAR");
        botao.setFont(new Font("DM Sans", Font.BOLD, 11));
        botao.setForeground(new Color(2,4,18));
        botao.setBackground(Color.WHITE);
        p1.add(botao, gbc);

        // Espaço final
        gbc.gridy = 5;
        gbc.weighty = 2;
        p1.add(Box.createVerticalGlue(), gbc);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridBagLayout());
        p2.setBackground(Color.WHITE);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.insets = new Insets(5, 40, 5, 40); // margem lateral

        //Espaço topo
        gbc2.gridy = 0;
        gbc2.weighty = 2;
        p2.add(Box.createVerticalGlue(), gbc2);

        //Título
        gbc2.gridy = 1;
        gbc2.weighty = 0;

        JLabel lTitulo2 = new JLabel("Bem Vindo!");
        lTitulo2.setFont(new Font("DM Sans", Font.BOLD, 23));
        lTitulo2.setForeground(new Color(2,4,18));
        lTitulo2.setHorizontalAlignment(SwingConstants.CENTER);

        p2.add(lTitulo2, gbc2);

        //Subtítulo
        gbc2.gridy = 2;

        JLabel lTexto2 = new JLabel("Registre-se com seu email");
        lTexto2.setFont(new Font("DM Sans", Font.PLAIN, 12));
        lTexto2.setHorizontalAlignment(SwingConstants.CENTER);

        p2.add(lTexto2, gbc2);

        // Campo Nome
        gbc2.gridy = 3;
        p2.add(criarCampo("Nome","C:\\Users\\usuario\\Downloads\\Agenda_Atividade_Poo\\Imagens\\icons\\user.png"), gbc2);

        //Campo Email
        gbc2.gridy = 4;
        p2.add(criarCampo("Email", "C:\\Users\\usuario\\Downloads\\Agenda_Atividade_Poo\\Imagens\\icons\\email.png"), gbc2);

        //Campo Senha
        gbc2.gridy = 5;
        p2.add(criarCampo("Senha","C:\\Users\\usuario\\Downloads\\Agenda_Atividade_Poo\\Imagens\\icons\\lock.png"), gbc2);

        //Botão
        gbc2.gridy = 6;
        gbc2.insets = new Insets(15, 100, 15, 100);

        JButton btBotao2 = new JButton("REGISTRE-SE");
        btBotao2.setBackground(new Color(2,4,18));
        btBotao2.setForeground(Color.WHITE);

        p2.add(btBotao2, gbc2);

        // Espaço final
        gbc2.gridy = 7;
        gbc2.weighty = 2;
        p2.add(Box.createVerticalGlue(), gbc2);

        pCentro.add(p1);
        pCentro.add(p2);

        // BORDAS pretas
        pNorte.setBackground(Color.BLACK);
        pNorte.setPreferredSize(new Dimension(0, 50));

        pSul.setBackground(Color.BLACK);
        pSul.setPreferredSize(new Dimension(0, 50));

        pLeste.setBackground(Color.BLACK);
        pLeste.setPreferredSize(new Dimension(50, 0));

        pOeste.setBackground(Color.BLACK);
        pOeste.setPreferredSize(new Dimension(50, 0));

        // Adicionando corretamente
        frame1.add(pNorte, BorderLayout.NORTH);
        frame1.add(pSul, BorderLayout.SOUTH);
        frame1.add(pLeste, BorderLayout.EAST);
        frame1.add(pOeste, BorderLayout.WEST);
        frame1.add(pCentro, BorderLayout.CENTER);


        frame1.setVisible(true);
    }
    protected static JPanel criarCampo(String texto, String caminhoIcone) {

        // Container geral (Label + Campo)
        JPanel container = new JPanel(new BorderLayout());
        container.setOpaque(false);

        // Label FIXO (não some)
        JLabel label = new JLabel(texto);
        label.setFont(new Font("DM Sans", Font.PLAIN, 12));
        label.setForeground(new Color(2,4,18));
        label.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 0));

        // Painel do campo (ícone + input)
        JPanel campoPanel = new JPanel(new BorderLayout());
        campoPanel.setBackground(new Color(220, 220, 220));
        campoPanel.setPreferredSize(new Dimension(200, 40));

        // Ícone
        ImageIcon icon = new ImageIcon(caminhoIcone);
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        campoPanel.add(iconLabel, BorderLayout.WEST);

        // CAMPO DINÂMICO (TEXTO OU SENHA)
        if (texto.equalsIgnoreCase("Senha")) {

            JPasswordField pfCampo = new JPasswordField();
            pfCampo.setBorder(null);
            pfCampo.setBackground(new Color(220, 220, 220));

            campoPanel.add(pfCampo, BorderLayout.CENTER);

        } else {

            JTextField tfCampo = new JTextField();
            tfCampo.setBorder(null);
            tfCampo.setBackground(new Color(220, 220, 220));

            campoPanel.add(tfCampo, BorderLayout.CENTER);
        }

        // Montagem final
        container.add(label, BorderLayout.NORTH);
        container.add(campoPanel, BorderLayout.CENTER);

        return container;
    }
}