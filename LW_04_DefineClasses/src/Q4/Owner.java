package Q4;

public class Owner {
    // Data members
    private String ownerName;
    private String phoneNo;

    // No argument constructor
    public Owner() {
        ownerName = "Unknown";
        phoneNo = "N/A";
    }

    // Parameterized constructor
    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    // Getter methods
    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // Setter methods
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
