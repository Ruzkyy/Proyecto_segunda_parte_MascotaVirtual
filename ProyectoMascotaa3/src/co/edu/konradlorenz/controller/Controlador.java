package co.edu.konradlorenz.controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.konradlorenz.model.AdivinaElNumero;
import co.edu.konradlorenz.view.Adivinaa;
import co.edu.konradlorenz.view.MenuJuegosGato;

public class Controlador implements ActionListener {
    private Adivinaa vista;
    private AdivinaElNumero modelo;
    private ControladorJuegos controladorJuegos;

    // Constructor con controlador de juegos
    public Controlador(ControladorJuegos controladorJuegos) {
        this.controladorJuegos = controladorJuegos;
    }

    private void mostrarVentana(boolean visible) {
        if (!vista.isVisible()) {  // Asegúrate de que la vista no esté ya visible
            vista.pack();
            vista.setLocationRelativeTo(null);
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vista.setVisible(visible);
        }
    }

    public void setVistaModelo(Adivinaa vista, AdivinaElNumero modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    private void generarOperacion() {
        modelo.generarOperacion();
        int numero1 = modelo.getNum1();
        int numero2 = modelo.getNum2();
        char operador = modelo.getOperador();

        vista.getLblNumeroUno().setText(String.valueOf(numero1));
        vista.getLblOperador().setText(String.valueOf(operador));
        vista.getLblNumeroDos().setText(String.valueOf(numero2));
        vista.getTxtResultado().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnAdivina()) {
            try {
                int respuestaUsuario = Integer.parseInt(vista.getTxtResultado().getText());
                if (modelo.jugar(respuestaUsuario)) {
                    JOptionPane.showMessageDialog(vista, "¡Correcto!");
                } else {
                    JOptionPane.showMessageDialog(vista, "Incorrecto, intenta de nuevo.");
                }
                generarOperacion();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(vista, "Por favor, ingrese un número válido.");
            }
        } else if (e.getSource() == vista.getBtnRegresar()) {
            vista.dispose();  // Cierra la ventana actual
            controladorJuegos.IniciarMenuJuegos(); // Regresa al menú de juegos
        }
    }

    public void ejecutar() {
        if (vista == null) { // Asegúrate de que la vista se instancie solo una vez
            vista = new Adivinaa();
        }
        if (modelo == null) { // Asegúrate de que el modelo también se instancie solo una vez
            modelo = new AdivinaElNumero();
        }

        // Evitar múltiples listeners
        ActionListener[] listenersAdivina = vista.getBtnAdivina().getActionListeners();
        for (ActionListener listener : listenersAdivina) {
            vista.getBtnAdivina().removeActionListener(listener);
        }

        ActionListener[] listenersRegresar = vista.getBtnRegresar().getActionListeners();
        for (ActionListener listener : listenersRegresar) {
            vista.getBtnRegresar().removeActionListener(listener);
        }

        // Añadir ActionListener a los botones
        vista.getBtnAdivina().addActionListener(this);
        vista.getBtnRegresar().addActionListener(this);

        generarOperacion();
        mostrarVentana(true);
    }
}

