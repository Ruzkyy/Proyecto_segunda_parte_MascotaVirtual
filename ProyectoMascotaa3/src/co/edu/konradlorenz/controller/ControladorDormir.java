package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Mascota;

import javax.swing.JFrame;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.*;

public class ControladorDormir  {
    private Mascota mascota;
    private ControladorIngresar controlaingreso;


	public ControladorDormir(Mascota mascota,ControladorIngresar controlaingreso) {
        this.mascota = mascota;
        this.controlaingreso = controlaingreso;
    }

    public void iniciarInterfazDormir() {
        String tipoMascota = mascota.getTipoMascota();

        switch (tipoMascota.toLowerCase()) {
            case "gato":
                DormirGato dormirGato = new DormirGato();
                configurarBotones(dormirGato);
                dormirGato.setVisible(true);
                dormirGato.getBtnregresar().addActionListener(e -> {
                    dormirGato.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                break;
            case "perro":
                DormirPerro dormirPerro = new DormirPerro();
                configurarBotones2(dormirPerro);
                dormirPerro.setVisible(true);
                dormirPerro.getBtnregresar().addActionListener(e -> {
                    dormirPerro.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                break;
            case "pinguino":
                DormirPinguino dormirPinguino = new DormirPinguino();
                configurarBotones3(dormirPinguino);
                dormirPinguino.setVisible(true);
                dormirPinguino.getBtnregresar().addActionListener(e -> {
                    dormirPinguino.setVisible(false); 
                    controlaingreso.abrirMenuMascota();
                });
                break;
            case "zorro":
                Dormir dormirZorro = new Dormir();
                configurarBotones4(dormirZorro);
                dormirZorro.setVisible(true);
                dormirZorro.getBtnregresar().addActionListener(e -> {
                    dormirZorro.setVisible(false); 
                    controlaingreso.abrirMenuMascota();

                });
                break;
            default:
                System.out.println("Tipo de mascota no reconocido.");
                break;
        }
    }

    private void configurarBotones(DormirGato dormirGato) {
        dormirGato.getBtnDiez().addActionListener(e -> mascota.dormir(10));
        dormirGato.getBtnVeinte().addActionListener(e -> mascota.dormir(20));
        dormirGato.getBtnTreinta().addActionListener(e -> mascota.dormir(30));
        dormirGato.getBtnCuarenta().addActionListener(e -> mascota.dormir(40));
        dormirGato.getBtnCincuenta().addActionListener(e -> mascota.dormir(50));
        dormirGato.getBtnSesenta().addActionListener(e -> mascota.dormir(60));
        dormirGato.getBtnSetenta().addActionListener(e -> mascota.dormir(70));
        dormirGato.getBtnOchenta().addActionListener(e -> mascota.dormir(80));
        dormirGato.getBtnNoventa().addActionListener(e -> mascota.dormir(90));
        dormirGato.getBtnCien().addActionListener(e -> mascota.dormir(100));
        dormirGato.getBtnCientoUno().addActionListener(e -> mascota.dormir(110));
    }
    private void configurarBotones2 (DormirPerro dormirPerro) {
        dormirPerro.getBtnDiez().addActionListener(e -> mascota.dormir(10));
        dormirPerro.getBtnVeinte().addActionListener(e -> mascota.dormir(20));
        dormirPerro.getBtnTreinta().addActionListener(e -> mascota.dormir(30));
        dormirPerro.getBtnCuarenta().addActionListener(e -> mascota.dormir(40));
        dormirPerro.getBtnCincuenta().addActionListener(e -> mascota.dormir(50));
        dormirPerro.getBtnSesenta().addActionListener(e -> mascota.dormir(60));
        dormirPerro.getBtnSetenta().addActionListener(e -> mascota.dormir(70));
        dormirPerro.getBtnOchenta().addActionListener(e -> mascota.dormir(80));
        dormirPerro.getBtnNoventa().addActionListener(e -> mascota.dormir(90));
        dormirPerro.getBtnCien().addActionListener(e -> mascota.dormir(100));
        dormirPerro.getBtnCientoUno().addActionListener(e -> mascota.dormir(110));
    }
    private void configurarBotones3(DormirPinguino dormirPinguino) {
        dormirPinguino.getBtnDiez().addActionListener(e -> mascota.dormir(10));
        dormirPinguino.getBtnVeinte().addActionListener(e -> mascota.dormir(20));
        dormirPinguino.getBtnTreinta().addActionListener(e -> mascota.dormir(30));
        dormirPinguino.getBtnCuarenta().addActionListener(e -> mascota.dormir(40));
        dormirPinguino.getBtnCincuenta().addActionListener(e -> mascota.dormir(50));
        dormirPinguino.getBtnSesenta().addActionListener(e -> mascota.dormir(60));
        dormirPinguino.getBtnSetenta().addActionListener(e -> mascota.dormir(70));
        dormirPinguino.getBtnOchenta().addActionListener(e -> mascota.dormir(80));
        dormirPinguino.getBtnNoventa().addActionListener(e -> mascota.dormir(90));
        dormirPinguino.getBtnCien().addActionListener(e -> mascota.dormir(100));
        dormirPinguino.getBtnCientoUno().addActionListener(e -> mascota.dormir(110));
    }
    private void configurarBotones4(Dormir dormirZorro) {
        dormirZorro.getBtnDiez().addActionListener(e -> mascota.dormir(10));
        dormirZorro.getBtnVeinte().addActionListener(e -> mascota.dormir(20));
        dormirZorro.getBtnTreinta().addActionListener(e -> mascota.dormir(30));
        dormirZorro.getBtnCuarenta().addActionListener(e -> mascota.dormir(40));
        dormirZorro.getBtnCincuenta().addActionListener(e -> mascota.dormir(50));
        dormirZorro.getBtnSesenta().addActionListener(e -> mascota.dormir(60));
        dormirZorro.getBtnSetenta().addActionListener(e -> mascota.dormir(70));
        dormirZorro.getBtnOchenta().addActionListener(e -> mascota.dormir(80));
        dormirZorro.getBtnNoventa().addActionListener(e -> mascota.dormir(90));
        dormirZorro.getBtnCien().addActionListener(e -> mascota.dormir(100));
        dormirZorro.getBtnCientoUno().addActionListener(e -> mascota.dormir(110));
    }
    

 
}

