//Importar paquetes
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    //Constructor
    public GUI() {
        //Atributos del frame
        super("LDR");
        Rectangle bounds = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getMaximumWindowBounds();   // área útil (sin barra de tareas)
        setBounds(bounds);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}