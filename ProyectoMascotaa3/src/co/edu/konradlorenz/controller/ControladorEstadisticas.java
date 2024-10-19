package co.edu.konradlorenz.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;

public class ControladorEstadisticas {
    private Mascota mascota;
    private ControladorIngresar controlaingreso;
    private EstadisticasM modelo;
    private Estadisticas vista;

    public ControladorEstadisticas(Mascota mascota, ControladorIngresar controlaingreso) {
        this.mascota = mascota;
        this.controlaingreso = controlaingreso;
        this.modelo = new EstadisticasM(mascota); // Crear el modelo para actualizar estadísticas
        this.vista = new Estadisticas(); // Crear la vista
    }

    public void iniciarEstadisticas() {
        vista.setVisible(true);
        vista.getBtnVer().addActionListener(e -> verEstadisticas());
        vista.getBtnAtras().addActionListener(e -> regresarMenu());
    }

    private void verEstadisticas() {
    	mascota.actualizarEstadisticas(
                Integer.parseInt(vista.getLblAlimentacion().getText()),
                Integer.parseInt(vista.getLblEnergia().getText()),
                Integer.parseInt(vista.getLblDiversion().getText())
            );
        // Mostrar las estadísticas actuales en la interfaz gráfica
        vista.getLblAlimentacion().setText(String.valueOf(modelo.getAlimentacion()));
        vista.getLblEnergia().setText(String.valueOf(modelo.getEnergia()));
        vista.getLblDiversion().setText(String.valueOf(modelo.getDiversion()));    
    }

    private void regresarMenu() {
        vista.setVisible(false); // Ocultar vista actual
        String tipoMascota = mascota.getTipoMascota();
        switch (tipoMascota.toLowerCase()) {
            case "gato":
                controlaingreso.abrirMenuMascota();
                break;
            case "perro":
                controlaingreso.abrirMenuMascota();
                break;
            case "pinguino":
                controlaingreso.abrirMenuMascota();
                break;
            case "zorro":
                controlaingreso.abrirMenuMascota();
                break;
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }
    }
}

	   
	    

