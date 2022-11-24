package Pages;

import People.Member;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ViewMembers extends JFrame{
    private JPanel viewPanel;
    private JLabel titleLabel;
    private JTextArea nameArea;
    private JTextArea eircodeArea;
    private JTextArea emailArea;
    private JTextArea dateOfBirthArea;
    private JTextArea memberIdArea;
    private JButton btnBack;

    public ViewMembers(){
        setContentPane(viewPanel);
        setSize(850,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Member vm1=new Member();
        ArrayList<String> allFirstNames=vm1.getAllFirstNames();
        ArrayList<String> allLastNames=vm1.getAllLastNames();
        ArrayList<String> allNames=vm1.getAllNames();
        ArrayList<String> allEircodes=vm1.getAllEircodes();
        ArrayList<String> allEmails=vm1.getAllEmails();
        ArrayList<String> allDateOfBirths=vm1.getAllDateOfBirths();
        ArrayList<Integer> allMemberIds=vm1.getAllMemberIds();

        for(int i=1;i<allFirstNames.size();i++){
            allNames.add(allFirstNames.get(i)+" "+allLastNames.get(i));
        }
        for(String vm:allNames){
            nameArea.append(vm+"\n");
        }
        for(String vm:allEircodes){
            eircodeArea.append(vm+"\n");
        }
        for(String vm:allEmails){
            emailArea.append(vm+"\n");
        }
        for(String vm:allDateOfBirths){
            dateOfBirthArea.append(vm+"\n");
        }
        for(Integer vm:allMemberIds){
            memberIdArea.append(vm+"\n");
        }
        //https://docs.oracle.com/javase/tutorial/uiswing/components/textarea.html

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                setVisible(false);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        ViewMembers viewMembers=new ViewMembers();
    }
}
