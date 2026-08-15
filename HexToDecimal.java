import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();
        int n = Integer.parseInt(hex, 16);

        System.out.println(n);
    }
}