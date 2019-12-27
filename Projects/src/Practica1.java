import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica1 extends JFrame {
    JTextField Box,Box2;
    JLabel Two;
    public Practica1(){
        this.setResizable(false);
         this.setLayout(null);
         this.setBounds(300,400,300,300);
         this.setTitle("Window1");
         this.setDefaultCloseOperation(2);
         ////inputs/////////////
           JTextField Box = new JTextField();
           Box.setBounds(0,20,120,20);
           this.add(Box);
           JTextField Box2 = new JTextField();
           Box2.setBounds(70,0,120,20);
           this.add(Box2);
        ////////////////Labels////////////
        JLabel One = new JLabel();
        One.setText("Escribe un numero ");
        One.setBounds(0,0,150,20);
        this.add(One);
        JLabel Two = new JLabel();
        Two.setText("El resultado es: ");
        Two.setBounds(0,100,150,20);
        this.add(Two);

        ////////////////// gff/////////////////7

        JButton Btn1 = new JButton();
        Btn1.setBounds(0,50,120,20);
        Btn1.setText("Factorial");
        this.add(Btn1);
        Btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
             int a;
             a = Integer.parseInt(Box.getText());
             Two.setText("El resultado es: "+Factorial(a));
            }
        });

        JButton Btn2 = new JButton();
        Btn2.setBounds(130,50,120,20);
        Btn2.setText("Sumatoria");
        this.add(Btn2);
        Btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int b;
                b = Integer.parseInt(Box.getText());
                Two.setText(" El resultado es: "+SumaF(b));
            }
        });
        JButton Btn3 = new JButton();
        Btn3.setBounds(200,50,120,20);
        Btn3.setText("Potencia ");
        this.add(Btn3);
        Btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int c,d;
                d = Integer.parseInt(Box2.getText());
                c = Integer.parseInt(Box.getText());
                Two.setText("El resultado es: "+Potencia(c,d));
            }
        });
     }


    public static void main(String[] args) {
       Practica1 a = new Practica1();
       a.setVisible(true);
    }
     static int  Factorial(int a){
        if (a >=1){
            return a * Factorial(a-1);
        }
        return 1;
    }

    static int  SumaF(int a){
        if (a >=2){
            return a + SumaF(a-1);
        }
        return 1;
    }
    static  int Potencia(int n,int m){
       int v =n;
        if(m != 0){
            for (int i = 1; i<m;i++){
                n = n * v;
            }
            return n;
        }
        else
            return 1;


    }
}
