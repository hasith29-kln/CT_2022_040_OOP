package Q4;

public class TestBicycle {
    static void main(String[] args) {
        Bicycle b1 = new Bicycle("Hasitha", "0771234567");

        b1.displayOwnerInfo();

        // Change owner
        Owner newOwner = new Owner("Saman", "0719876543");
        b1.setOwner(newOwner);

        System.out.println("\nAfter changing owner:");
        b1.displayOwnerInfo();

    }
}
