public class fizzbuzz {
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++){
            if (i/3.0 == i/3 && i/5.0 == i/5) {
                System.out.println("FizzBuzz");
            }
            if (i/3.0 == i/3 && i/5.0 != i/5) {
                System.out.println("Fizz");
            }
            if (i/5.0 == i/5 && i/3.0 != i/3) {
                System.out.println("Buzz");
            }
            if (i/5.0 != i/5 && i/3.0 != 3) {
                System.out.println(i);
            }
        }
        }
    }