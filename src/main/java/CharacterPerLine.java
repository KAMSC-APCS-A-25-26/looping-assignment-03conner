import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cheese;
        System.out.println("Enter a word: ");
        cheese = sc.nextLine();
        for (int t = 0; t < cheese.length(); t ++){
            System.out.println(cheese.charAt(t));
        }



    }
}
