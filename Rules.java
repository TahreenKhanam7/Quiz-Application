package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("WELCOME " + name + " to Simple Minds");
        heading.setBounds(50, 20, 500, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 110, 700, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setText(
            "<html>" +
                "1. The quiz contains 10 multiple-choice questions.<br><br>" +
                "2. Each question has four options. Only one is correct.<br><br>" +
                "3. You must answer each question within the time limit (e.g., 15 seconds).<br><br>" +
                "4. No option will be selected by default. Choose carefully.<br><br>" +
                "5. Once you move to the next question, you cannot go back.<br><br>" +
                "6. You will get your score at the end of the quiz.<br><br>" +
                "7. Do not refresh or close the window during the quiz.<br><br>" +
                "8. Have fun and give your best!<br><br>" +
            "</html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(720, 580);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("USER");
    }
}
