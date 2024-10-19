package co.edu.konradlorenz.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.konradlorenz.model.AdivinaElNumero;
import co.edu.konradlorenz.model.Calculadora;
import co.edu.konradlorenz.model.Mascota;
import co.edu.konradlorenz.model.Triqui;
import co.edu.konradlorenz.view.Adivinaa;
import co.edu.konradlorenz.view.CalculadoraVista;
import co.edu.konradlorenz.view.Dormir;
import co.edu.konradlorenz.view.DormirGato;
import co.edu.konradlorenz.view.DormirPerro;
import co.edu.konradlorenz.view.DormirPinguino;
import co.edu.konradlorenz.view.EleccionMascotas;
import co.edu.konradlorenz.view.Ingresoo;
import co.edu.konradlorenz.view.MenuJuegosGato;
import co.edu.konradlorenz.view.TriquiVista;

public class ControladorJuegos {
    private Mascota mascota;
    private ControladorIngresar controlaingreso;
    public ControladorJuegos(Mascota mascota) {
        this.mascota = mascota;
    }
   
    public ControladorJuegos(Mascota mascota,ControladorIngresar controlaingreso) {
        this.mascota = mascota;
        this.controlaingreso = controlaingreso;
        
    }
    public void IniciarMenuJuegos() {
    	MenuJuegosGato menujuegos = new MenuJuegosGato();
    	menujuegos.setVisible(true);
        menujuegos.getBtnTriqui().addActionListener(e -> jugarTriqui(menujuegos));
        menujuegos.getBtnHerramientaC().addActionListener(e -> jugarCalculadora(menujuegos));
        menujuegos.getBtnNumero().addActionListener(e -> jugarNumeros(menujuegos));
        menujuegos.getBtnAtras().addActionListener(e -> {
        String tipoMascota = mascota.getTipoMascota();
            switch (tipoMascota.toLowerCase()) {
            case "gato":
            	menujuegos.setVisible(false); 
                controlaingreso.abrirMenuMascota();
                break;
            case "perro":
            	menujuegos.setVisible(false); 
                controlaingreso.abrirMenuMascota();
                break;
            case "pinguino":
            	menujuegos.setVisible(false); 
                controlaingreso.abrirMenuMascota();
                break;
            case "zorro":
            	menujuegos.setVisible(false); 
                controlaingreso.abrirMenuMascota();
                break;
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }
    
        });
    }

    public void jugarTriqui(JFrame currentFrame) {
        if (puedeJugarTriqui()) {
            
        	currentFrame.dispose(); // Cierra el menú de juegos
            TriquiVista triquiVista = new TriquiVista();
            Triqui modelo = new Triqui();
            ControladorTriqui controladorTriqui = new ControladorTriqui(triquiVista, modelo, this);
            triquiVista.setVisible(true);
            mascota.jugar(1);
        } else {
            JOptionPane.showMessageDialog(null, "Estoy muy cansado para juagar,vamos a dormir");        
        }
    }


    private boolean puedeJugarTriqui() {
    	return mascota != null && mascota.getEnergia() >= 20;
    }
    private boolean puedeJugarAdivinaElNumero() {
    	return mascota != null && mascota.getEnergia() >= 20;
    }
    
    
    
    public Mascota getMascota() {
        return mascota;
    }

    public void jugarCalculadora(JFrame currentFrame) {
    	 currentFrame.dispose();
    	    CalculadoraVista calculadoraVista = new CalculadoraVista();
    	    Calculadora modelo = new Calculadora();
    	    ControladorCalculadora controladorCalculadora = new ControladorCalculadora(modelo, calculadoraVista, this);
    	    calculadoraVista.setVisible(true);
    }

    public void jugarNumeros(JFrame currentFrame) {
      if (puedeJugarAdivinaElNumero()) {
    	  currentFrame.dispose(); 
          Adivinaa adivina = new Adivinaa();
          AdivinaElNumero modelo = new AdivinaElNumero();
          Controlador controladorAdivina = new Controlador(this);
          controladorAdivina.setVistaModelo(adivina, modelo); 
          controladorAdivina.ejecutar(); 
          mascota.jugar(2);
        } else {
            JOptionPane.showMessageDialog(null, "Estoy muy cansado para jugar,vamos a dormir");        
        }
    }
}
