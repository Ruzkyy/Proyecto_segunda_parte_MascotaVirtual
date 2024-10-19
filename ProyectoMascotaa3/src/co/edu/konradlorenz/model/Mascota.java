package co.edu.konradlorenz.model;

import java.util.Random;

import javax.swing.JOptionPane;

import co.edu.konradlorenz.controller.Controlador;

public class Mascota extends Usuario implements Necesidades {
    private String nombre;
    private String tipoMascota;  
    private int alimentacion;
    private int energia;
    private int diversion;

    public Mascota(String nombreUsuario, String nombre, String tipoMascota) {
        super(nombreUsuario);  
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.alimentacion = 100;
        this.energia = 100;  
        this.diversion = 50;  
    }

    public Mascota() {
        super();
        this.energia = 100;
        this.diversion = 100;
    }

    

	@Override
	public void comer(String comida){
		if (alimentacion < 100) {
            switch (comida.toLowerCase()) {
                case "pollo":
                	alimentacion += 10;
                    if (alimentacion > 100) {
                        alimentacion = 100;
                    }
                    System.out.println("¡Muchas gracias " + getNombreUsuario() + ", estaba delicioso!");
                    break;
                case "carne":
                    alimentacion += 10;
                    if (alimentacion > 100) {
                        alimentacion = 100;
                    }
                    System.out.println("¡Muchas gracias " + getNombreUsuario() + ", estaba delicioso!");
                    break;
            }
		}
	}

	@Override
	public void jugar(int caso) {
		if (energia >= 20) {
            switch (caso) {
                case 1:
                    if (energia == 100 && diversion == 100) {
                        energia -= 10;
                        alimentacion -= 10;
                        diversion = Math.min(diversion + 10, 100);
                        System.out.println("¡Ganaste el triqui!");
                    } 
                    
                    break;
                case 2:
                    if (energia >= 20 && diversion >= 80) {
                        AdivinaElNumero juegoAdivina = new AdivinaElNumero();
                        Random random = new Random();
                        int respuestaUsuario = random.nextInt(20); 
                        juegoAdivina.jugar(respuestaUsuario);
                    } 
                    break;
                default:
                	System.out.println("Juego no reconocido.");
            }
        } else {
        	System.out.println("No tengo suficiente energía para jugar en este momento.");
        }
		
	}
	
	

	@Override
	public boolean dormir(int minutos) {
		String mensaje;
		 boolean durmioExitosamente = true;

        if (minutos <= 0) {
            mensaje = "El tiempo de sueño debe ser mayor que cero.";
        } else if (energia >= 100) {
            mensaje = "¡No estoy cansado! Mi energía ya está al máximo.";
        } else {
            switch (minutos) {
                case 10:
                    if (energia <= 90) {
                        energia += 10;
                        mensaje = "¡Tu mascota ha dormido 10 minutos!";
                    } else {
                        mensaje = "Mmm... No me siento cansado ¡Quiero ir a jugar!";
                    }
                    break;
                case 20:
                    if (energia <= 80) {
                        energia += 20;
                        mensaje = "¡Tu mascota ha dormido 20 minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 30:
                    if (energia <= 70) {
                        energia += 30;
                        mensaje = "¡Tu mascota ha dormido 30 minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 40:
                    if (energia <= 60) {
                        energia += 40;
                        mensaje = "¡Tu mascota ha dormido 40 minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 50:
                    if (energia <= 50) {
                        energia += 50;
                        mensaje = "¡Tu mascota ha dormido 50 minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 60:
                    if (energia <= 40) {
                        energia += 60;
                        mensaje = "¡Tu mascota ha dormido una hora!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 70:
                    if (energia <= 30) {
                        energia += 70;
                        mensaje = "¡Tu mascota ha dormido una hora y diez minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 80:
                    if (energia <= 20) {
                        energia += 80;
                        mensaje = "¡Tu mascota ha dormido una hora y veinte minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 90:
                    if (energia <= 10) {
                        energia += 90;
                        mensaje = "¡Tu mascota ha dormido una hora y media!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 100:
                    if (energia == 0) {
                        energia += 100;
                        mensaje = "¡Tu mascota ha dormido una hora y cuarenta minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                case 110:
                    if (energia <= 0) {
                        energia += 110;
                        mensaje = "¡Tu mascota ha dormido una hora y cincuenta minutos!";
                    } else {
                        mensaje = "Mmm... No me siento tan cansado para dormir tanto tiempo, ¿Qué te parece un poco menos?";
                    }
                    break;
                default:
                    mensaje = "El tiempo de sueño debe ser entre 10 y 110 minutos.";
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
        return durmioExitosamente;
    }
	public void actualizarEstadisticas(int nuevaAlimentacion, int nuevaEnergia, int nuevaDiversion) {
        if (nuevaAlimentacion >= 0 && nuevaAlimentacion <= 100) {
            setAlimentacion(nuevaAlimentacion);
        }
        if (nuevaEnergia >= 0 && nuevaEnergia <= 100) {
            setEnergia(nuevaEnergia);
        }
        if (nuevaDiversion >= 0 && nuevaDiversion <= 100) {
            setDiversion(nuevaDiversion);
        }
    }
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public int getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(int alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getDiversion() {
        return diversion;
    }

    public void setDiversion(int diversion) {
        this.diversion = diversion;
    }

	@Override
	public String propietario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
}
