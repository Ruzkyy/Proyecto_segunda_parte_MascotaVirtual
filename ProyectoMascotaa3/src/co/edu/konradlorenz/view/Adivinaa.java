package co.edu.konradlorenz.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.Controlador;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Adivinaa extends JFrame {
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtResultado;
    private JButton btnAdivina;
    private JLabel lblNumeroUno;
    private JLabel lblNumeroDos;
    private JLabel lblOperador;
    private JButton btnRegresar;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	Adivinaa frame = new Adivinaa();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    

    public Adivinaa() {
    	setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1010, 570);
        setResizable(false);
        setLocationRelativeTo(null);
    	
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblOperador = new JLabel("+");
        lblOperador.setFont(new Font("Tahoma", Font.PLAIN, 78));
        lblOperador.setHorizontalAlignment(SwingConstants.CENTER);
        lblOperador.setBounds(440, 100, 140, 134);
        contentPane.add(lblOperador);

        lblNumeroDos = new JLabel("4");
        lblNumeroDos.setFont(new Font("Tahoma", Font.PLAIN, 78));
        lblNumeroDos.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumeroDos.setBounds(653, 111, 140, 123);
        contentPane.add(lblNumeroDos);

        btnAdivina = new JButton("");
        btnAdivina.setIcon(new ImageIcon(Adivinaa.class.getResource("/Iconos/Boton aceptar.png")));
        btnAdivina.setBounds(627, 318, 89, 65);
        contentPane.add(btnAdivina);

        txtResultado = new JTextField();
        txtResultado.setBounds(331, 334, 274, 37);
        contentPane.add(txtResultado);
        txtResultado.setColumns(10);

        lblNumeroUno = new JLabel("3");
        lblNumeroUno.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumeroUno.setFont(new Font("Tahoma", Font.PLAIN, 78));
        lblNumeroUno.setBounds(240, 121, 121, 102);
        contentPane.add(lblNumeroUno);
        
        btnRegresar = new JButton("");  // Asegúrate de inicializar btnRegresar aquí
        btnRegresar.setIcon(new ImageIcon(Adivinaa.class.getResource("/Iconos/Boton atras 2.png")));
        btnRegresar.setBounds(59, 438, 89, 87);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setBorderPainted(false);
        contentPane.add(btnRegresar);

        JLabel lblFondo = new JLabel("");
        lblFondo.setIcon(new ImageIcon(Adivinaa.class.getResource("/Fondos/Juego Matematicas.png")));
        lblFondo.setBounds(10, -25, 1006, 638);
        contentPane.add(lblFondo);
    }
    public JButton getBtnRegresar() {
		return btnRegresar;
	}



	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}



	public JLabel getLblOperador() {
        return lblOperador;
    }

    public JLabel getLblNumeroUno() {
        return lblNumeroUno;
    }

    public JLabel getLblNumeroDos() {
        return lblNumeroDos;
    }

    public JTextField getTxtResultado() {
        return txtResultado;
    }

    public JButton getBtnAdivina() {
        return btnAdivina;
    }
}
