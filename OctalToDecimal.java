import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();
        System.out.println(Integer.parseInt(octal, 8));
    }
}