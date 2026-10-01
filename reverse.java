public class reverse {
    public static void main(String[] args) {
        int number = 5439;
        int reversednumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversednumber = reversednumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversednumber);
    }
}

