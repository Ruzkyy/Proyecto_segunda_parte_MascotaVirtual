package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorIngresar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EleccionMascotas extends JFrame {
    private JButton btnPinguino; 
    private JButton btnPerro; 
    private JButton btnGato;
    private JButton btnZorro; 
    private JLabel lblTexto;
    private JLabel lblNewLabel;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EleccionMascotas frame = new EleccionMascotas();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EleccionMascotas() {
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1287, 771);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnPinguino = new JButton("");
        btnPinguino.setBounds(791, 422, 241, 198);
        btnPinguino.setOpaque(false);
        btnPinguino.setContentAreaFilled(false);
        btnPinguino.setBorderPainted(false);
        contentPane.add(btnPinguino);

        btnPerro = new JButton("");
        btnPerro.setBounds(805, 117, 206, 203);
        btnPerro.setOpaque(false);
        btnPerro.setContentAreaFilled(false);
        btnPerro.setBorderPainted(false);
        contentPane.add(btnPerro);

        btnGato = new JButton("");
        btnGato.setBounds(260, 442, 230, 196);
        btnGato.setOpaque(false);
        btnGato.setContentAreaFilled(false);
        btnGato.setBorderPainted(false);
        contentPane.add(btnGato);

        btnZorro = new JButton("");
        btnZorro.setBounds(275, 117, 206, 182);
        btnZorro.setOpaque(false);
        btnZorro.setContentAreaFilled(false);
        btnZorro.setBorderPainted(false);
        contentPane.add(btnZorro);

        lblTexto = new JLabel("Escoge tu mascota");
        lblTexto.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 30));
        lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
        lblTexto.setBounds(468, 331, 376, 58);
        contentPane.add(lblTexto);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(EleccionMascotas.class.getResource("/Fondos/Fondo_mascotas.jpg")));
        lblNewLabel.setBounds(0, 0, 1299, 749);
        contentPane.add(lblNewLabel);
    }

	public JButton getBtnPinguino() {
		return btnPinguino;
	}

	public void setBtnPinguino(JButton btnPinguino) {
		this.btnPinguino = btnPinguino;
	}

	public JButton getBtnPerro() {
		return btnPerro;
	}

	public void setBtnPerro(JButton btnPerro) {
		this.btnPerro = btnPerro;
	}

	public JButton getBtnGato() {
		return btnGato;
	}

	public void setBtnGato(JButton btnGato) {
		this.btnGato = btnGato;
	}

	public JButton getBtnZorro() {
		return btnZorro;
	}

	public void setBtnZorro(JButton btnZorro) {
		this.btnZorro = btnZorro;
	}
    
	
    
    
}
