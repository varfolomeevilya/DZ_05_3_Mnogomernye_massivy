import java.util.Arrays;

public class Task05 {
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int max=arr1[0];
        for(int i=0; i< arr1.length; i++){
             arr1[i]=((int)(Math.random()*20)-10);
             if(max<arr1[i]){
                 max=arr1[i];
             }
             System.out.println(Arrays.toString(arr1));
            System.out.println("Max"+ max);
        }
    }
}
