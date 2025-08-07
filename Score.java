package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        // Set frame properties
        setTitle("Score");
        setBounds(300, 50, 800, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load and scale image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 100, 300, 200); // Position and size of image
        add(image);

        // Heading label
        JLabel heading = new JLabel("THANK YOU FOR PLAYING SIMPLE MINDS");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        // Score label
        JLabel lblscore = new JLabel("Your Score is " + score);
        lblscore.setBounds(420, 180, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);

        // "Play Again" button
        JButton submit = new JButton("Play Again");
        submit.setBounds(450, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); // Make sure Login class exists in your project
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }

}
