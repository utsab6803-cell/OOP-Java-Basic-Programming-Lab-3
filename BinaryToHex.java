import java.util.Scanner;

public class BinaryToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        int n = Integer.parseInt(binary, 2);
        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}