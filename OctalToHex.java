import java.util.Scanner;

public class OctalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();
        int n = Integer.parseInt(octal, 8);

        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}