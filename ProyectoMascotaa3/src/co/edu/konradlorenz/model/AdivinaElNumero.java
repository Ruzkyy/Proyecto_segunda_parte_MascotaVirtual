package co.edu.konradlorenz.model;

import java.util.Random;

public class AdivinaElNumero {
    private int num1;
    private int num2;
    private char operador;
    private int resultado;

    public void generarOperacion() {
        Random random = new Random();
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        operador = random.nextBoolean() ? '+' : '-';
        resultado = calcularResultado();
    }

    private int calcularResultado() {
        return operador == '+' ? num1 + num2 : num1 - num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperador() {
        return operador;
    }

    public boolean jugar(int respuestaUsuario) {
        return respuestaUsuario == resultado;
    }
}
