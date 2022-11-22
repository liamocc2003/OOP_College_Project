package Pages;

import People.Member;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JButton btnRegisterMember;
    private JButton btnViewMembers;
    private JLabel titleLabel;
    private JPanel mainPanel;

    public MainMenu() {
        setSize(450,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        //https://www.tutorialspoint.com/how-to-display-a-jframe-to-the-center-of-a-screen-in-java#:~:text=By%20default%2C%20a%20JFrame%20can,()%20method%20of%20Window%20class.

        btnRegisterMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegisterMember();
                setVisible(false);
            }
        });
        btnViewMembers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewMembers();
                setVisible(false);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        MainMenu mainMenu=new MainMenu();
    }
}
