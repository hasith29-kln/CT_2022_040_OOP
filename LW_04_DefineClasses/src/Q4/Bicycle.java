package Q4;

public class Bicycle {
    private Owner owner;

    // Default constructor
    public Bicycle() {
        owner = new Owner();
    }

    // Parameterized constructor
    public Bicycle(String name, String num) {
        owner = new Owner(name, num);
    }

    // Getter method
    public Owner getOwner() {
        return owner;
    }

    // Setter method
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Display owner details
    public void displayOwnerInfo() {
        System.out.println("Owner Name: " + owner.getOwnerName());
        System.out.println("Phone No: " + owner.getPhoneNo());
    }
}
