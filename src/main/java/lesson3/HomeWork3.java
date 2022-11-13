package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        createArr(3,6);
        findMinMax();
    }

    private static void findMinMax() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
    }

    private static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i= 0; i < len; i++ ){
            arr[i]= initialValue;
        }
        return arr ;
    }

    private static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 4; j++) {
                if ((i == j) || ((i + j) == 4-1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i]*=2;
            }
            //System.out.println(arr[i]);
        }
    }

    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i]=i+1;
        }
    }

    private static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==  1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            };
        }
    }
}
