
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr1[][]=new int[n][m];

        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();

        }
    }
}
