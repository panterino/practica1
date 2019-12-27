package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        this.setTitle("GUP");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textTitle = new JLabel("Calcula tu IMC");
        textTitle.setBounds(10,5,300,20);
        add(textTitle);

        JLabel textSSID = new JLabel("Altura (m)");
        textSSID.setBounds(80,60,70,20);
        add(textSSID);

        JLabel textMAC = new JLabel("MAC address:");
        textMAC.setBounds(80,95,100,20);
        add(textMAC);

        JTextField txtSSID = new JTextField();
        txtSSID.setBounds(180,60,130,25);
        add(txtSSID);

        JTextField txtMAC = new JTextField();
        txtMAC.setBounds(180,95,130,25);
        add(txtMAC);

        JButton btnGetPass = new JButton("Get Password");
        btnGetPass.setBounds(60,130,270,25);
        add(btnGetPass);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        new Main();
    }
}
