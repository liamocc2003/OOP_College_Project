package Pages;

import People.*;
import javax.swing.*;
import java.awt.event.*;

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
    private JButton btnViewMembers;

    public RegisterMember(){
        setSize(450,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(registerPanel);
        setLocationRelativeTo(null);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output="";
                int i=0;
                String[] allNames=new String[10];
                String[] allEircodes=new String[10];
                String[] allEmails=new String[10];
                String[] allDateOfBirths=new String[10];
                int[] allMemberIds=new int[10];

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

                allNames[i]=forename+surname;
                allEircodes[i]=eircode;
                allEmails[i]=email;
                allDateOfBirths[i]=dateOfBirth;
                allMemberIds[i]=m1.getMemberId();

                output+=m1.toString();

                System.out.println(output);
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
        btnViewMembers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        RegisterMember registerMember=new RegisterMember();
    }
}
