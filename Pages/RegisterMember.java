package Pages;

import People.Member;

import javax.swing.*;
import java.util.GregorianCalendar;

public class RegisterMember extends Member {
    public RegisterMember(String firstName, String lastName, String eircode, String email, GregorianCalendar dateOfBirth, String memberId, GregorianCalendar dateOfJoin) {
        super(firstName, lastName, eircode, email, dateOfBirth, memberId, dateOfJoin);
    }

    public static void main(String[] args) {
        String output="";

        Member m1=new Member();

        String firstName= JOptionPane.showInputDialog("Enter the Members First Name: ");
        m1.setFirstName(firstName);
    }
}
