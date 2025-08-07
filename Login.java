
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0, 500,500);
        add (image);
        
        JLabel heading= new JLabel("SIMPLE MINDS");
        heading.setBounds(620,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30, 144, 254));
        add (heading);
        
        JLabel name= new JLabel("Enter your name");
        name.setBounds(660,150,300,20);
        name.setFont(new Font("Mongolian Baithi",Font.BOLD,18));
        name.setForeground(new Color(30, 144, 254));
        add (name);
        
        tfname= new JTextField();
        tfname.setBounds(620,210,265,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,18));
        add (tfname);
        
        rules = new JButton("Next");
        rules.setBounds(620,270,110,25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add (rules);
        
        back = new JButton("Back");
        back.setBounds(775,270,110,25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add (back);
        
        setSize(1000,500);
        setLocation(130,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if (ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
