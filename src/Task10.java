import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество рядов");
        int n= scanner.nextInt();
        System.out.println("Количество мест");
        int m= scanner.nextInt();
        System.out.println("Количество билетов");
        int k= scanner.nextInt();
        System.out.println("Количество занятых мест");
        int r= scanner.nextInt();
      int arr1[][]= new int[n][m];
      for(int i=0; i< arr1.length; i++){
          for(int j=0; j< arr1[i].length; j++){
              System.out.printf("%4d ", arr1[i][j]);
          }
          for(int z=0; z<k; z++){
              System.out.printf("%4d",z);
          }
         for(int x=0; x<r; x++){
             System.out.printf("%4d",r);
         }
          System.out.println();
      }
    }
}
