import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int arr1[][] = new int[n][t];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                if (i > 0) {
                    System.out.printf("%4d ", i);
                }
                if (j == 0) {
                    System.out.printf("%4d ", j);
                }
                if(i<0){
                    System.out.printf("%4d",i);
                }
            }
            System.out.println();
        }
    }
}

