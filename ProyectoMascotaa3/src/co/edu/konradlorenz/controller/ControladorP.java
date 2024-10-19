package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Ingresoo;
import co.edu.konradlorenz.view.EleccionMascotas;

public class ControladorP {

    public void ejecutar() {
        Ingresoo vistaIngreso = new Ingresoo();
        vistaIngreso.setVisible(true);  // Hacer visible la vista de ingreso

        // Crear la vista de elección de mascotas (pero no mostrarla aún)
        EleccionMascotas vistaEleccion = new EleccionMascotas();

        // Crear el controlador y pasarle ambas vistas
        ControladorIngresar controladorIngresar = new ControladorIngresar(vistaIngreso, vistaEleccion);
    }
}
