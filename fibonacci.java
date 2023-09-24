public class fibonacci {

        public static int fibonacci(long n) {
            if (n == 1) {
                return 1;
            } else if (n == 0) {
                return 0;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);

            }
        }

        public static void main(String[] args) {
            System.out.print(fibonacci(41));
        }

}
