package People;

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
