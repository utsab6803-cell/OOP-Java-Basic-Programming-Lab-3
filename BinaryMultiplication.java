import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);

        System.out.println(Integer.toBinaryString(n1 * n2));
    }
}