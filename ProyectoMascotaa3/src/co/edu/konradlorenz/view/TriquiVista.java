package co.edu.konradlorenz.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorJuegos;
import co.edu.konradlorenz.controller.ControladorTriqui;
import co.edu.konradlorenz.model.Triqui;

public class TriquiVista extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton[] cuadros = new JButton[9];
    private JLabel lblTurnoX, lblPuntajeO, lblPuntajeX, jLabel1, jLabel2;
    private JButton BtnRegresar, BtnReiniciar;

    public TriquiVista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1018, 611);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        for (int i = 0; i < 9; i++) {
            cuadros[i] = new JButton("");
            cuadros[i].setFont(new Font("Arial", Font.PLAIN, 60));
            cuadros[i].setFocusPainted(false);
            contentPane.add(cuadros[i]);
        }

        cuadros[0].setBounds(300, 90, 110, 102);
        cuadros[1].setBounds(450, 90, 110, 102);
        cuadros[2].setBounds(600, 90, 110, 102);
        cuadros[3].setBounds(300, 230, 110, 102);
        cuadros[4].setBounds(450, 230, 110, 102);
        cuadros[5].setBounds(600, 230, 110, 102);
        cuadros[6].setBounds(300, 380, 110, 102);
        cuadros[7].setBounds(450, 380, 110, 102);
        cuadros[8].setBounds(600, 380, 110, 102);

        lblTurnoX = new JLabel("Turno: X");
        lblTurnoX.setFont(new Font("Yu Gothic", Font.BOLD, 25));
        lblTurnoX.setHorizontalAlignment(SwingConstants.CENTER);
        lblTurnoX.setBounds(212, 53, 124, 53);
        contentPane.add(lblTurnoX);

        lblPuntajeO = new JLabel("0");
        lblPuntajeO.setFont(new Font("Yu Gothic", Font.BOLD, 31));
        lblPuntajeO.setHorizontalAlignment(SwingConstants.CENTER);
        lblPuntajeO.setBounds(880, 338, 60, 60);
        contentPane.add(lblPuntajeO);

        lblPuntajeX = new JLabel("0");
        lblPuntajeX.setFont(new Font("Yu Gothic", Font.BOLD, 31));
        lblPuntajeX.setHorizontalAlignment(SwingConstants.CENTER);
        lblPuntajeX.setBounds(880, 192, 60, 60);
        contentPane.add(lblPuntajeX);

        BtnRegresar = new JButton(""); 
        BtnRegresar.setIcon(new ImageIcon(TriquiVista.class.getResource("/ICONOS/Boton atras 2.png")));
        BtnRegresar.setBounds(40, 395, 88, 95);
        BtnRegresar.setContentAreaFilled(false);
        BtnRegresar.setBorderPainted(false);
        contentPane.add(BtnRegresar);
        

        BtnReiniciar = new JButton("");
        BtnReiniciar.setIcon(new ImageIcon(TriquiVista.class.getResource("/ICONOS/reiniciar.png")));
        BtnReiniciar.setBounds(862, 40, 88, 73);
        BtnReiniciar.setContentAreaFilled(false);
        BtnReiniciar.setBorderPainted(false);
        contentPane.add(BtnReiniciar);

        jLabel2 = new JLabel("Ganador: ");
        jLabel2.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
        jLabel2.setBounds(40, 110, 150, 50);
        contentPane.add(jLabel2);

        jLabel1 = new JLabel("");
        jLabel1.setIcon(new ImageIcon(TriquiVista.class.getResource("/FONDOS/Triqui plantilla.png")));
        jLabel1.setBounds(0, 0, 990, 560);
        contentPane.add(jLabel1);
    }

    public JButton getCuadro(int index) {
        return cuadros[index];
    }

    public JLabel getLblTurnoX() {
        return lblTurnoX;
    }

    public JLabel getLblPuntajeO() {
        return lblPuntajeO;
    }

    public JLabel getLblPuntajeX() {
        return lblPuntajeX;
    }

    public JButton getBtnRegresar() {
        return BtnRegresar;
    }

    public JButton getBtnReiniciar() {
        return BtnReiniciar;
    }

    
	}