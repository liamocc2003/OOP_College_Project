package Pages;

import People.Member;

import javax.swing.*;
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
                new Member();
                setVisible(false);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        MainMenu mainMenu=new MainMenu();
    }
}
