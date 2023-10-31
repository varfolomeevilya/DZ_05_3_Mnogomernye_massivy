import java.util.Arrays;

public class Task02 {
    public static void main(String[] args){
    int arr1[]=new int[20];

    for(int i=0; i< arr1.length; i++){
        arr1[i]=((int)(Math.random()*31)-10);
    }
    System.out.println(Arrays.toString(arr1));
    }
}
