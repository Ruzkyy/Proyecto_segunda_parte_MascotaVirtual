package co.edu.konradlorenz.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import co.edu.konradlorenz.controller.ControladorJuegos;
import co.edu.konradlorenz.model.Mascota;
import co.edu.konradlorenz.view.NavigationManager;

public class MenuJuegos extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnTriqui, BtnHerramientaC, btnNumero, btnAtras;
    private JLabel jLabel4;
    private ControladorJuegos controlador;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MenuJuegos frame = new MenuJuegos();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MenuJuegos( ) {
        this.controlador = controlador;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1010, 560);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnTriqui = new JButton("");
        btnTriqui.setIcon(new ImageIcon(MenuJuegos.class.getResource("/ICONOS/Boton Triqui.png")));
        btnTriqui.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.jugarTriqui(MenuJuegos.this);
            }
        });
        btnTriqui.setBounds(150, 180, 200, 210);
        contentPane.add(btnTriqui);

        BtnHerramientaC = new JButton("");
        BtnHerramientaC.setIcon(new ImageIcon(MenuJuegos.class.getResource("/ICONOS/Boton Calculadora.png")));
        BtnHerramientaC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.jugarCalculadora(MenuJuegos.this);
            }
        });
        BtnHerramientaC.setBounds(650, 180, 200, 210);
        contentPane.add(BtnHerramientaC);

        btnNumero = new JButton("");
        btnNumero.setIcon(new ImageIcon(MenuJuegos.class.getResource("/ICONOS/Boton Numeros.png")));
        btnNumero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                controlador.jugarNumeros(MenuJuegos.this);
            }
        });
        btnNumero.setBounds(390, 180, 220, 210);
        contentPane.add(btnNumero);

        btnAtras = new JButton("");
        btnAtras.setIcon(new ImageIcon(MenuJuegos.class.getResource("/ICONOS/Boton atras 2.png")));
        // Usa el NavigationManager para navegar hacia atrás
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NavigationManager.navigateBack(MenuJuegos.this);
            }
        });
        btnAtras.setBounds(40, 421, 86, 79);
        contentPane.add(btnAtras);

        jLabel4 = new JLabel("");
        jLabel4.setIcon(new ImageIcon(MenuJuegos.class.getResource("/FONDOS/Juegos fondo.png")));
        jLabel4.setBounds(0, 0, 1010, 560);
        contentPane.add(jLabel4);
    }
}



