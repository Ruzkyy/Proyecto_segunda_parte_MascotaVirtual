package co.edu.konradlorenz.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import co.edu.konradlorenz.model.Triqui;
import co.edu.konradlorenz.view.TriquiVista;

public class ControladorTriqui implements ActionListener {
	private TriquiVista vista;
    private Triqui modelo;
	private ControladorJuegos controladorJuegos;

    public ControladorTriqui(TriquiVista vista, Triqui modelo, ControladorJuegos controladorJuegos) {
        this.vista = vista;
        this.modelo = modelo;
        inicializarVista();
        this.controladorJuegos = controladorJuegos;

        // Asigna el ActionListener al botón de regresar
        this.vista.getBtnRegresar().addActionListener(this);
    
    }

    private void inicializarVista() {
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            vista.getCuadro(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modelo.realizarJugada(finalI);
                    actualizarVista();
                }
            });
        }

        vista.getBtnReiniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.reiniciarJuego();
                actualizarVista();
            }
        });
    }

    private void actualizarVista() {
        String[] tablero = modelo.getTablero();
        for (int i = 0; i < 9; i++) {
            vista.getCuadro(i).setText(tablero[i]);
        }
        vista.getLblTurnoX().setText("Turno: " + modelo.getTurno());
        vista.getLblPuntajeX().setText(String.valueOf(modelo.getPuntajeX()));
        vista.getLblPuntajeO().setText(String.valueOf(modelo.getPuntajeO()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnRegresar()) {
        	vista.setVisible(false);
            controladorJuegos.IniciarMenuJuegos();
        }}

	
}