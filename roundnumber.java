import java.util.Scanner;
public class roundnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    count++;
                }

                n = n / 10;
            }

            System.out.println(count);
        }
    }
}