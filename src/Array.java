import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of rows do you want for your matrix? \nPlease enter:");
        int rows = sc.nextInt();
        System.out.println("How many number of columns do you want for your matrix? \nPlease enter:");
        int columns = sc.nextInt();
        int [][]arr= new int[rows][columns];
        System.out.println("Please enter the numbers with a space and with respect to the rows to create the matrix: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] =sc.nextInt();

            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Thank you for using our software!!");
    }
}