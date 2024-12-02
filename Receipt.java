// Receipt class implements the Printer interface
class Receipt implements Printer {
    private User user;

    // Constructor to accept a User object
    Receipt(User user) {
        this.user = user;
    }

    // Implement the printUserDetails method from Printer interface

    public void printUserDetails(User user) {
        System.out.println("User ID: " + user.id + ", Name: " + user.name);
        System.out.println("Role: " + user.getRole());
        System.out.println("Vehicle Type: " + user.getVehicleType());
    }

    // Method to generate receipt (extend as needed)
    public void generateReceipt() {
        System.out.println("------ Receipt ------");
        printUserDetails(user); // Print the user's details on the receipt
        System.out.println("---------------------");
    }
}
