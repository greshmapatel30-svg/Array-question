public class Qsix {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                System.out.print(Math.abs(arr[i]) + " ");
            } else {
                arr[index] = -arr[index];
            }
        }
    }
}

