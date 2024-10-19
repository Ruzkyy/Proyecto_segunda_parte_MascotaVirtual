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
import co.edu.konradlorenz.controller.ControladorNecesidades;
import co.edu.konradlorenz.model.Mascota;
import co.edu.konradlorenz.view.AlimentacionPinguino;
import co.edu.konradlorenz.view.DormirPinguino;

public class MenuPinguino extends JFrame {
	private JPanel contentPane;
    private JLabel lblPinguino,lblFondo;
    private JButton btnEstadisticas,btnDiversion,btnAlimentar,btnDormir;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MenuPinguino frame = new MenuPinguino();                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MenuPinguino() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1046, 714);
        setResizable(false);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblPinguino = new JLabel("");
        lblPinguino.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Mascotas/pinguino_ojos_abiertos-removebg-preview.png")));
        lblPinguino.setBounds(383, 378, 285, 324);
        contentPane.add(lblPinguino);

        btnEstadisticas = new JButton("");
        btnEstadisticas.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Iconos/grafico-de-barras (1).png")));
        btnEstadisticas.setBounds(864, 482, 84, 73);
        btnEstadisticas.setOpaque(false);
        btnEstadisticas.setContentAreaFilled(false);
        btnEstadisticas.setBorderPainted(false);
        contentPane.add(btnEstadisticas);


        btnDiversion = new JButton("");
        btnDiversion.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Iconos/consola (1).png")));
        btnDiversion.setBounds(864, 378, 84, 73);
        btnDiversion.setOpaque(false);
        btnDiversion.setContentAreaFilled(false);
        btnDiversion.setBorderPainted(false);
        contentPane.add(btnDiversion);

        btnAlimentar = new JButton("");
        btnAlimentar.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Iconos/carne (1).png")));
        btnAlimentar.setBounds(864, 273, 84, 73);
        btnAlimentar.setOpaque(false);
        btnAlimentar.setContentAreaFilled(false);
        btnAlimentar.setBorderPainted(false);
        contentPane.add(btnAlimentar);

        btnDormir = new JButton("");
        btnDormir.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Iconos/cama (1).png")));
        btnDormir.setBounds(864, 172, 84, 73);
        btnDormir.setOpaque(false);
        btnDormir.setContentAreaFilled(false);
        btnDormir.setBorderPainted(false);
        contentPane.add(btnDormir);

        lblFondo = new JLabel("");
        lblFondo.setIcon(new ImageIcon(MenuPinguino.class.getResource("/Fondos/Fondo pinguino.jpg")));
        lblFondo.setBounds(0, -197, 1069, 861);
        contentPane.add(lblFondo);
    }

	public JButton getBtnEstadisticas() {
		return btnEstadisticas;
	}

	public void setBtnEstadisticas(JButton btnEstadisticas) {
		this.btnEstadisticas = btnEstadisticas;
	}

	public JButton getBtnDiversion() {
		return btnDiversion;
	}

	public void setBtnDiversion(JButton btnDiversion) {
		this.btnDiversion = btnDiversion;
	}

	public JButton getBtnAlimentar() {
		return btnAlimentar;
	}

	public void setBtnAlimentar(JButton btnAlimentar) {
		this.btnAlimentar = btnAlimentar;
	}

	public JButton getBtnDormir() {
		return btnDormir;
	}

	public void setBtnDormir(JButton btnDormir) {
		this.btnDormir = btnDormir;
	}
    

    
}