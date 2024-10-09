import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pass pass = new Monthly();
        pass.priceDecider("cycle", "monthly");
    }

}