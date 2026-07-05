package gui;

import javax.swing.*;
import java.awt.*;

public class TelaLogin {

    public static void main(String[] args) {

        JFrame frame2 = new JFrame("Login");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(800, 500);
        frame2.setLocationRelativeTo(null);
        frame2.setLayout(new BorderLayout());
        frame2.setResizable(false);

        // PAINEL CENTRAL
        JPanel pCentro = new JPanel(new GridBagLayout());
        pCentro.setBackground(Color.BLACK);

        //
        JPanel p1 = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.WHITE);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
            }
        };
        p1.setOpaque(false);
        p1.setPreferredSize(new Dimension(400, 300));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 40, 5, 40);

        // Espaço topo
        gbc.gridy = 0;
        gbc.weighty = 1;
        p1.add(Box.createVerticalGlue(), gbc);

        // Título
        gbc.gridy = 1;
        gbc.weighty = 0;

        JLabel titulo = new JLabel("Digite seus dados", JLabel.CENTER);
        titulo.setFont(new Font("DM Sans", Font.BOLD, 20));
        titulo.setForeground(new Color(2, 4, 18));
        p1.add(titulo, gbc);

        // Campo Email
        gbc.gridy = 2;
        p1.add(criarCampo2("Email", "C:\\Users\\usuario\\Downloads\\Agenda_Atividade_Poo\\Imagens\\icons\\email.png"), gbc);

        // Campo Senha
        gbc.gridy = 3;
        p1.add(criarCampo2("Senha", "C:\\Users\\usuario\\Downloads\\Agenda_Atividade_Poo\\Imagens\\icons\\lock.png"), gbc);

        // Botão
        gbc.gridy = 4;
        gbc.insets = new Insets(20, 100, 10, 100);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;

        JButton botao = new JButton("ENTRAR");
        botao.setBackground(new Color(2, 4, 18));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        p1.add(botao, gbc);

        // Espaço final
        gbc.gridy = 5;
        gbc.weighty = 1;
        p1.add(Box.createVerticalGlue(), gbc);

        // ADICIONA CARD CENTRALIZADO
        pCentro.add(p1);

        frame2.add(pCentro, BorderLayout.CENTER);

        // BORDAS PRETAS
        JPanel pNorte = new JPanel();
        JPanel pSul = new JPanel();
        JPanel pLeste = new JPanel();
        JPanel pOeste = new JPanel();

        pNorte.setBackground(Color.BLACK);
        pSul.setBackground(Color.BLACK);
        pLeste.setBackground(Color.BLACK);
        pOeste.setBackground(Color.BLACK);

        pNorte.setPreferredSize(new Dimension(0, 50));
        pSul.setPreferredSize(new Dimension(0, 50));
        pLeste.setPreferredSize(new Dimension(150, 0));
        pOeste.setPreferredSize(new Dimension(150, 0));

        frame2.add(pNorte, BorderLayout.NORTH);
        frame2.add(pSul, BorderLayout.SOUTH);
        frame2.add(pLeste, BorderLayout.EAST);
        frame2.add(pOeste, BorderLayout.WEST);

        frame2.setVisible(true);
    }
    protected static JPanel criarCampo2(String texto, String caminhoIcone) {

        JPanel container = new JPanel(new BorderLayout());
        container.setOpaque(false);

        // Label
        JLabel label = new JLabel(texto);
        label.setFont(new Font("DM Sans", Font.PLAIN, 12));
        label.setForeground(new Color(2, 4, 18));
        label.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 0));

        // Painel do campo
        JPanel campoPanel = new JPanel(new BorderLayout());
        campoPanel.setBackground(new Color(220, 220, 220));
        campoPanel.setPreferredSize(new Dimension(200, 40));

        // Ícone
        ImageIcon icon = new ImageIcon(caminhoIcone);
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        campoPanel.add(iconLabel, BorderLayout.WEST);

        // Campo dinâmico
        if (texto.equalsIgnoreCase("Senha")) {

            JPasswordField pf = new JPasswordField();
            pf.setBorder(null);
            pf.setBackground(new Color(220, 220, 220));

            campoPanel.add(pf, BorderLayout.CENTER);

        } else {

            JTextField tf = new JTextField();
            tf.setBorder(null);
            tf.setBackground(new Color(220, 220, 220));

            campoPanel.add(tf, BorderLayout.CENTER);
        }

        container.add(label, BorderLayout.NORTH);
        container.add(campoPanel, BorderLayout.CENTER);

        return container;
    }
}