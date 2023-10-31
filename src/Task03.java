

public class Task03 {
    public static void main(String[] args) {

        int arr1[] =new int[200];
        int single_digit = 4;
        int two_digit = 45;
        int three_digit = 56;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > 0) {
                arr1[i] = single_digit;
            }
            if (arr1[i] == 0) {
               arr1[i]=two_digit;
            }
            if (arr1[i] < 0) {
                three_digit++;
            }
            System.out.printf("%4d ", single_digit);
            System.out.printf("%4d ", two_digit);
            System.out.printf("%4d ", three_digit);
        }

        System.out.println();
    }


}

