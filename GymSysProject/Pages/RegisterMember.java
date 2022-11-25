package GymSysProject.Pages;

import GymSysProject.People.Member;

import javax.swing.*;

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
    private static int i=0;
    private String[] allNames=new String[10];
    private String[] allEircodes=new String[10];
    private String[] allEmails=new String[10];
    private String[] allDateOfBirths=new String[10];
    private int[] allMemberIds=new int[10];

    public RegisterMember(){
        setSize(450,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(registerPanel);
        setLocationRelativeTo(null);

        btnRegister.addActionListener(e -> {
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

            allNames[i]=forename+surname;
            m1.setAllNames(allNames);

            allEircodes[i]=eircode;
            m1.setAllEircodes(allEircodes);

            allEmails[i]=email;
            m1.setAllEmails(allEmails);

            allDateOfBirths[i]=dateOfBirth;
            m1.setAllDateOfBirths(allDateOfBirths);

            allMemberIds[i]=m1.getMemberId();
            m1.setAllMemberIds(allMemberIds);

            output+=m1.toString();

            System.out.println(output);
        });

        setVisible(true);
        btnBack.addActionListener(e -> {
            new MainMenu();
            setVisible(false);
        });

        btnViewMembers.addActionListener(e -> {
            String data="";

            Member vm1=new Member();

            String forename=txtForename.getText();
            vm1.setFirstName(forename);

            String surname=txtSurname.getText();
            vm1.setLastName(surname);

            String eircode=txtEircode.getText();
            vm1.setEircode(eircode);

            String email=txtEmail.getText();
            vm1.setEmail(email);

            String dateOfBirth=txtDob.getText();
            vm1.setDateOfBirth(dateOfBirth);

            allNames[i]=forename+surname;
            vm1.setAllNames(allNames);

            allEircodes[i]=eircode;
            vm1.setAllEircodes(allEircodes);

            allEmails[i]=email;
            vm1.setAllEmails(allEmails);

            allDateOfBirths[i]=dateOfBirth;
            vm1.setAllDateOfBirths(allDateOfBirths);

            allMemberIds[i]=vm1.getMemberId();
            vm1.setAllMemberIds(allMemberIds);

            for(int x=0;x<1;x++){
                data+=allNames[i]+"   "+allEircodes[i]+"   "+allEmails[i]+"   "+allDateOfBirths[i]+"   "+(allMemberIds[i]-1)+"   ";
            }
            JOptionPane.showMessageDialog(null,"All Members data:"+"\n"+data,"View Members",JOptionPane.INFORMATION_MESSAGE);
            i++;
        });
    }

    public static void saveFiles(){

    }

    public static void main(String[] args) {
        new RegisterMember();
    }
}
