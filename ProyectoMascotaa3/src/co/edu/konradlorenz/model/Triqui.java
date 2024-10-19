package co.edu.konradlorenz.model;

public class Triqui {
	 private String[] tablero = new String[9];
	    private String turno = "X";
	    private int puntajeX = 0, puntajeO = 0;
	    private final int[][] victorias = {
	        {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Filas
	        {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columnas
	        {0, 4, 8}, {2, 4, 6} // Diagonales
	    };

	    public Triqui() {
	        reiniciarJuego();
	    }

	    public void reiniciarJuego() {
	        for (int i = 0; i < tablero.length; i++) {
	            tablero[i] = "";
	        }
	        turno = "X";
	    }

	    public void realizarJugada(int posicion) {
	        if (tablero[posicion].isEmpty()) {
	            tablero[posicion] = turno;
	            if (comprobarGanador()) {
	                incrementarPuntaje(turno);
	                reiniciarJuego();
	            } else {
	                cambiarTurno();
	            }
	        }
	    }

	    public void cambiarTurno() {
	        turno = turno.equals("X") ? "O" : "X";
	    }

	    public boolean comprobarGanador() {
	        for (int[] victoria : victorias) {
	            String simbolo = tablero[victoria[0]];
	            if (!simbolo.isEmpty() && tablero[victoria[1]].equals(simbolo) && tablero[victoria[2]].equals(simbolo)) {
	                System.out.println("¡" + simbolo + " ha ganado!");
	                return true;
	            }
	        }
	        return false;
	    }

	    public void incrementarPuntaje(String ganador) {
	        if (ganador.equals("X")) {
	            puntajeX++;
	        } else if (ganador.equals("O")) {
	            puntajeO++;
	        }
	    }

	    public String getTurno() {
	        return turno;
	    }

	    public String[] getTablero() {
	        return tablero;
	    }

	    public int getPuntajeX() {
	        return puntajeX;
	    }

	    public int getPuntajeO() {
	        return puntajeO;
	    }
}
