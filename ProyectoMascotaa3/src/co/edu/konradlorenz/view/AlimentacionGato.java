package co.edu.konradlorenz.view;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import co.edu.konradlorenz.controller.ControladorNecesidades;
import co.edu.konradlorenz.model.Mascota;

public class AlimentacionGato extends JFrame {
	private JButton btnCarne, btnPollo, btnRegreso;
	private JLabel jLabel2;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	AlimentacionGato frame = new AlimentacionGato();
                
    	        } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AlimentacionGato() {
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1010, 570);
        setResizable(false);       
        setLocationRelativeTo(null);

        btnCarne = new JButton();
        btnCarne.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Carne.png")));
        getContentPane().add(btnCarne);
        btnCarne.setBounds(610, 100, 270, 140);
        btnCarne.setOpaque(false);
        btnCarne.setContentAreaFilled(false);
        btnCarne.setBorderPainted(false);

        btnPollo = new JButton();
        btnPollo.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton pollo.png")));
        getContentPane().add(btnPollo);
        btnPollo.setBounds(610, 250, 280, 150);
        btnPollo.setOpaque(false);
        btnPollo.setContentAreaFilled(false);
        btnPollo.setBorderPainted(false);
        
        btnRegreso = new JButton("");
        btnRegreso.setIcon(new ImageIcon(getClass().getResource("/Iconos/Boton atras 2.png")));
        btnRegreso.setBounds(0, 425, 200, 90);
        btnRegreso.setOpaque(false);
        btnRegreso.setContentAreaFilled(false);
        btnRegreso.setBorderPainted(false);
        getContentPane().add(btnRegreso);

        jLabel2 = new JLabel();
        jLabel2.setIcon(new ImageIcon(AlimentacionGato.class.getResource("/Fondos/fondo gato Alimentacion.jpg")));
        jLabel2.setBounds(0, -39, 1010, 570);
        getContentPane().add(jLabel2);
    }

	public JButton getBtnCarne() {
		return btnCarne;
	}
	
	

	public JButton getBtnRegreso() {
		return btnRegreso;
	}

	public void setBtnRegreso(JButton btnRegreso) {
		this.btnRegreso = btnRegreso;
	}

	public void setBtnCarne(JButton btnCarne) {
		this.btnCarne = btnCarne;
	}

	public JButton getBtnPollo() {
		return btnPollo;
	}

	public void setBtnPollo(JButton btnPollo) {
		this.btnPollo = btnPollo;
	}

}
