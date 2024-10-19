package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;

public class ControladorNecesidades {
    private Mascota mascota;
    private ControladorIngresar controlaingreso;


	public ControladorNecesidades(Mascota mascota,ControladorIngresar controlaingreso) {
        this.mascota = mascota;
        this.controlaingreso = controlaingreso;
    }

    public ControladorNecesidades(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public void iniciarInterfazComer() {
        String tipoMascota = mascota.getTipoMascota();

        switch (tipoMascota.toLowerCase()) {
            case "gato":
                AlimentacionGato Comer = new AlimentacionGato();
                Comer.setVisible(true);
                ConfigurarBotones(Comer);
                Comer.getBtnRegreso().addActionListener(e -> {
                	Comer.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                
                break;
            case "perro":
            	AlimentacionPerro comer = new AlimentacionPerro();
                comer.setVisible(true);
                ConfigurarBotones2(comer);
                comer.getBtnRegreso().addActionListener(e -> {
                	comer.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                break;
            case "pinguino":
            	AlimentacionPinguino comerp = new AlimentacionPinguino();
                comerp.setVisible(true);
                ConfigurarBotones3(comerp);
                comerp.getBtnRegreso().addActionListener(e -> {
                	comerp.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                break;
            case "zorro":
            	Alimentacion comerz = new Alimentacion();
            	comerz.setVisible(true);
                ConfigurarBotones4(comerz);
            	comerz.getBtnRegreso().addActionListener(e -> {
            		comerz.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
            	});
                break;
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }
    }

    public void ConfigurarBotones(AlimentacionGato Comer) {
    	Comer.getBtnCarne().addActionListener(e -> mascota.comer("pollo"));
    	Comer.getBtnPollo().addActionListener(e -> mascota.comer("carne"));

    }
    public void ConfigurarBotones2(AlimentacionPerro comer) {
    	comer.getBtnCarne().addActionListener(e -> mascota.comer("pollo"));
    	comer.getBtnPollo().addActionListener(e -> mascota.comer("carne"));

    }
    public void ConfigurarBotones3(AlimentacionPinguino comerP) {
    	comerP.getBtnCarne().addActionListener(e -> mascota.comer("pollo"));
    	comerP.getBtnPollo().addActionListener(e -> mascota.comer("carne"));

    }
    public void ConfigurarBotones4(Alimentacion comerz) {
    	comerz.getBtnCarne().addActionListener(e -> mascota.comer("pollo"));
    	comerz.getBtnPollo().addActionListener(e -> mascota.comer("carne"));

    }

   
}

