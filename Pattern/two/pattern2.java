//
//2.      *
//        **
//        ***
//        ****
//        *****


import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        System.out.println("Enter a number for second pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =0; i<n ; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
