package People;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Member {
    private String firstName;
    private String lastName;
    private String eircode;
    private String email;
    private GregorianCalendar dateOfBirth;
    private String memberId;
    private GregorianCalendar dateOfJoin;

    public Member(String firstName,String lastName,String eircode,String email,GregorianCalendar dateOfBirth,String memberId,GregorianCalendar dateOfJoin){
        setFirstName(firstName);
        setLastName(lastName);
        setEircode(eircode);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setMemberId(memberId);
        setDateOfJoin(dateOfJoin);
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
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
    public String getMemberId() {
        return memberId;
    }
    public GregorianCalendar getDateOfJoin() {
        return dateOfJoin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEircode(String eircode) {
        this.eircode = eircode;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public void setDateOfJoin(GregorianCalendar dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String toString(){
        int dobDay=getDateOfBirth().get(Calendar.DAY_OF_MONTH);
        int dobMonth=getDateOfBirth().get(Calendar.MONTH);
        int dobYear=getDateOfBirth().get(Calendar.YEAR);
        String dobStr=dobDay+"-"+dobMonth+"-"+dobYear;

        int dojDay=getDateOfJoin().get(Calendar.DAY_OF_MONTH);
        int dojMonth=getDateOfJoin().get(Calendar.MONTH);
        int dojYear=getDateOfJoin().get(Calendar.YEAR);
        String dojStr=dojDay+"-"+dojMonth+"-"+dojYear;

        String str="Member's Name: "+getFirstName()+" "+getLastName()+
                "\nMember's Eircode: "+getEircode()+
                "\nMember's Email: "+getEmail()+
                "\nMember's Date of Birth: "+dobStr+
                "\nMember's ID: "+getMemberId()+
                "\nMember's Date of Joining: "+dojStr;

        return str;
    }
}
