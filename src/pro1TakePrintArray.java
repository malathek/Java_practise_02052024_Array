import java.util.Scanner;

public class pro1TakePrintArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks for all 5 Subjects");
        int[] arr_Marks = new int[5];

        for (int j = 0; j < arr_Marks.length; j++) {

            arr_Marks[j] = sc.nextInt();
        }


        for (int i = 0; i < arr_Marks.length; i++) {

            System.out.println("Your Subject mark is " + arr_Marks[i] );

        }
        sc.close();
    }
}
