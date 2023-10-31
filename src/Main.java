import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr1[]=new int[3];
        for(int i=0; i< arr1.length; i++){
         arr1[i]=(int)(Math.random()*3);
        }
        System.out.println(Arrays.toString(arr1));
    }
}