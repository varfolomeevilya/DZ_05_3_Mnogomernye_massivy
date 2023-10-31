import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int arr2[]=new int[arr1.length];

        for(int i=0; i< arr1.length; i++){
            arr1[i]=((int)(Math.random()*555)-300);
            if(i>0){
                arr2[i]=arr1[i];
            }
            if(i==0){
                arr2[i]=arr1[i];
            }
            if(i<0){
                arr2[i]=arr1[i];
            }
            System.out.println(Arrays.toString(arr1));
            System.arraycopy(arr1, 0, arr2,10,4);
            System.out.println(Arrays.toString(arr2));
        }
    }
}
