package gui;
import backendProject.*;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class TelaPrincipal extends JFrame {
    private static AgendaAyla agenda;
    public static void main(String[] args) throws URISyntaxException {

        System.setProperty(
                "jna.library.path",
                "C:\\Program Files\\VideoLAN\\VLC"
        );

        JFrame jFrame3 = new JFrame();
        jFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame3.setSize(1000, 600);
        jFrame3.setLocationRelativeTo(null);
        jFrame3.setResizable(false);
        jFrame3.setLayout(new BorderLayout());

        //Criando os Panéis das bordas
        JPanel pCentro = new JPanel();
        JPanel pNorte = new JPanel();
        JPanel pSul = new JPanel();
        JPanel pLeste = new JPanel();
        JPanel pOeste = new JPanel();

        //Tamanho dos panéis das bordas
        pNorte.setPreferredSize(new Dimension(0, 100));
        pSul.setPreferredSize(new Dimension(0, 100));
        pLeste.setPreferredSize(new Dimension(125, 0));
        pOeste.setPreferredSize(new Dimension(125, 0));

        //Cor dos panéis das bordas
        pCentro.setBackground(Color.WHITE);
        pNorte.setBackground(Color.BLACK);
        pSul.setBackground(Color.BLACK);
        pLeste.setBackground(Color.BLACK);
        pOeste.setBackground(Color.BLACK);

        //Painel Norte
        pNorte.setLayout(new BorderLayout());

        JPanel p1NNorte = new JPanel( new GridBagLayout());
        p1NNorte.setOpaque(false);

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.fill = GridBagConstraints.NONE;
        gbc1.anchor = GridBagConstraints.CENTER;
        gbc1.insets = new Insets(4, 5, 0, 5);

        gbc1.gridy = 0;
        ImageIcon imLogoAgenda = new ImageIcon(
                TelaPrincipal.class.getResource("/icones/logo_agenda.png")
        );
        Image imagem = imLogoAgenda.getImage().getScaledInstance(
                25, 25, Image.SCALE_SMOOTH
        );
        JLabel lIcone = new JLabel(new ImageIcon(imagem));
        lIcone.setHorizontalAlignment(JLabel.CENTER);
        lIcone.setBorder(BorderFactory.createEmptyBorder(0, 5 , 0, 5));
        p1NNorte.add(lIcone, gbc1);

        gbc1.gridy = 1;
        JLabel lTituloAgenda = new JLabel("AGENDA");
        lTituloAgenda.setHorizontalAlignment(JLabel.CENTER);
        lTituloAgenda.setBorder(BorderFactory.createEmptyBorder(0, 5 , 0, 5));
        lTituloAgenda.setFont(new Font("DM Sans", Font.BOLD, 15));
        lTituloAgenda.setForeground(Color.WHITE);
        p1NNorte.add(lTituloAgenda, gbc1);


        JPanel p2NSul = new JPanel(new GridBagLayout());
        p2NSul.setOpaque(false);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridy = 0;
        gbc2.insets = new Insets(0, 5, 5, 5);

        gbc2.gridx = 0;
        JButton btAgendaCompleta = new JButton("AGENDA COMPLETA");
        btAgendaCompleta.setBackground(Color.BLACK);
        btAgendaCompleta.setFont(new Font("DM Sans", Font.BOLD, 11));
        btAgendaCompleta.setForeground(Color.WHITE);
        btAgendaCompleta.setBorderPainted(false);
        btAgendaCompleta.setFocusPainted(false);
        p2NSul.add(btAgendaCompleta,  gbc2);

        gbc2.gridx = 1;
        JButton btAdicionar = new JButton("ADICIONAR");
        btAdicionar.setBackground(Color.BLACK);
        btAdicionar.setFont(new Font("DM Sans", Font.BOLD, 11));
        btAdicionar.setForeground(Color.WHITE);
        btAdicionar.setBorderPainted(false);
        btAdicionar.setFocusPainted(false);
        p2NSul.add(btAdicionar, gbc2);

        gbc2.gridx = 2;
        JButton btRemover = new JButton("REMOVER");
        btRemover.setBackground(Color.BLACK);
        btRemover.setFont(new Font("DM Sans", Font.BOLD, 11));
        btRemover.setForeground(Color.WHITE);
        btRemover.setBorderPainted(false);
        btRemover.setFocusPainted(false);
        p2NSul.add(btRemover, gbc2);

        gbc2.gridx = 3;
        JButton btPesquisarAniversariante = new JButton("PESQUISAR ANIVERSARIANTE");
        btPesquisarAniversariante.setBackground(Color.BLACK);
        btPesquisarAniversariante.setFont(new Font("DM Sans", Font.BOLD, 11));
        btPesquisarAniversariante.setForeground(Color.WHITE);
        btPesquisarAniversariante.setBorderPainted(false);
        btPesquisarAniversariante.setFocusPainted(false);
        p2NSul.add(btPesquisarAniversariante,gbc2);

        // Junta tudo verticalmente
        JPanel topo = new JPanel();
        topo.setOpaque(false);
        topo.setLayout(new BoxLayout(topo, BoxLayout.Y_AXIS));

        lIcone.setAlignmentX(Component.CENTER_ALIGNMENT);
        lTituloAgenda.setAlignmentX(Component.CENTER_ALIGNMENT);
        p2NSul.setAlignmentX(Component.CENTER_ALIGNMENT);

        topo.add(lIcone);
        topo.add(lTituloAgenda);
        topo.add(Box.createVerticalStrut(10)); // distância entre título e botões
        topo.add(p2NSul);

        pNorte.add(topo, BorderLayout.NORTH);

        //Painel Centro
        EmbeddedMediaPlayerComponent mediaPlayer =
                new EmbeddedMediaPlayerComponent();

        pCentro.setLayout(new BorderLayout());
        pCentro.add(mediaPlayer, BorderLayout.CENTER);


        //Add os panéis das bordas
        jFrame3.add(pCentro, BorderLayout.CENTER);
        jFrame3.add(pNorte, BorderLayout.NORTH);
        jFrame3.add(pSul, BorderLayout.SOUTH);
        jFrame3.add(pLeste, BorderLayout.EAST);
        jFrame3.add(pOeste, BorderLayout.WEST);


        jFrame3.setVisible(true);

        var url = TelaPrincipal.class.getResource("/videos/videos_capa_3.mp4");

        System.out.println(url); // teste

        File video = new File(url.toURI());

        mediaPlayer.mediaPlayer().media().play(video.getAbsolutePath());
        mediaPlayer.mediaPlayer().controls().setRepeat(true);
    }
}
