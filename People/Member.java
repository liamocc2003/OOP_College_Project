package People;

import javax.swing.*;
import java.util.*;

public class Member {
    private String firstName;
    private String lastName;
    private String eircode;
    private String email;
    private String dateOfBirth;
    private static int memberId=10000;

    public Member(){
        firstName="No data available";
        lastName="No data available";
        eircode="No data available";
        email="No data available";
        dateOfBirth="No data available";
    }

    public Member(String firstName,String lastName,String eircode,String email,String dateOfBirth,int memberId){
        setFirstName(firstName);
        setLastName(lastName);
        setEircode(eircode);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setMemberId(memberId);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEircode() {
        return eircode;
    }
    public String getEmail() {
        return email;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public int getMemberId() {
        return ++memberId;
    }

    public void setFirstName(String firstName) {
        if(firstName.equals("")){
            firstName=JOptionPane.showInputDialog("Field is empty.\nPlease enter a Forename: ");
        }
        else{
            for (int i=0;i<firstName.length();i++){
                if(Character.isLetter(firstName.charAt(i))){
                    this.firstName = firstName;
                }
                else{
                    firstName=JOptionPane.showInputDialog("Forename must only be letters.\nPlease re-enter Forename: ");
                }
            }
        }
    }
    public void setLastName(String lastName) {
        if(lastName.equals("")){
            lastName=JOptionPane.showInputDialog("Field is empty.\nPlease enter a Surname: ");
        }
        else{
            for (int i=0;i<lastName.length();i++){
                if(Character.isLetter(lastName.charAt(i)) || lastName.charAt(i)==' ' || lastName.charAt(i)=='-' || lastName.charAt(i)=='\''){
                    this.lastName = lastName;
                }
                else{
                    lastName=JOptionPane.showInputDialog("Surname must only be letters.\nPlease re-enter Surname: ");
                }
            }
        }
    }
    public void setEircode(String eircode) {
        if(eircode.equals("")){
            eircode=JOptionPane.showInputDialog("Field is empty.\nPlease enter an Eircode: ");
        }
        else{
            if(eircode.length()==7){
                if(Character.isLetter(eircode.charAt(0))){
                    if(Character.isDigit(eircode.charAt(1))&&Character.isDigit(eircode.charAt(2))){
                        for(int i=3;i<7;i++) {
                            if (Character.isDigit(eircode.charAt(i)) || Character.isLetter(eircode.charAt(i))) {
                                this.eircode = eircode;
                            }
                            else{
                                eircode=JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                            }
                        }
                    }
                    else{
                        eircode=JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                    }
                }
                else{
                    eircode=JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                }
            }
            else{
                eircode=JOptionPane.showInputDialog("Eircode must be only 7 characters long. Re-enter the Eircode: ");
            }
        }
    }
    public void setEmail(String email) {
        int positionOfSymbol=email.indexOf("@");
        String afterSymbol=email.substring(positionOfSymbol);
        if(email.equals("")){
            email=JOptionPane.showInputDialog("Field is empty.\nPlease enter an Email: ");
        }
        else{
            if(afterSymbol.equals("@gmail.com") || afterSymbol.equals("@yahoo.com") || afterSymbol.equals("@outlook.com") || afterSymbol.equals("@icloud.com")){
                this.email = email;
            }
            else{
                email=JOptionPane.showInputDialog("Invalid email. Please re-enter: ");
            }
        }
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        Calendar currentDate=new GregorianCalendar();
        int currentYear=currentDate.get(Calendar.YEAR);
        int userYear=Integer.parseInt(dateOfBirth.substring(6,10));
        if(dateOfBirth.equals("")){
            dateOfBirth=JOptionPane.showInputDialog("Field is empty.\nPlease enter a Date of Birth: ");
        }
        else if (currentYear-userYear<18) {
            JOptionPane.showMessageDialog(null,"Member is too young to join.\nMust be 18 or older","Age Verification",JOptionPane.INFORMATION_MESSAGE);
        }
        else{

        }
    }
    public void setMemberId(int memberId) {
        this.memberId = ++memberId;
    }

    public String toString(){
        String str="Member's Name: "+getFirstName()+" "+getLastName()+
                "\nMember's Eircode: "+getEircode()+
                "\nMember's Email: "+getEmail()+
                "\nMember's Date of Birth: "+getDateOfBirth()+
                "\nMember's ID: L"+getMemberId();

        return str;
    }
}
