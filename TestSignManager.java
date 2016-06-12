import java.util.Scanner;

public class TestSignManager {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        String s = scan.nextLine();
        String t = scan.nextLine();

        SignManager sm = new SignManager(s, t);
        System.out.println(sm);
    }
}

