import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ходом коня");
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int arr1[][]=new int[n][m];
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr1.length; j++){
                arr1[i][j]=((int)(Math.random()*5)+70);
                if(i==0 || i==n-1 || j==0 || j==m-1 ){
                    arr1[i][j]= '0';
                }else{
                    arr1[i][j]=' ';
                }
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }
}
