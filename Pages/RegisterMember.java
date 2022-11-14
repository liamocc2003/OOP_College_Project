package Pages;

import People.Member;

import javax.swing.*;
import java.lang.*;

public class RegisterMember extends Member{
    public static void main(String[] args) {
        String output="";

        Member m1=new Member();

        String firstName= JOptionPane.showInputDialog("Enter the Members First Name: ");
        m1.setFirstName(firstName);
        String lastName= JOptionPane.showInputDialog("Enter the Members Last Name: ");
        m1.setLastName(lastName);
        String eircode= JOptionPane.showInputDialog("Enter the Members Eircode: ");
        m1.setEircode(eircode);
        String email= JOptionPane.showInputDialog("Enter the Members Email: ");
        m1.setEmail(email);
        String dateOfBirth= JOptionPane.showInputDialog("Enter the Members Date of Birth(DD-MM-YYYY): ");
        m1.setDateOfBirth(dateOfBirth);

        output+=m1.toString();

        System.out.println(output);
    }
}
