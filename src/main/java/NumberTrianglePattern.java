import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a positive integer: ");
      int num = sc.nextInt();
      for(int i = 1; i <= num; i++){
          for (int k = 1; k < i; k++){
              System.out.print(k + " ");
          }
          System.out.println(i);
      }
    }
}