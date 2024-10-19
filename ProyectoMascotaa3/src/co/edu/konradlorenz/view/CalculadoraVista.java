package co.edu.konradlorenz.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorCalculadora;
import co.edu.konradlorenz.controller.ControladorJuegos;
import co.edu.konradlorenz.model.Calculadora;

public class CalculadoraVista extends JFrame {

	 private static final long serialVersionUID = 1L;
	 private JPanel contentPane;
	    private JTextField txtPantalla;
	    private JButton btnCero;
	    private JButton btnUno;
	    private JButton btnDos;
	    private JButton btnTres;
	    private JButton btnCuatro;
	    private JButton btnCinco;
	    private JButton btnSeis;
	    private JButton btnSiete;
	    private JButton btnOcho;
	    private JButton btnNueve;
	    private JButton btnSuma;
	    private JButton btnResta;
	    private JButton btnMultiplicacion;
	    private JButton btnDivision;
	    private JButton btnPuntoDecimal;
	    private JButton btnBorrar;
	    private JButton btnResultado;
	    private JButton btnRegresar;
	 

	    public CalculadoraVista() {
	        super("Calculadora");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 640, 820);
	        setResizable(false);       
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        btnRegresar = new JButton("");
	        btnRegresar.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/anterior.png")));
	        btnRegresar.setBounds(0, 0, 70, 70);
	        contentPane.add(btnRegresar);
	    

	        JLabel jLabel3 = new JLabel("");
	        jLabel3.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/tren-de-juguete.png")));
	        jLabel3.setBounds(200, 610, 70, 60);
	        contentPane.add(jLabel3);

	        JLabel jLabel1 = new JLabel("");
	        jLabel1.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/bloques.png")));
	        jLabel1.setBounds(300, 470, 70, 60);
	        contentPane.add(jLabel1);

	        JLabel jLabel5 = new JLabel("");
	        jLabel5.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/coche-de-juguete.png")));
	        jLabel5.setBounds(200, 180, 70, 60);
	        contentPane.add(jLabel5);

	        JLabel jLabel4 = new JLabel("");
	        jLabel4.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/carro.png")));
	        jLabel4.setBounds(100, 170, 70, 60);
	        contentPane.add(jLabel4);

	        JLabel jLabel7 = new JLabel("");
	        jLabel7.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/juguete-bebe.png")));
	        jLabel7.setBounds(100, 470, 70, 60);
	        contentPane.add(jLabel7);

	        JLabel jLabel8 = new JLabel("");
	        jLabel8.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/muneca.png")));
	        jLabel8.setBounds(300, 170, 70, 60);
	        contentPane.add(jLabel8);

	        JLabel jLabel11 = new JLabel("");
	        jLabel11.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/piramide.png")));
	        jLabel11.setBounds(200, 470, 70, 60);
	        contentPane.add(jLabel11);

	        JLabel jLabel6 = new JLabel("");
	        jLabel6.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/juguetes (1).png")));
	        jLabel6.setBounds(100, 320, 70, 60);
	        contentPane.add(jLabel6);

	        JLabel jLabel9 = new JLabel("");
	        jLabel9.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/juguetes.png")));
	        jLabel9.setBounds(200, 320, 70, 60);
	        contentPane.add(jLabel9);

	        JLabel jLabel10 = new JLabel("");
	        jLabel10.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/caballo-mecedora.png")));
	        jLabel10.setBounds(300, 320, 70, 60);
	        contentPane.add(jLabel10);

	        txtPantalla = new JTextField();
	        txtPantalla.setBackground(new Color(204, 204, 204));
	        txtPantalla.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 48));
	        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
	        txtPantalla.setBounds(100, 90, 420, 60);
	        contentPane.add(txtPantalla);

	        btnCero = new JButton("");
	        btnCero.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/cero.png")));
	        btnCero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnCero.setBounds(200, 670, 70, 70);
	        contentPane.add(btnCero);

	        btnUno = new JButton("");
	        btnUno.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/uno.png")));
	        btnUno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnUno.setBounds(100, 240, 70, 60);
	        contentPane.add(btnUno);

	        btnDos = new JButton("");
	        btnDos.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/dos.png")));
	        btnDos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnDos.setBounds(200, 240, 70, 60);
	        contentPane.add(btnDos);

	        btnTres = new JButton("");
	        btnTres.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/tres.png")));
	        btnTres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnTres.setBounds(300, 240, 70, 60);
	        contentPane.add(btnTres);

	        btnCuatro = new JButton("");
	        btnCuatro.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/cuatro.png")));
	        btnCuatro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnCuatro.setBounds(100, 390, 70, 60);
	        contentPane.add(btnCuatro);

	        btnCinco = new JButton("");
	        btnCinco.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/cinco.png")));
	        btnCinco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnCinco.setBounds(200, 390, 70, 60);
	        contentPane.add(btnCinco);

	        btnSeis = new JButton("");
	        btnSeis.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/seis.png")));
	        btnSeis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnSeis.setBounds(300, 390, 70, 60);
	        contentPane.add(btnSeis);

	        btnSiete = new JButton("");
	        btnSiete.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/siete.png")));
	        btnSiete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnSiete.setBounds(100, 540, 70, 60);
	        contentPane.add(btnSiete);

	        btnOcho = new JButton("");
	        btnOcho.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/ocho.png")));
	        btnOcho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnOcho.setBounds(200, 540, 70, 60);
	        contentPane.add(btnOcho);

	        btnNueve = new JButton("");
	        btnNueve.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/nueve.png")));
	        btnNueve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnNueve.setBounds(300, 540, 70, 60);
	        contentPane.add(btnNueve);

	        btnBorrar = new JButton("");
	        btnBorrar.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/borrar.png")));
	        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnBorrar.setBounds(290, 670, 80, 70);
	        contentPane.add(btnBorrar);

	        btnPuntoDecimal = new JButton("");
	        btnPuntoDecimal.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/circulo-negro (1).png")));
	        btnPuntoDecimal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnPuntoDecimal.setBounds(100, 670, 70, 70);
	        contentPane.add(btnPuntoDecimal);

	        btnSuma = new JButton("");
	        btnSuma.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/mas.png")));
	        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnSuma.setBounds(440, 240, 80, 60);
	        contentPane.add(btnSuma);

	        btnResta = new JButton("");
	        btnResta.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/menos.png")));
	        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnResta.setBounds(440, 350, 80, 60);
	        contentPane.add(btnResta);

	        btnMultiplicacion = new JButton("");
	        btnMultiplicacion.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/cerrar.png")));
	        btnMultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnMultiplicacion.setBounds(440, 460, 80, 60);
	        contentPane.add(btnMultiplicacion);

	        btnDivision = new JButton("");
	        btnDivision.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/division (1).png")));
	        btnDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnDivision.setBounds(440, 570, 80, 60);
	        contentPane.add(btnDivision);

	        btnResultado = new JButton("");
	        btnResultado.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/igual.png")));
	        btnResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
	        btnResultado.setBounds(440, 670, 80, 70);
	        contentPane.add(btnResultado);

	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/molinillo.png")));
	        lblNewLabel.setBounds(300, 610, 70, 60);
	        contentPane.add(lblNewLabel);

	        JLabel lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Iconos/avion (1).png")));
	        lblNewLabel_1.setBounds(110, 610, 60, 60);
	        contentPane.add(lblNewLabel_1);

	        JLabel jLabel29 = new JLabel("");
	        jLabel29.setIcon(new ImageIcon(CalculadoraVista.class.getResource("/Fondos/intento83838.png")));
	        jLabel29.setBounds(0, 0, 640, 820);
	        contentPane.add(jLabel29);

	        
	    }
	    
	    

	    public JButton getBtnRegresar() {
			return btnRegresar;
		}



		public void setBtnRegresar(JButton btnRegresar) {
			this.btnRegresar = btnRegresar;
		}



		public JTextField getTxtPantalla() {
	        return txtPantalla;
	    }

	    public JButton getBtnSuma() {
	        return btnSuma;
	    }

	    public JButton getBtnResta() {
	        return btnResta;
	    }

	    public JButton getBtnMultiplicacion() {
	        return btnMultiplicacion;
	    }

	    public JButton getBtnDivision() {
	        return btnDivision;
	    }

	    public JButton getBtnPuntoDecimal() {
	        return btnPuntoDecimal;
	    }

	    public JButton getBtnBorrar() {
	        return btnBorrar;
	    }

	    public JButton getBtnResultado() {
	        return btnResultado;
	    }

	    public JButton getBtnCero() {
	        return btnCero;
	    }

	    public JButton getBtnUno() {
	        return btnUno;
	    }

	    public JButton getBtnDos() {
	        return btnDos;
	    }

	    public JButton getBtnTres() {
	        return btnTres;
	    }

	    public JButton getBtnCuatro() {
	        return btnCuatro;
	    }

	    public JButton getBtnCinco() {
	        return btnCinco;
	    }

	    public JButton getBtnSeis() {
	        return btnSeis;
	    }

	    public JButton getBtnSiete() {
	        return btnSiete;
	    }

	    public JButton getBtnOcho() {
	        return btnOcho;
	    }

	    public JButton getBtnNueve() {
	        return btnNueve;
	    }

	}