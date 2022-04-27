import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
    int []kk = new int[input];

    for(int i=0; i<input; i++){
        kk[i]=scanner.nextInt();
    }
    for(int i=0; i<input; i++){
        System.out.println(kk[i]);
    }
    }

}