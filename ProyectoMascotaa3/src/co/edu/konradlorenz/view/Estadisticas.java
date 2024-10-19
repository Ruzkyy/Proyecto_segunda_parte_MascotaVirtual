package co.edu.konradlorenz.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorDormir;
import co.edu.konradlorenz.controller.ControladorEstadisticas;
import co.edu.konradlorenz.model.Mascota;

public class Estadisticas extends JFrame {
    private JLabel lblAlimentacion, lblEnergia, lblDiversion;
    private JButton btnVer, btnAtras; 
    private JLabel jLabel1;
   

    public static void main(String[] args) {
        Estadisticas frame = new Estadisticas();
        

    }

    public Estadisticas() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 560);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);

        lblAlimentacion = new JLabel("0");
        lblAlimentacion.setFont(new Font("Roboto", Font.BOLD, 24));
        lblAlimentacion.setHorizontalAlignment(SwingConstants.CENTER);
        lblAlimentacion.setBounds(607, 120, 80, 60);
        getContentPane().add(lblAlimentacion);

        lblEnergia = new JLabel("0");
        lblEnergia.setFont(new Font("Roboto", Font.BOLD, 24));
        lblEnergia.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnergia.setBounds(610, 240, 70, 70);
        getContentPane().add(lblEnergia);

        lblDiversion = new JLabel("0");
        lblDiversion.setFont(new Font("Roboto", Font.BOLD, 24));
        lblDiversion.setHorizontalAlignment(SwingConstants.CENTER);
        lblDiversion.setBounds(607, 366, 80, 60);
        getContentPane().add(lblDiversion);

        btnVer = new JButton("");
        btnVer.setIcon(new ImageIcon(getClass().getResource("/ICONOS/vision-compartida.png")));
        btnVer.setBounds(890, 450, 60, 60);
        btnVer.setContentAreaFilled(false);
        btnVer.setBorderPainted(false);
        getContentPane().add(btnVer);

        btnAtras = new JButton("");
        btnAtras.setIcon(new ImageIcon(Estadisticas.class.getResource("/ICONOS/Boton atras 2.png")));
        btnAtras.setBounds(40, 424, 80, 85);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);
        getContentPane().add(btnAtras);
        
        jLabel1 = new JLabel("");
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/FONDOS/estadisticas plantilla.png")));
        jLabel1.setBounds(0, 0, 1000, 560);
        getContentPane().add(jLabel1);

        getContentPane().setBackground(new Color(240, 240, 240)); 
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

	public void setBtnVer(JButton btnVer) {
		this.btnVer = btnVer;
	}

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}

	public JLabel getLblAlimentacion() {
		return lblAlimentacion;
	}

	public void setLblAlimentacion(JLabel lblAlimentacion) {
		this.lblAlimentacion = lblAlimentacion;
	}

	public JLabel getLblEnergia() {
		return lblEnergia;
	}

	public void setLblEnergia(JLabel lblEnergia) {
		this.lblEnergia = lblEnergia;
	}

	public JLabel getLblDiversion() {
		return lblDiversion;
	}

	public void setLblDiversion(JLabel lblDiversion) {
		this.lblDiversion = lblDiversion;
	}
	

	
}
