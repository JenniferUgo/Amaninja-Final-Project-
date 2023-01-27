package utilities;

public class Commenter {
            String firstName;
            String emailAddress;
            String phoneNumber;
            String comment;

    public Commenter(String firstName, String emailAddress, String phoneNumber, String comment) {
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

}
