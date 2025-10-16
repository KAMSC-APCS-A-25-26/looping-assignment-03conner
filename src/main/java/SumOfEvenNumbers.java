import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int num = sc.nextInt();
        int sum;
        sum = 0;
        if (num >= 2){
            for(int i = 0; i <= num; i +=2){

                    sum += i;

            }
            System.out.println("The sum of even numbers between 2 and " + num + " is " + sum);
        }
        else{
            System.out.println("Error: Input must be 2 or greater.");
        }


    }
}
