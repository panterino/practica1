import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLOutput;

public class Memorama extends JFrame {
JLabel Label1, Label2, Label3, Label4;
    ImageIcon img2, img4;
boolean L1, L2,L3,L4, LI1;

    public Memorama(){

        this.setDefaultCloseOperation(2);
        this.setTitle("Memorama ");
        this.setBounds(500,300,500,500);
        this.setLayout(null);
        this.setResizable(false);
        CargarBoolean();


        Border border = LineBorder.createGrayLineBorder();
         JLabel Label1 = new JLabel();
        Label1.setBounds(50, 100, 150, 100);
        Label1.setBorder(border);
        this.add(Label1);

        JLabel Label2 = new JLabel();
        Label2.setBounds(250, 100, 150, 100);
        Label2.setBorder(border);
        this.add(Label2);

        JLabel Label3 = new JLabel();
        Label3.setBounds(50, 250, 150, 100);
        Label3.setBorder(border);
        this.add(Label3);

        JLabel Label4 = new JLabel();
        Label4.setBounds(250, 250, 150, 100);
        Label4.setBorder(border);
        this.add(Label4);
        Image cara1= new ImageIcon("img/Carta_trasera.png").getImage();
        ImageIcon cara2 =new ImageIcon(cara1.getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        Label1.setIcon(cara2);
        Label2.setIcon(cara2);
        Label3.setIcon(cara2);
        Label4.setIcon(cara2);

        Image img= new ImageIcon("img/Amd.jpg").getImage();
        ImageIcon img2 =new ImageIcon(img.getScaledInstance(150, 124, Image.SCALE_SMOOTH));
        Image img1= new ImageIcon("img/Intel.jpg").getImage();
        ImageIcon img4 =new ImageIcon(img1.getScaledInstance(150, 124, Image.SCALE_SMOOTH));

        Label1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                Label1.setIcon(img2);
               L1 = true;
               Comparar();

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        Label2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                Label2.setIcon(img4);
                L2 = true;
                Comparar();

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        Label3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Label3.setIcon(img4);
                L3 = true;
                Comparar();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        Label4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Label4.setIcon(img2);
                L4 = true;
                Comparar();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

    }
 public void Comparar(){
        if((L1 == true && L2== true) || (L2 && L1)){
            L1= false;
            L2 = false;
            System.out.println("CERRAR L1--- L2");
             LI1 = true;
        }
        else if((L1 == true && L3== true) || (L3 && L1 )){
            System.out.println("cerrar l1 --- l3");
            L1 = false;
            L3 = false;


        }else if((L4 == true && L2 == true) || (L2 && L4)){
            System.out.println("cerrar L4 -- L2");
            L4 = false;
            L2 = false;
        }else if((L4 == true && L3 == true) ||(L3 && L4)){
            L4 = false;
            L3 = false;
            System.out.println("cerrar L4 --- L3");
        }


 }

 public void CargarBoolean(){
     L1 = false;
     L2 = false;
     L3 = false;
     L4 = false;
     LI1 = false;
 }
    public static void main(String[] args) {
      Memorama A = new Memorama();
      A.setVisible(true);
    }

}
