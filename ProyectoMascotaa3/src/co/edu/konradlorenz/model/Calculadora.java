package co.edu.konradlorenz.model;

import javax.swing.JOptionPane;

import co.edu.konradlorenz.controller.Controlador;

public class Calculadora {
    private int numeroUno, numeroDos;
    private String operador;
    private int resultado;

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getResultado() {
        return resultado;
    }

    public void calcularResultado() {
        try {
            switch (operador) {
                case "+":
                    resultado = numeroUno + numeroDos;
                    break;
                case "-":
                    resultado = numeroUno - numeroDos;
                    break;
                case "*":
                    resultado = numeroUno * numeroDos;
                    break;
                case "/":
                    if (numeroDos != 0) {
                        resultado = numeroUno / numeroDos;
                    } else {
                        throw new ArithmeticException("División por cero");
                    }
                    break;
            }
        } catch (ArithmeticException e) {
            resultado = 0; // Manejar error de división por cero
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage() + "\n" + "por favor borre todo");
        }
    }

}
