package GymSysProject.Pages;

import javax.swing.*;

public class MainMenu extends JFrame {
    private JButton btnRegisterMember;
    private JLabel titleLabel;
    private JPanel mainPanel;
    private JButton btnExitMenu;

    public MainMenu() {
        setSize(450,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        //https://www.tutorialspoint.com/how-to-display-a-jframe-to-the-center-of-a-screen-in-java#:~:text=By%20default%2C%20a%20JFrame%20can,()%20method%20of%20Window%20class.

        btnRegisterMember.addActionListener(e -> {
            new RegisterMember();
            setVisible(false);
        });


        setVisible(true);
        btnExitMenu.addActionListener(e -> {
            dispose();
            System.exit(0);
        });
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}
