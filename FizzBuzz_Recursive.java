import java.util.Scanner;

public class FizzBuzz_Recursive {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = console.nextInt();
        fizzbuzz(n);
        
    }

    public static void fizzbuzz(int n){
        if (n > 0) {
            fizzbuzz(n-1);
            if (n%3 == 0 && n %5==0){
                System.out.println("FizzBuzz");
            }
            else if (n %3 == 0){
                System.out.println("Fizz");
            }
            else if (n %5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(n);
            }
        }
    }
}
