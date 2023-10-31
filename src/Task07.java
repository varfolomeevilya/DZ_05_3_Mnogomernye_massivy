

public class Task07 {
    public static void main(String[] args) {
        int[][]arr2D = new int[][]{
                { 1,   2,  3,   4 },
                { 8,   7,  6,   5 },
                { 9,  10, 11,  12 },
                { 16, 15, 14,  13 }
        };
        for(int i=0; i< arr2D.length; i++){
                for(int j=0; j<arr2D[i].length; j++){

                    System.out.printf("%4d ", arr2D[i][j]);
                }
                System.out.println();
        }
    }
}


