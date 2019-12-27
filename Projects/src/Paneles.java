import javax.swing.*;
import java.awt.*;

public class Paneles extends JFrame {
    public Paneles(){
    this.setTitle("Paneles");
    this.setSize(500,500);
    this.setLocationRelativeTo(null);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel POne = new JPanel();
    this.getContentPane().add(POne);
    POne.setBackground(Color.BLACK);
    }


}
