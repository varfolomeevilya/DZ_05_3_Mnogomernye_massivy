import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0; i<1000000; i++){
            for (int j=n; j<i; j++){
                if(i>0){
                    System.out.print("одна тысяча сто двадцать пять," +
                            "две тысячи");
                }

                System.out.println();
            }
        }
    }
}
