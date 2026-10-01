public class CompositeNumbers {
    public static void main(String[] args) {

        System.out.println("Composite numbers from 1 to 100:");

        for (int n = 1; n <= 100; n++) {
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count > 3) {
                System.out.print(n + " ");
            }
        }
    }
}