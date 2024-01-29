package main.java;
import main.java.model.Livro;
import main.java.model.Usuario;
import main.java.view.MyFrame;
import javax.swing.*;
import javax.swing.JLabel;
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("logo.png");

        JLabel label = new JLabel();
        label.setText("Biblioteca");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);


        JFrame frame = new JFrame("Exemplo de JLabel");



        frame.add(label);
        label.setIcon(image);


        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);









    }
}