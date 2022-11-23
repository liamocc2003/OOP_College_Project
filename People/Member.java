package People;

import javax.swing.*;
import java.util.*;

public class Member {
    private String firstName;
    private String lastName;
    private String eircode;
    private String email;
    private String dateOfBirth;
    private boolean firstNameTrue;
    private boolean lastNameTrue;
    private boolean eircodeTrue;
    private boolean emailTrue;
    private boolean dateOfBirthTrue;
    private static int memberId=10000;
    private ArrayList<String> allFirstNames;
    private ArrayList<String> allLastNames;
    private ArrayList<String> allNames;
    private ArrayList<String> allEircodes;
    private ArrayList<String> allEmails;
    private ArrayList<String> allDateOfBirths;
    private ArrayList<Integer> allMemberIds;

    public Member(){
        firstName="No data available";
        lastName="No data available";
        eircode="No data available";
        email="No data available";
        dateOfBirth="No data available";
        firstNameTrue=false;
        lastNameTrue=false;
        eircodeTrue=false;
        emailTrue=false;
        dateOfBirthTrue=false;

        allFirstNames=new ArrayList<String>();
        allFirstNames.add(firstName);
        allLastNames=new ArrayList<String>();
        allLastNames.add(lastName);
        allEircodes=new ArrayList<String>();
        allEircodes.add(eircode);
        allEmails=new ArrayList<String>();
        allEmails.add(email);
        allDateOfBirths=new ArrayList<String>();
        allDateOfBirths.add(dateOfBirth);
        allMemberIds=new ArrayList<Integer>();
        allMemberIds.add(memberId);
        //https://stackoverflow.com/questions/16462163/java-how-to-access-an-arraylist-of-another-class
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
    public ArrayList<String> getAllFirstNames() {
        return allFirstNames;
    }
    public ArrayList<String> getAllLastNames() {
        return allLastNames;
    }
    public ArrayList<String> getAllEircodes() {
        return allEircodes;
    }
    public ArrayList<String> getAllEmails() {
        return allEmails;
    }
    public ArrayList<String> getAllDateOfBirths() {
        return allDateOfBirths;
    }
    public ArrayList<Integer> getAllMemberIds() {
        return allMemberIds;
    }
    public ArrayList<String> getAllNames() {
        return allNames;
    }

    public void setFirstName(String firstName) {
        if(firstName.equals("")){
            firstName=JOptionPane.showInputDialog("Field is empty.\nPlease enter a Forename: ");
        }
        else{
            for (int i=0;i<firstName.length();i++){
                if(Character.isLetter(firstName.charAt(i))){
                    this.firstName = firstName;
                    firstNameTrue=true;
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
                    lastNameTrue=true;
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
                                eircodeTrue=true;
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
                emailTrue=true;
            }
            else{
                email=JOptionPane.showInputDialog("Invalid email. Please re-enter: ");
            }
        }
    }
    public void setDateOfBirth(String dateOfBirth) {
        GregorianCalendar currentDate=new GregorianCalendar();
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        String userDayStr=dateOfBirth.substring(0,2);
        String userMonthStr=dateOfBirth.substring(3,5);
        String userYearStr=dateOfBirth.substring(6);
        if(dateOfBirth.equals("")){
            dateOfBirth=JOptionPane.showInputDialog("Field is empty.\nPlease enter a Date of Birth: ");
        }
        else if(dateOfBirth.length()!=1){
            for(int i=0;i<=1;i++){
                if(Character.isDigit(userDayStr.charAt(i))){
                    for(i=3;i<=4;i++){
                        if(Character.isDigit(userMonthStr.charAt(i))){
                            for(i=6;i<=9;i++){
                                if(Character.isDigit(userYearStr.charAt(i))){
                                    int userYear=Integer.parseInt(userYearStr);
                                    if(currentYear-userYear<18){
                                        JOptionPane.showMessageDialog(null,"Member is too young to join.\nMust be 18 or older","Age Verification",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        this.dateOfBirth = dateOfBirth;
                                        dateOfBirthTrue=true;
                                    }
                                }
                                else{
                                    JOptionPane.showInputDialog("Month value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                                }
                            }
                        }
                        else{
                            JOptionPane.showInputDialog("Month value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                        }
                    }
                }
                else{
                    JOptionPane.showInputDialog("Day value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                }
            }
        }
        else{
            JOptionPane.showInputDialog("Field is not the right length.\nPlease follow the format DD-MM-YYYY: ");
        }
    }
    public void setMemberId(int memberId) {
        if(firstNameTrue==true && lastNameTrue==true && eircodeTrue==true && emailTrue==true && dateOfBirthTrue==true){
            this.memberId = ++memberId;
        }
    }

    public String toString(){
        String str;
        if(firstNameTrue==true && lastNameTrue==true && eircodeTrue==true && emailTrue==true && dateOfBirthTrue==true){
            str="Member's Name: "+getFirstName()+" "+getLastName()+
                    "\nMember's Eircode: "+getEircode()+
                    "\nMember's Email: "+getEmail()+
                    "\nMember's Date of Birth: "+getDateOfBirth()+
                    "\nMember's ID: L"+getMemberId();

            return str;
        }
        else{
            return str="Invalid data entered! Please enter required fields correctly.";
        }
    }
}
