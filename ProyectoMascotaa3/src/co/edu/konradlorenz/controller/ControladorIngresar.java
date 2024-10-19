package co.edu.konradlorenz.controller;

import javax.swing.JFrame;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;


public class ControladorIngresar {
    private Ingresoo vistaIngreso;
    private EleccionMascotas vistaEleccion;

    // Variables para almacenar los datos de usuario y mascota
    private String nombreUsuario;
    private String nombreMascota;
    private Mascota mascotaSeleccionada;  // Mantiene la misma instancia de mascota

    public ControladorIngresar(Ingresoo vistaIngreso, EleccionMascotas vistaEleccion) {
        this.vistaIngreso = vistaIngreso;
        this.vistaEleccion = vistaEleccion;

        vistaIngreso.getBtnIngreso().addActionListener(e -> iniciarVistaEleccion());

        vistaEleccion.getBtnGato().addActionListener(e -> seleccionarMascota("Gato"));
        vistaEleccion.getBtnPerro().addActionListener(e -> seleccionarMascota("Perro"));
        vistaEleccion.getBtnPinguino().addActionListener(e -> seleccionarMascota("Pinguino"));
        vistaEleccion.getBtnZorro().addActionListener(e -> seleccionarMascota("Zorro"));
    }

    public void iniciarVistaEleccion() {
        nombreUsuario = vistaIngreso.getTextField().getText(); // Captura el nombre de usuario
        nombreMascota = vistaIngreso.getTextField_1().getText(); // Captura el nombre de la mascota

        vistaIngreso.dispose();
        vistaEleccion.setVisible(true);
    }

    public void seleccionarMascota(String tipoMascota) {
        vistaEleccion.dispose();

        // Solo creamos una mascota basada en el tipo seleccionado
        switch (tipoMascota) {
            case "Gato":
                mascotaSeleccionada = new Gato(nombreUsuario, nombreMascota, tipoMascota);
                break;
            case "Perro":
                mascotaSeleccionada = new Perro(nombreUsuario, nombreMascota, tipoMascota);
                break;
            case "Pinguino":
                mascotaSeleccionada = new Pinguino(nombreUsuario, nombreMascota, tipoMascota);
                break;
            case "Zorro":
                mascotaSeleccionada = new Zorro(nombreUsuario, nombreMascota, tipoMascota);
                break;
        }

        // Después de seleccionar, abrir el menú de la mascota con la misma instancia
        abrirMenuMascota();
    }

    public void abrirMenuMascota() {
        if (mascotaSeleccionada instanceof Gato) {
        	MenuGato menuMascota = new MenuGato();
        	menuMascota.setVisible(true);
            // Conectar el botón "Dormir" con el controlador de dormir
            menuMascota.getBtnDormir().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorDormir controladorDormir = new ControladorDormir(mascotaSeleccionada, this);
                controladorDormir.iniciarInterfazDormir();
            });
         // Conectar el botón "Diversion" con el controlador de juegos
            menuMascota.getBtnDiversion().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorJuegos controladorJugar = new ControladorJuegos(mascotaSeleccionada, this);
                controladorJugar.IniciarMenuJuegos();
            });
         // Conectar el botón "Estadísticas"
            menuMascota.getBtnEstadisticas().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorEstadisticas controladorEstadisticas = new ControladorEstadisticas(mascotaSeleccionada, this);
                controladorEstadisticas.iniciarEstadisticas();
            });
            // Conectar el botón "Alimentar"
            menuMascota.getBtnAlimentar().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorNecesidades controladorcomer = new ControladorNecesidades(mascotaSeleccionada, this);
                controladorcomer.iniciarInterfazComer();
            });
            
        } else if (mascotaSeleccionada instanceof Perro) {
        	MenuPerro menuMascota = new MenuPerro();
        	menuMascota.setVisible(true);
            // Conectar el botón "Dormir" con el controlador de dormir
            menuMascota.getBtnDormir().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorDormir controladorDormir = new ControladorDormir(mascotaSeleccionada, this);
                controladorDormir.iniciarInterfazDormir();
            });
         // Conectar el botón "Diversion" con el controlador de juegos
            menuMascota.getBtnDiversion().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorJuegos controladorJugar = new ControladorJuegos(mascotaSeleccionada, this);
                controladorJugar.IniciarMenuJuegos();
            });
         // Conectar el botón "Estadísticas"
            menuMascota.getBtnEstadisticas().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorEstadisticas controladorEstadisticas = new ControladorEstadisticas(mascotaSeleccionada, this);
                controladorEstadisticas.iniciarEstadisticas();
            });
            // Conectar el botón "Alimentar"
            menuMascota.getBtnAlimentar().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorNecesidades controladorcomer = new ControladorNecesidades(mascotaSeleccionada, this);
                controladorcomer.iniciarInterfazComer();
            });
        } else if (mascotaSeleccionada instanceof Pinguino) {
        	MenuPinguino menuMascota = new MenuPinguino();
        	menuMascota.setVisible(true);
            // Conectar el botón "Dormir" con el controlador de dormir
            menuMascota.getBtnDormir().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorDormir controladorDormir = new ControladorDormir(mascotaSeleccionada, this);
                controladorDormir.iniciarInterfazDormir();
            });
         // Conectar el botón "Diversion" con el controlador de juegos
            menuMascota.getBtnDiversion().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorJuegos controladorJugar = new ControladorJuegos(mascotaSeleccionada, this);
                controladorJugar.IniciarMenuJuegos();
            });
         // Conectar el botón "Estadísticas"
            menuMascota.getBtnEstadisticas().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorEstadisticas controladorEstadisticas = new ControladorEstadisticas(mascotaSeleccionada, this);
                controladorEstadisticas.iniciarEstadisticas();
            });
            // Conectar el botón "Alimentar"
            menuMascota.getBtnAlimentar().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorNecesidades controladorcomer = new ControladorNecesidades(mascotaSeleccionada, this);
                controladorcomer.iniciarInterfazComer();
            });
        } else {
        	MenuZorro menuMascota = new MenuZorro();
        	menuMascota.setVisible(true);
            // Conectar el botón "Dormir" con el controlador de dormir
            menuMascota.getBtnDormir().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorDormir controladorDormir = new ControladorDormir(mascotaSeleccionada, this);
                controladorDormir.iniciarInterfazDormir();
            });
         // Conectar el botón "Diversion" con el controlador de juegos
            menuMascota.getBtnDiversion().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorJuegos controladorJugar = new ControladorJuegos(mascotaSeleccionada, this);
                controladorJugar.IniciarMenuJuegos();
            });
         // Conectar el botón "Estadísticas"
            menuMascota.getBtnEstadisticas().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorEstadisticas controladorEstadisticas = new ControladorEstadisticas(mascotaSeleccionada, this);
                controladorEstadisticas.iniciarEstadisticas();
            });
            // Conectar el botón "Alimentar"
            menuMascota.getBtnAlimentar().addActionListener(e -> {
                menuMascota.setVisible(false);
                ControladorNecesidades controladorcomer = new ControladorNecesidades(mascotaSeleccionada, this);
                controladorcomer.iniciarInterfazComer();
            });
        }
    }
}
