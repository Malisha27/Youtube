import java.util.Scanner;

//1.Pattern
//    * * * *
//    * * * *
//    * * * *
//    * * * *
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number for first pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
