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
    private String[] allNames;
    private String[] allEircodes;
    private String[] allEmails;
    private String[] allDateOfBirths;
    private int[] allMemberIds;

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

        allNames=new String[10];
        allEircodes=new String[10];
        allEmails=new String[10];
        allDateOfBirths=new String[10];
        allMemberIds=new int[10];
        //https://stackoverflow.com/questions/16462163/java-how-to-access-an-arraylist-of-another-class
    }

    public Member(String firstName,String lastName,String eircode,String email,String dateOfBirth,int memberId,String[] allNames,String[] allEircodes,String[] allEmails,String[] allDateOfBirths,int[] allMemberIds){
        setFirstName(firstName);
        setLastName(lastName);
        setEircode(eircode);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setMemberId(memberId);

        setAllNames(allNames);
        setAllEircodes(allEircodes);
        setAllEmails(allEmails);
        setAllDateOfBirths(allDateOfBirths);
        setAllMemberIds(allMemberIds);
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

    public String[] getAllNames() {
        return allNames;
    }
    public String[] getAllEircodes() {
        return allEircodes;
    }
    public String[] getAllEmails() {
        return allEmails;
    }
    public String[] getAllDateOfBirths() {
        return allDateOfBirths;
    }
    public int[] getAllMemberIds() {
        return allMemberIds;
    }

    public void setFirstName(String firstName) {
        while(firstNameTrue==false) {
            if (firstName.equals("")) {
                firstName = JOptionPane.showInputDialog("Field is empty.\nPlease enter a Forename: ");
            } else {
                for (int i = 0; i < firstName.length(); i++) {
                    if (Character.isLetter(firstName.charAt(i))) {
                        this.firstName = firstName;
                        firstNameTrue = true;
                    } else {
                        firstName = JOptionPane.showInputDialog("Forename must only be letters.\nPlease re-enter Forename: ");
                    }
                }
            }
        }
    }
    public void setLastName(String lastName) {
        while(lastNameTrue==false) {
            if (lastName.equals("")) {
                lastName = JOptionPane.showInputDialog("Field is empty.\nPlease enter a Surname: ");
            } else {
                for (int i = 0; i < lastName.length(); i++) {
                    if (Character.isLetter(lastName.charAt(i)) || lastName.charAt(i) == ' ' || lastName.charAt(i) == '-' || lastName.charAt(i) == '\'') {
                        this.lastName = lastName;
                        lastNameTrue = true;
                    } else {
                        lastName = JOptionPane.showInputDialog("Surname must only be letters.\nPlease re-enter Surname: ");
                    }
                }
            }
        }
    }
    public void setEircode(String eircode) {
        while(eircodeTrue==false) {
            if (eircode.equals("")) {
                eircode = JOptionPane.showInputDialog("Field is empty.\nPlease enter an Eircode: ");
            } else {
                if (eircode.length() == 7) {
                    if (Character.isLetter(eircode.charAt(0))) {
                        if (Character.isDigit(eircode.charAt(1)) && Character.isDigit(eircode.charAt(2))) {
                            for (int i = 3; i < 7; i++) {
                                if (Character.isDigit(eircode.charAt(i)) || Character.isLetter(eircode.charAt(i))) {
                                    this.eircode = eircode;
                                    eircodeTrue = true;
                                } else {
                                    eircode = JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                                }
                            }
                        } else {
                            eircode = JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                        }
                    } else {
                        eircode = JOptionPane.showInputDialog("Invalid eircode. Please re-enter: ");
                    }
                } else {
                    eircode = JOptionPane.showInputDialog("Eircode must be only 7 characters long. Re-enter the Eircode: ");
                }
            }
        }
    }
    public void setEmail(String email) {
        int positionOfSymbol=email.indexOf("@");
        String afterSymbol=email.substring(positionOfSymbol);
        while(emailTrue==false) {
            if (email.equals("")) {
                email = JOptionPane.showInputDialog("Field is empty.\nPlease enter an Email: ");
            } else {
                if (afterSymbol.equals("@gmail.com") || afterSymbol.equals("@yahoo.com") || afterSymbol.equals("@outlook.com") || afterSymbol.equals("@icloud.com")) {
                    this.email = email;
                    emailTrue = true;
                } else {
                    email = JOptionPane.showInputDialog("Invalid email. Please re-enter: ");
                }
            }
        }
    }
    public void setDateOfBirth(String dateOfBirth) {
        GregorianCalendar currentDate=new GregorianCalendar();
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        String userYearStr=dateOfBirth.substring(6);
        while (dateOfBirthTrue==false) {
            if (dateOfBirth.equals("")) {
                dateOfBirth = JOptionPane.showInputDialog("Field is empty.\nPlease enter a Date of Birth: ");
            } else if (dateOfBirth.length() == 10) {
                if (Character.isDigit(dateOfBirth.charAt(0)) && Character.isDigit(dateOfBirth.charAt(1))) {
                    if (Character.isDigit(dateOfBirth.charAt(3)) && Character.isDigit(dateOfBirth.charAt(4))) {
                        if (Character.isDigit(dateOfBirth.charAt(6)) && Character.isDigit(dateOfBirth.charAt(7)) && Character.isDigit(dateOfBirth.charAt(8)) && Character.isDigit(dateOfBirth.charAt(9))) {
                            int userYear = Integer.parseInt(userYearStr);
                            if (currentYear - userYear < 18) {
                                JOptionPane.showMessageDialog(null, "Member is too young to join.\nMust be 18 or older", "Age Verification", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                this.dateOfBirth = dateOfBirth;
                                dateOfBirthTrue = true;
                            }
                        } else {
                            email = JOptionPane.showInputDialog("Month value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                        }
                    } else {
                        email = JOptionPane.showInputDialog("Month value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                    }
                } else {
                    email = JOptionPane.showInputDialog("Day value was entered incorrectly.\nPlease re-enter Date of Birth with format DD-MM-YYYY:");
                }
            } else {
                email = JOptionPane.showInputDialog("Field is not the right length.\nPlease follow the format DD-MM-YYYY: ");
            }
        }
    }
    public void setMemberId(int memberId) {
        if(firstNameTrue==true && lastNameTrue==true && eircodeTrue==true && emailTrue==true && dateOfBirthTrue==true){
            this.memberId = memberId;
        }
    }

    public void setAllNames(String[] allNames) {
        this.allNames = allNames;
    }
    public void setAllEircodes(String[] allEircodes) {
        this.allEircodes = allEircodes;
    }
    public void setAllEmails(String[] allEmails) {
        this.allEmails = allEmails;
    }
    public void setAllDateOfBirths(String[] allDateOfBirths) {
        this.allDateOfBirths=allDateOfBirths;
    }
    public void setAllMemberIds(int[] allMemberIds) {
        this.allMemberIds = allMemberIds;
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
