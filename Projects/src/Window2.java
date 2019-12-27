import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Window2 extends JFrame {

    JLabel Label1,Label2,Label3,Label4,Label5,Label6;
    JTextField inputA, inputB, inputC, inputD, inputE;
    int Aleatorio1, Aleatorio2, Aleatorio3;
    Color Al;
    public Window2(){
    this.setBounds(200,150,900,500);
    this.setTitle("WIndow2");
    this.setLayout(null);
    this.setDefaultCloseOperation(2);

//////ETIQUETAS Y CAJAS DE LA PRIMER FILA/////
    JLabel Label1 = new JLabel();
    Label1.setBounds(50,50,150,25);
    Label1.setText("Ingresa la base  y altura");
    Label1.setVisible(true);
    this.add(Label1);

    JTextField inputA = new JTextField();
    inputA.setBounds(200,50,100,20);
    inputA.setVisible(true);
    this.add(inputA);

    JTextField inputB = new JTextField();
    inputB.setBounds(350,50,100,20);
    inputB.setVisible(true);
    this.add(inputB);

   JLabel Label2 = new JLabel();
   Label2.setBounds(500,50,150,20);
   Label2.setText("El resultado es: ");
   Label2.setVisible(true);
   this.add(Label2);

//////ETIQUETAS Y CAJAS DE LA SEGUNDA  FILA/////
    JLabel Label3 = new JLabel();
    Label3.setBounds(20,100,200,25);
    Label3.setText("Introduce un lado del cuadrado ");
    Label3.setVisible(true);
    this.add(Label3);

    JTextField InputC = new JTextField();
    InputC.setBounds(200,100,100,20);
    InputC.setVisible(true);
    this.add(InputC);

     JLabel Label4 = new JLabel();
     Label4.setBounds(500,100,200,20);
     Label4.setText("El resultado es: ");
     Label4.setVisible(true);
     this.add(Label4);

///////ETIQUETAS Y CAJAS DE LA TERCERA FILA/////////////////////
    JLabel Label5 = new JLabel();
    Label5.setBounds(50,150,200,20);
    Label5.setText("Introduce la base y altura ");
    Label5.setVisible(true);
    this.add(Label5);

    JTextField inputD = new JTextField();
    inputD.setBounds(200,150,100,20);
    inputD.setVisible(true);
    this.add(inputD);

    JTextField inputE = new JTextField();
    inputE.setBounds(350,150,100,20);
    inputE.setVisible(true);
    this.add(inputE);

    JLabel Label6= new JLabel();
    Label6.setBounds(500,150,200,20);
    Label6.setText("El resultado es: ");
    Label6.setVisible(true);
    this.add(Label6);
    ////////////BOTONES////////////////////
   JButton BtnA = new JButton();
        Color A = new Color(255,51,51);
        BtnA.setBounds(100,210,100,25);
   BtnA.setVisible(true);
   BtnA.setBackground( A);
   BtnA.setText("A, Triángulo");
   this.add(BtnA);

    JButton BtnB = new JButton();
        Color B = new Color(55,153,255);
    BtnB.setBounds(350,210,100,25);
    BtnB.setVisible(true);
    BtnB.setBackground(B);
    BtnB.setText("A.Cuadrado");
    this.add(BtnB);

    JButton BtnC = new JButton();
        Color C = new Color(102,255   ,102);
    BtnC.setBounds(600,210,100,25);
    BtnC.setBackground(C);
    BtnC.setVisible(true);
    BtnC.setText("A. Rectángulo");
    this.add(BtnC);
///// Eventos De Enter/////////
   BtnA.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent actionEvent) {
          int val1,val2, resul;
          val1 = Integer.parseInt(inputA.getText());
           val2 = Integer.parseInt(inputB.getText());
           resul = (val1 *val2)/2;
           Label2.setText("El resultado es: "+resul);
       }
   });
   BtnB.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent actionEvent) {
           int ValC, ResulC;
           ValC = Integer.parseInt(InputC.getText());
           ResulC = ValC * 4;
           Label4.setText("El resultado es: "+ResulC);
       }
   });
   BtnC.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent actionEvent) {
           int ValT,ValT1, ResulT;
           ValT1 = Integer.parseInt(inputD.getText());
           ValT = Integer.parseInt(inputE.getText());
           ResulT = ValT1 *ValT;
           Label6.setText("El resultado es: "+ResulT);
       }
   });
   /////////Eventos de mouse entered and exited////
    BtnA.addMouseListener(new MouseListener() {


        @Override
        public void mouseClicked(MouseEvent mouseEvent) {

        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

            BtnA.setBounds(50,200,200,55);
            ColorS();
            Color Al = new Color(Aleatorio1,Aleatorio2,Aleatorio3);
            BtnA.setBackground(Al);

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

            BtnA.setBounds(100,210,100,25);
        }
    });

       BtnB.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent mouseEvent) {

           }

           @Override
           public void mousePressed(MouseEvent mouseEvent) {

           }

           @Override
           public void mouseReleased(MouseEvent mouseEvent) {

           }

           @Override
           public void mouseEntered(MouseEvent mouseEvent) {
               ColorS();
               Color Al = new Color(Aleatorio1,Aleatorio2,Aleatorio3);
               BtnB.setBackground(Al);
               BtnB.setBounds(300,200,200,50);
           }

           @Override
           public void mouseExited(MouseEvent mouseEvent) {
               BtnB.setBounds(350,210,100,25);
           }
       });

       BtnC.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent mouseEvent) {

           }

           @Override
           public void mousePressed(MouseEvent mouseEvent) {

           }

           @Override
           public void mouseReleased(MouseEvent mouseEvent) {

           }

           @Override
           public void mouseEntered(MouseEvent mouseEvent) {
               ColorS();
               Color Al = new Color(Aleatorio1,Aleatorio2,Aleatorio3);
               BtnC.setBackground(Al);
               BtnC.setBounds(550,200,200,55);

           }

           @Override
           public void mouseExited(MouseEvent mouseEvent) {
               BtnC.setBounds(600,210,100,25);
           }
       });
}
public void  ColorS (){

    Aleatorio1 = ((int) (Math.random() * 255));
    Aleatorio2 = ((int) (Math.random() * 255));
    Aleatorio3 = ((int) (Math.random() * 255));

}


}

