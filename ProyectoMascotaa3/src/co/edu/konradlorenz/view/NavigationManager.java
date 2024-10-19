package co.edu.konradlorenz.view;

import java.util.Stack;
import javax.swing.JFrame;

public class NavigationManager {
    private static Stack<JFrame> history = new Stack<>();

    // Navega a una nueva ventana, registrando la ventana actual en el historial
    public static void navigateTo(JFrame currentFrame, JFrame nextFrame) {
        history.push(currentFrame);
        nextFrame.setVisible(true);
        currentFrame.dispose();
    }

    // Navega de regreso a la ventana anterior
    public static void navigateBack(JFrame currentFrame) {
        if (!history.isEmpty()) {
            JFrame previousFrame = history.pop();
            previousFrame.setVisible(true);
            currentFrame.dispose();
        }
    }
    
}