package co.edu.konradlorenz.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.konradlorenz.controller.ControladorIngresar;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ingresoo extends JFrame {
	    private JPanel contentPane;
	    private JTextField textField;
	    private JTextField textField_1;
	    private JButton btnIngreso; 
	    private JLabel lblNewLabel;
	    
	    public Ingresoo() {
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 1018, 611);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        btnIngreso = new JButton("");
	        btnIngreso.setIcon(new ImageIcon(Ingresoo.class.getResource("/Iconos/Boton.png")));
	        btnIngreso.setBounds(404, 409, 221, 85);
	        contentPane.add(btnIngreso);
	        btnIngreso.setOpaque(false);
	        btnIngreso.setContentAreaFilled(false);
	        btnIngreso.setBorderPainted(false);

	        textField_1 = new JTextField();
	        textField_1.setColumns(10);
	        textField_1.setBounds(355, 349, 295, 20);
	        contentPane.add(textField_1);

	        textField = new JTextField();
	        textField.setBounds(355, 238, 295, 20);
	        contentPane.add(textField);
	        textField.setColumns(10);

	        lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon(Ingresoo.class.getResource("/Fondos/Group 3 (1).png")));
	        lblNewLabel.setBounds(0, 0, 1006, 596);
	        contentPane.add(lblNewLabel);

	      
	    }
	    

	    public void setBtnIngreso(JButton btnIngreso) {
			this.btnIngreso = btnIngreso;
		}

		public JTextField getTextField() {
			return textField;
		}

		public void setTextField(JTextField textField) {
			this.textField = textField;
		}

		public JTextField getTextField_1() {
			return textField_1;
		}

		public void setTextField_1(JTextField textField_1) {
			this.textField_1 = textField_1;
		}

		public JButton getBtnIngreso() {
	        return btnIngreso;
	    }
		
}
