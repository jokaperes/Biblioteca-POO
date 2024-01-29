package main.java.view;

import javax.swing.*;

public class MyFrame extends JFrame {
 public MyFrame() {
     this.setTitle("Sistema de Gerenciamento de Bibliotecas");
     this.setSize(800, 600);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.setVisible(true);
     ImageIcon image = new ImageIcon("logo.png");
     this.setIconImage(image.getImage());
     this.getContentPane().setBackground(new java.awt.Color(225, 255, 255));
 }
}
