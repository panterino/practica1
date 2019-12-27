import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Window1 extends JFrame {
   JLabel Label1;
   JTextField input1,input3;
   JLabel jLabe2;


    public Window1() {
        this.setBounds(200, 150, 500, 500);
        this.setTitle("Hello world");
        this.setResizable(false);

        this.setLayout(null);
        this.setDefaultCloseOperation(2);

        JLabel Label1 = new JLabel();
        Label1.setBounds(50, 50, 150, 25);
        Label1.setText("Ingresa el usuario ");
        Label1.setVisible(true);
        this.add(Label1);

        JTextField input1 = new JTextField();
        input1.setBounds(200, 50, 150, 20);
        input1.setVisible(true);
        this.add(input1);

        JLabel Label2 = new JLabel();
        Label2.setBounds(50, 100, 150, 25);
        Label2.setText("Ingresa la contraseña ");
        Label2.setVisible(true);
        this.add(Label2);

        JTextField input3 = new JTextField();
        input3.setBounds(200, 100, 150, 20);
        this.add(input3);

        JButton Btn = new JButton();
        Btn.setBounds(250, 200, 100, 100);
        Btn.setText("Enter");
        Btn.setLayout(null);
        this.add(Btn);


        Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               if(input3.getText().equals("contraseña")){
                   Window2 B = new Window2();
                   B.setVisible(true);
                   dispose();
               }
                else{
                   JOptionPane.showMessageDialog(null,"INCORRECT PASSWORD","ERROR",JOptionPane.WARNING_MESSAGE);
               }

            }
        });

    }
}
