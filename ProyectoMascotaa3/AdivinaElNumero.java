package co.edu.konradlorenz.model;

import java.util.Random;

public class AdivinaElNumero {
    private int numero1;
    private int numero2;
    private char operador;  
    private int resultado;

    public Operacion() {
        generarOperacion();
    }

    public void generarOperacion() {
        Random random = new Random();
        numero1 = random.nextInt(10);  
        numero2 = random.nextInt(10);
        operador = random.nextBoolean() ? '+' : '-';
        
        if (operador == '+') {
            resultado = numero1 + numero2;
        } else {
            resultado = numero1 - numero2;
        }
    }

    public boolean verificarRespuesta(int respuestaUsuario) {
        return respuestaUsuario == resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public char getOperador() {
        return operador;
    }

    public int getResultado() {
        return resultado;
    }
}
