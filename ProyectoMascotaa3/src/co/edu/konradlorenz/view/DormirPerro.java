package co.edu.konradlorenz.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorDormir;
import co.edu.konradlorenz.model.Mascota;

public class DormirPerro extends JFrame {

    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11;
    private JButton BtnDiez, BtnVeinte, BtnTreinta, BtnCuarenta, BtnCincuenta, BtnSesenta, BtnSetenta, BtnOchenta, BtnNoventa, BtnCien;
    private JButton btnCientoUno, btnregresar;


    public static void main(String[] args) {
    	EventQueue.invokeLater(() -> {
            try {
    	DormirPerro frame = new DormirPerro();
       
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
   

    public DormirPerro() {
    	setBounds(100, 200, 1000, 570);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	setResizable(false);       
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
       

        jLabel1 = new JLabel("1 y 40min");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBounds(800, 430, 100, 40);
        getContentPane().add(jLabel1);

        jLabel3 = new JLabel("10 min");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBounds(530, 70, 100, 40);
        getContentPane().add(jLabel3);

        jLabel4 = new JLabel("20 min");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBounds(530, 158, 100, 40);
        getContentPane().add(jLabel4);

        jLabel5 = new JLabel("30 min");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBounds(530, 250, 100, 40);
        getContentPane().add(jLabel5);

        jLabel6 = new JLabel("40 min");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBounds(530, 338, 100, 40);
        getContentPane().add(jLabel6);

        jLabel7 = new JLabel("50 min");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBounds(530, 430, 100, 40);
        getContentPane().add(jLabel7);

        jLabel8 = new JLabel("1 hora");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBounds(800, 70, 90, 40);
        getContentPane().add(jLabel8);

        jLabel9 = new JLabel("1 y 10min");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBounds(800, 160, 100, 40);
        getContentPane().add(jLabel9);

        jLabel10 = new JLabel("1 y 20min");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setBounds(800, 250, 100, 40);
        getContentPane().add(jLabel10);

        jLabel11 = new JLabel("1 y 30min");
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBounds(800, 340, 100, 40);
        getContentPane().add(jLabel11);
        
        BtnDiez = new JButton("");
        BtnDiez.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnDiez.setBounds(446, 56, 200, 73);
        BtnDiez.setOpaque(false);
        BtnDiez.setContentAreaFilled(false);
        BtnDiez.setBorderPainted(false);
        getContentPane().add(BtnDiez);

        BtnVeinte = new JButton("");
        BtnVeinte.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnVeinte.setBounds(446, 140, 200, 79);
        BtnVeinte.setOpaque(false);
        BtnVeinte.setContentAreaFilled(false);
        BtnVeinte.setBorderPainted(false);
        getContentPane().add(BtnVeinte);

        BtnTreinta = new JButton("");
        BtnTreinta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnTreinta.setBounds(446, 230, 200, 73);
        BtnTreinta.setOpaque(false);
        BtnTreinta.setContentAreaFilled(false);
        BtnTreinta.setBorderPainted(false);
        getContentPane().add(BtnTreinta);

        BtnCuarenta = new JButton("");
        BtnCuarenta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnCuarenta.setBounds(446, 320, 200, 79);
        BtnCuarenta.setOpaque(false);
        BtnCuarenta.setContentAreaFilled(false);
        BtnCuarenta.setBorderPainted(false);
        getContentPane().add(BtnCuarenta);

        BtnCincuenta = new JButton("");
        BtnCincuenta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnCincuenta.setBounds(446, 410, 200, 73);
        BtnCincuenta.setOpaque(false);
        BtnCincuenta.setContentAreaFilled(false);
        BtnCincuenta.setBorderPainted(false);
        getContentPane().add(BtnCincuenta);
        
        BtnSesenta = new JButton("");
        BtnSesenta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnSesenta.setBounds(720, 56, 191, 73);
        BtnSesenta.setOpaque(false);
        BtnSesenta.setContentAreaFilled(false);
        BtnSesenta.setBorderPainted(false);
        getContentPane().add(BtnSesenta);

        BtnSetenta = new JButton("");
        BtnSetenta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnSetenta.setBounds(720, 140, 191, 80);
        BtnSetenta.setOpaque(false);
        BtnSetenta.setContentAreaFilled(false);
        BtnSetenta.setBorderPainted(false);
        getContentPane().add(BtnSetenta);

        BtnOchenta = new JButton("");
        BtnOchenta.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnOchenta.setBounds(720, 230, 191, 73);
        BtnOchenta.setOpaque(false);
        BtnOchenta.setContentAreaFilled(false);
        BtnOchenta.setBorderPainted(false);
        getContentPane().add(BtnOchenta);

        BtnNoventa = new JButton("");
        BtnNoventa.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnNoventa.setBounds(720, 320, -1, -1);
        BtnNoventa.setOpaque(false);
        BtnNoventa.setContentAreaFilled(false);
        BtnNoventa.setBorderPainted(false);
        getContentPane().add(BtnNoventa);

        BtnCien = new JButton("");
        BtnCien.setIcon(new ImageIcon(getClass().getResource("/ICONOS/Boton Despertador.png")));
        BtnCien.setBounds(721, 320, 200, 79);
        BtnCien.setOpaque(false);
        BtnCien.setContentAreaFilled(false);
        BtnCien.setBorderPainted(false);
        getContentPane().add(BtnCien);
                
        btnCientoUno = new JButton("");
        btnCientoUno.setIcon(new ImageIcon(Dormir.class.getResource("/Iconos/Boton Despertador.png")));
        btnCientoUno.setBounds(720, 410, 200, 73);
        btnCientoUno.setOpaque(false);
        btnCientoUno.setContentAreaFilled(false);
        btnCientoUno.setBorderPainted(false);
        getContentPane().add(btnCientoUno);
        
        btnregresar = new JButton("");
        btnregresar.setIcon(new ImageIcon(getClass().getResource("/Iconos/Boton atras 2.png")));
        btnregresar.setBounds(200, 425, 200, 90);
        btnregresar.setOpaque(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.setBorderPainted(false);
        getContentPane().add(btnregresar);
        
        jLabel2 = new JLabel("");
        jLabel2.setIcon(new ImageIcon(DormirPerro.class.getResource("/Fondos/fondo perro dormir.jpg")));
        jLabel2.setBounds(-162, 11, 1146, 521);
        getContentPane().add(jLabel2);
                
                
    }



	public JButton getBtnDiez() {
		return BtnDiez;
	}



	public void setBtnDiez(JButton btnDiez) {
		BtnDiez = btnDiez;
	}



	public JButton getBtnVeinte() {
		return BtnVeinte;
	}



	public void setBtnVeinte(JButton btnVeinte) {
		BtnVeinte = btnVeinte;
	}



	public JButton getBtnTreinta() {
		return BtnTreinta;
	}



	public void setBtnTreinta(JButton btnTreinta) {
		BtnTreinta = btnTreinta;
	}



	public JButton getBtnCuarenta() {
		return BtnCuarenta;
	}



	public void setBtnCuarenta(JButton btnCuarenta) {
		BtnCuarenta = btnCuarenta;
	}



	public JButton getBtnCincuenta() {
		return BtnCincuenta;
	}



	public void setBtnCincuenta(JButton btnCincuenta) {
		BtnCincuenta = btnCincuenta;
	}



	public JButton getBtnSesenta() {
		return BtnSesenta;
	}



	public void setBtnSesenta(JButton btnSesenta) {
		BtnSesenta = btnSesenta;
	}



	public JButton getBtnSetenta() {
		return BtnSetenta;
	}



	public void setBtnSetenta(JButton btnSetenta) {
		BtnSetenta = btnSetenta;
	}



	public JButton getBtnOchenta() {
		return BtnOchenta;
	}



	public void setBtnOchenta(JButton btnOchenta) {
		BtnOchenta = btnOchenta;
	}



	public JButton getBtnNoventa() {
		return BtnNoventa;
	}



	public void setBtnNoventa(JButton btnNoventa) {
		BtnNoventa = btnNoventa;
	}



	public JButton getBtnCien() {
		return BtnCien;
	}



	public void setBtnCien(JButton btnCien) {
		BtnCien = btnCien;
	}



	public JButton getBtnCientoUno() {
		return btnCientoUno;
	}



	public void setBtnCientoUno(JButton btnCientoUno) {
		this.btnCientoUno = btnCientoUno;
	}



	public JButton getBtnregresar() {
		return btnregresar;
	}



	public void setBtnregresar(JButton btnregresar) {
		this.btnregresar = btnregresar;
	}
    
    
}


