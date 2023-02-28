public class PositiveNegative {
    public static void main(String[] args) {
        int num = -7;

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is neither positive nor negative.");
        }
    }
}