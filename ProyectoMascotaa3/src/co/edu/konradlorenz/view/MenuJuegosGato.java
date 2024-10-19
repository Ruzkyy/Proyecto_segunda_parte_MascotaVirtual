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

public class MenuJuegosGato extends JFrame {
    private JPanel contentPane;
    private JButton btnTriqui, BtnHerramientaC, btnNumero, btnAtras;
    private JLabel jLabel4;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MenuJuegosGato frame = new MenuJuegosGato();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MenuJuegosGato() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1010, 560);
        setResizable(false);       
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnTriqui = new JButton("");
        btnTriqui.setIcon(new ImageIcon(MenuJuegosGato.class.getResource("/ICONOS/Boton Triqui.png")));
        btnTriqui.setBounds(150, 180, 200, 200);
        btnTriqui.setContentAreaFilled(false);
        btnTriqui.setBorderPainted(false);
        contentPane.add(btnTriqui);

        BtnHerramientaC = new JButton("");
        BtnHerramientaC.setIcon(new ImageIcon(MenuJuegosGato.class.getResource("/ICONOS/Boton Calculadora.png")));
        BtnHerramientaC.setBounds(650, 180, 200, 210);
        BtnHerramientaC.setContentAreaFilled(false);
        BtnHerramientaC.setBorderPainted(false);
        contentPane.add(BtnHerramientaC);

        btnNumero = new JButton("");
        btnNumero.setIcon(new ImageIcon(MenuJuegosGato.class.getResource("/ICONOS/Boton Numeros.png")));
        btnNumero.setBounds(390, 180, 220, 210);
        btnNumero.setContentAreaFilled(false);
        btnNumero.setBorderPainted(false);
        contentPane.add(btnNumero);

        btnAtras = new JButton("");
        btnAtras.setIcon(new ImageIcon(MenuJuegosGato.class.getResource("/ICONOS/Boton atras 2.png")));
        btnAtras.setBounds(40, 421, 86, 85);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);
        contentPane.add(btnAtras);

        jLabel4 = new JLabel("");
        jLabel4.setIcon(new ImageIcon(MenuJuegosGato.class.getResource("/FONDOS/Juegos fondo.png")));
        jLabel4.setBounds(0, 0, 1010, 560);
        contentPane.add(jLabel4);
    }

	public JButton getBtnTriqui() {
		return btnTriqui;
	}

	public void setBtnTriqui(JButton btnTriqui) {
		this.btnTriqui = btnTriqui;
	}

	public JButton getBtnHerramientaC() {
		return BtnHerramientaC;
	}

	public void setBtnHerramientaC(JButton btnHerramientaC) {
		BtnHerramientaC = btnHerramientaC;
	}

	public JButton getBtnNumero() {
		return btnNumero;
	}

	public void setBtnNumero(JButton btnNumero) {
		this.btnNumero = btnNumero;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
    
}



