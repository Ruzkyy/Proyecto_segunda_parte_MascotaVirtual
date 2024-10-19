package co.edu.konradlorenz.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.konradlorenz.model.Calculadora;
import co.edu.konradlorenz.model.Mascota;
import co.edu.konradlorenz.view.CalculadoraVista;

public class ControladorCalculadora {
    private Mascota mascota;
    private ControladorJuegos controlajuegos;
    private Calculadora modelo;
    private CalculadoraVista vista;

    public ControladorCalculadora(Mascota mascota, ControladorJuegos controlajuegos) {
        super();
        this.mascota = mascota;
        this.controlajuegos = controlajuegos;
    }

    public ControladorCalculadora(Calculadora modelo, CalculadoraVista vista, ControladorJuegos controladorJuegos) {
        this.modelo = modelo;
        this.vista = vista;
        this.controlajuegos = controladorJuegos;
        initControl();
    }

    private void initControl() {
        vista.getBtnCero().addActionListener(new DigitButtonListener("0"));
        vista.getBtnUno().addActionListener(new DigitButtonListener("1"));
        vista.getBtnDos().addActionListener(new DigitButtonListener("2"));
        vista.getBtnTres().addActionListener(new DigitButtonListener("3"));
        vista.getBtnCuatro().addActionListener(new DigitButtonListener("4"));
        vista.getBtnCinco().addActionListener(new DigitButtonListener("5"));
        vista.getBtnSeis().addActionListener(new DigitButtonListener("6"));
        vista.getBtnSiete().addActionListener(new DigitButtonListener("7"));
        vista.getBtnOcho().addActionListener(new DigitButtonListener("8"));
        vista.getBtnNueve().addActionListener(new DigitButtonListener("9"));
        vista.getBtnSuma().addActionListener(new OperatorButtonListener("+"));
        vista.getBtnResta().addActionListener(new OperatorButtonListener("-"));
        vista.getBtnMultiplicacion().addActionListener(new OperatorButtonListener("*"));
        vista.getBtnDivision().addActionListener(new OperatorButtonListener("/"));
        vista.getBtnPuntoDecimal().addActionListener(e -> vista.getTxtPantalla().setText(vista.getTxtPantalla().getText() + "."));
        vista.getBtnBorrar().addActionListener(e -> vista.getTxtPantalla().setText(""));
        vista.getBtnResultado().addActionListener(new ResultButtonListener());
        vista.getBtnRegresar().addActionListener(new RegresarButtonListener());
    }

    private class DigitButtonListener implements ActionListener {
        private String digit;

        public DigitButtonListener(String digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            vista.getTxtPantalla().setText(vista.getTxtPantalla().getText() + digit);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        private String operator;

        public OperatorButtonListener(String operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.setNumeroUno(Integer.parseInt(vista.getTxtPantalla().getText()));
            modelo.setOperador(operator);
            vista.getTxtPantalla().setText("");
        }
    }

    private class ResultButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            modelo.setNumeroDos(Integer.parseInt(vista.getTxtPantalla().getText()));
            modelo.calcularResultado();
            vista.getTxtPantalla().setText(String.valueOf(modelo.getResultado()));
        }
    }

    private class RegresarButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vista.setVisible(false); // Oculta la ventana de la calculadora
            controlajuegos.IniciarMenuJuegos(); // Llama al método para volver al menú de juegos
        }
    }
}


	

	

    

