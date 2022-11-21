package Pages;

import People.Member;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterMember extends JFrame{
    private JPanel registerPanel;
    private JLabel titleLabel;
    private JTextField txtForename;
    private JTextField txtSurname;
    private JTextField txtEircode;
    private JLabel forenameLabel;
    private JLabel surnameLabel;
    private JLabel eircodeLabel;
    private JTextField txtEmail;
    private JLabel emailLabel;
    private JLabel dobLabel;
    private JTextField txtDob;
    private JButton btnRegister;
    private JButton btnBack;

    public RegisterMember(){
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(registerPanel);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output="";

                Member m1=new Member();

                String forename=txtForename.getText();
                m1.setFirstName(forename);

                String surname=txtSurname.getText();
                m1.setLastName(surname);

                String eircode=txtEircode.getText();
                m1.setEircode(eircode);

                String email=txtEmail.getText();
                m1.setEmail(email);

                String dateOfBirth=txtDob.getText();
                m1.setDateOfBirth(dateOfBirth);

                output+=m1.toString();

                System.out.println(output+"\n");
            }
        });

        setVisible(true);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        RegisterMember registerMember=new RegisterMember();
    }
}
