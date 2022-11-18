package People;

import javax.swing.*;

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
        return memberId;
    }

    public void setFirstName(String firstName) {
        for (int i=0;i<firstName.length();i++){
            if(Character.isLetter(firstName.charAt(i))){
                this.firstName = firstName;
            }
            else{
                firstName=JOptionPane.showInputDialog("Forename must only be letters.\nPlease re-enter forename: ");
            }
        }
    }
    public void setLastName(String lastName) {
        for (int i=0;i<lastName.length();i++){
            if(Character.isLetter(lastName.charAt(i)) || lastName.charAt(i)==' ' || lastName.charAt(i)=='-'){
                this.lastName = lastName;
            }
            else{
                lastName=JOptionPane.showInputDialog("Surname must only be letters.\nPlease re-enter surname: ");
            }
        }
    }
    public void setEircode(String eircode) {
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
            eircode=JOptionPane.showInputDialog("Eircode must be only 7 characters long. Re-enter the eircode: ");
        }
    }
    public void setEmail(String email) {
        int positionOfSymbol=email.indexOf("@");
        String afterSymbol=email.substring(positionOfSymbol);
        if(afterSymbol.equals("@gmail.com") || afterSymbol.equals("@yahoo.com") || afterSymbol.equals("@outlook.com") || afterSymbol.equals("@icloud.com")){
            this.email = email;
        }
        else{
            email=JOptionPane.showInputDialog("Invalid email. Please re-enter: ");
        }
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
