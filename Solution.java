import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scan.nextInt();
        System.out.println(isPrime(x));
    }

    public static boolean isPrime(int x){
        if(x <= 1)
         return false;
        for(int i = 2; i < x - 1; i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }
}