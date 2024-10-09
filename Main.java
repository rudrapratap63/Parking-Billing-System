import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         User user = new Faculty("Rudra","22Egjcs182");
         user.getInfo();
         User user1 = new Student("Rudra","1234");
         user1.getInfo();

    }

}